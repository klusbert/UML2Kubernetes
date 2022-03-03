package kubernetes2IaC.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.core.internal.runtime.Activator;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.core.runtime.IStatus;

public class Main {

	private final String PATH_TO_UML = "../KubernetesUMLDeplyoment/KubernetesUMLDeplyoment.uml";
	//private final String PATH_TO_UML = "platform:/resource/KubernetesUMLDeplyoment/KubernetesUMLDeplyoment.uml";
	//private final String PATH_TO_UML = "../DAMprofile/DAM.profile.uml";
	//private final String PATH_TO_UML = "../KubernetesUMLDeplyoment/KubernetesUMLDeplyoment.uml";
	private final String PATH_TO_QVT = "../KubernetesM2M/transforms/KubernetesM2MTransformation.qvto";
	private final String PATH_TO_RESULT_M2M = "../KubernetesM2M/output/KubernetesUMLDeplyoment.model";

	private static ResourceSet resourceSet;

	public static void main(String[] args) throws IOException {

		Main transformer = new Main();
		transformer.transform();

	}

	private void transform() throws IOException {
		//checkFile(PATH_TO_UML);

		 Model inputUMLmodel = loadUMLModel(PATH_TO_UML);
		 System.out.println("Model name is: " + inputUMLmodel.getName() + " and label is:" + inputUMLmodel.getLabel());


	}

	

	private Model loadUMLModel(String modelpath) throws IOException {
		// resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(XyzResource.FILE_EXTENSION,
		// XyzResource.Factory.INSTANCE);

		/*
		 * Some metamodels require a very complex setup for standalone usage. For
		 * example, if you want to use a generator targetting UML models in standalone,
		 * you NEED to use the following:
		 */
		UMLResourcesUtil.init(getResourceSet());

		final URI modelURI = URI.createURI(modelpath);
		//final URI modelURI = URI.createFileURI(Paths.get(modelpath).toFile().getAbsolutePath());
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
