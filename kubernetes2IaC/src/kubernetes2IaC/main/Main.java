package kubernetes2IaC.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.uml2.uml.Model;

import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import kubernetes_metamodel.Kubernetes_metamodelPackage;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import org.eclipse.core.runtime.IStatus;

import org.eclipse.m2m.qvt.oml.util.WriterLog;

import kubernetes_model_to_text.main.Generate;

public class Main {

	private final String PATH_TO_UML = "../KubernetesUMLDeplyoment/KubernetesUMLDeplyoment.uml";
	// private final String PATH_TO_UML =
	// "platform:/resource/KubernetesUMLDeplyoment/KubernetesUMLDeplyoment.uml";
	// private final String PATH_TO_UML = "../DAMprofile/DAM.profile.uml";
	// private final String PATH_TO_UML =
	// "../KubernetesUMLDeplyoment/KubernetesUMLDeplyoment.uml";
	private final String PATH_TO_QVT = "../KubernetesM2M/transforms/KubernetesM2MTransformation.qvto";
	private final String PATH_TO_RESULT_M2M = "./outputs/KubernetesUMLDeplyoment.model";
	private final String FOLDER_TO_RESULT_M2T = "./outputs/";

	private static ResourceSet resourceSet;

	public static void main(String[] args) throws IOException {

		Main transformer = new Main();
		transformer.transform();

	}

	private void transform() throws IOException {
		// checkFile(PATH_TO_UML);

		registerpackages();
		Model inputUMLmodel = loadUMLModel(PATH_TO_UML);
		System.out.println("Model name is: " + inputUMLmodel.getName() + " and label is:" + inputUMLmodel.getLabel());
		m2m(inputUMLmodel);
		System.out.println("M2M finished");
		m2t(PATH_TO_RESULT_M2M, FOLDER_TO_RESULT_M2T);
		System.out.println("M2T finished");

	}

	private void m2t(String modelfile, String outputFolder) throws IOException {
		URI modelURI = URI.createFileURI(modelfile);
		new Generate(modelURI, new File(outputFolder), new ArrayList<Object>()).doGenerate(null);

	}

	@SuppressWarnings("unused")
	private void checkFile(String path) {
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file); // opens a connection to an actual file
			System.out.println("file content: ");
			int r = 0;
			while ((r = fis.read()) != -1) {
				System.out.print((char) r); // prints the content of the file
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void m2m(Model inputModel) throws IOException {

		// Taken from: http://wiki.eclipse.org/QVTOML/Examples/InvokeInJava
		// Refer to an existing transformation via URI
		URI transformationURI = URI.createURI(PATH_TO_QVT);
		// create executor for the given transformation
		TransformationExecutor executor = new TransformationExecutor(transformationURI);

		// define the transformation input
		// Remark: we take the objects from a resource, however
		// a list of arbitrary in-memory EObjects may be passed
		ExecutionContextImpl context = new ExecutionContextImpl();

		context.setLog(new WriterLog(new OutputStreamWriter(System.out)));

		// create the input extent with its initial contents
		ModelExtent input = new BasicModelExtent(Arrays.asList(new EObject[] { inputModel }));
		// create an empty extent to catch the output
		ModelExtent output = new BasicModelExtent();

		// run the transformation assigned to the executor with the given
		// input and output and execution context -> ChangeTheWorld(in, out)
		// Remark: variable arguments count is supported
		ExecutionDiagnostic result = executor.execute(context, input, output);

		// check the result for success
		if (result.getSeverity() == Diagnostic.OK) {
			// the output objects got captured in the output extent
			List<EObject> outObjects = output.getContents();
			save(PATH_TO_RESULT_M2M, outObjects);
			// let's persist them using a resource
			// ResourceSet resourceSet2 = new ResourceSetImpl();
			// Resource outResource =
			// resourceSet2.getResource(URI.createURI(PATH_TO_RESULT_M2M), true);
			// outResource.getContents().addAll(outObjects);
			// outResource.save(Collections.emptyMap());
		} else {
			// turn the result diagnostic into status and send it to error log
			IStatus status = BasicDiagnostic.toIStatus(result);
			System.out.println(
					"STATUS: " + status.getCode() + " " + status.getMessage() + " " + status.getChildren().toString());
			if (status.getCode() == 130) {// Compilation error. I have to know from where I can get a better assignment
											// that harcoding the integer
				IStatus[] children = status.getChildren();
				showErrors(children, 0);

			}

			// Activator.getDefault().getLog().log(status);
		}

	}

	private void save(String folder, List<EObject> model) {

		// Ensure that you remove @generated or mark it @generated NOT
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("infrastructure", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource

		Resource resource = resSet.createResource(URI.createURI(folder));

		// add contents to the resource
		resource.getContents().addAll(model);

		// save the content.
		try {
			resource.save(m);
			// resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	private void showErrors(IStatus[] children, int indent) {
		for (IStatus child : children) {
			for (int i = 0; i < indent; i++) {
				System.out.print(" ");
			}
			System.out.println("Child: " + child.getMessage());
			if (child.getChildren() != null && child.getChildren().length > 0) {
				showErrors(child.getChildren(), indent + 1);
			}
		}

	}

	private void registerpackages() {

		// UML
		UMLResourcesUtil.init(getResourceSet());

		// Profile
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		URI profileUri;
		/*
		 * I've tried to make it work in several ways using the 'fragment' of the URI
		 * where the profile data is located, I could not make it work. The closest I
		 * reached was to import the profileUri and load the main package of the
		 * profile, but I could not make it read teh subpackage with the datatypes.
		 * URI.createURI("../KubernetesUMLProfile/KubernetesUMLProfile.profile.uml").
		 * appendFragment("_WGiBgZZAEey8KYCO0o_h7Q");
		 * System.out.println("Profile URI is: " + profileUri);
		 * 
		 * // get 0,0,1 . It seems that the appeded fragment does not work so well.
		 * System.out.println("Size of Contents at uri are: " +
		 * getResourceSet().getResource(profileUri, true)
		 * .getContents().get(0).eContents().get(0).eContents().get(1));
		 */

		profileUri = URI.createURI("../KubernetesUMLProfile/KubernetesUMLProfile.profile.uml");// NOT append any
																								// fragment. We look for
																								// it explicitly.
		System.out.println("Profile URI is: " + profileUri);

		// get 0,0,1 . It seems that eh appeded fragment does not work so well.
		System.out.println("Size of Contents at uri are: " + getResourceSet().getResource(profileUri, true)
				.getContents().get(0).eContents().get(0).eContents().get(1));

		// The next line would get the first element, but we need to navigate a bit
		// manually to find the profile.
		// EPackage mm1 = (EPackage) getResourceSet().getResource(profileUri,
		// true).getContents().get(0);
		EPackage mm1 = (EPackage) getResourceSet().getResource(profileUri, true).getContents().get(0).eContents().get(0)
				.eContents().get(1);

		EPackage.Registry.INSTANCE.put("http://kubernetesProfile", mm1);

		// Metamodel
		Kubernetes_metamodelPackage.eINSTANCE.eClass();

	}

	private Model loadUMLModel(String modelpath) throws IOException {

		final URI modelURI = URI.createURI(modelpath);
		// final URI modelURI =
		// URI.createFileURI(Paths.get(modelpath).toFile().getAbsolutePath());
		System.out.println("umlModelURI is: " + modelURI);

		Resource theResource = getResourceSet().getResource(modelURI, true);
		theResource.load(Collections.EMPTY_MAP);
		return (Model) theResource.getContents().get(0);

	}

	private static synchronized ResourceSet getResourceSet() {

		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		return resourceSet;
	}

}
