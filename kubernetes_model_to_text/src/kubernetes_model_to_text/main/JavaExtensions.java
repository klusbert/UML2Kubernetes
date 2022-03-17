package kubernetes_model_to_text.main;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import kubernetes_metamodel.EnviromentVariables;

import kubernetes_metamodel.Kubernetes_metamodelFactory;


public class JavaExtensions {

	
	
	public static Integer counter = 0;

	public String padZeros(Integer i){

        return  String.format("%02d", i + counter);
    }
	public String formatVariables(String input){
		
		String value = replaceVariables(input);
		
        try {
            // try if it fails if it does not, we have to format it so kubernetes can read it as a string.
            Integer.parseInt(input);
            return "\""+ value + "\"";

        } catch (NumberFormatException e) {
            return value; // good it not parsable return it as it is
        }
    }
	class Variables{
		String name;
		String value;
	}
	
	public List<EnviromentVariables> getEnVarsFromDisk(String fileName) throws IOException{
		Kubernetes_metamodelFactory obj = Kubernetes_metamodelFactory.eINSTANCE;
		

		List<EnviromentVariables> returnList =new ArrayList<>();
	    InputStream input = new FileInputStream(fileName);

        Properties prop = new Properties();
        prop.load(input);

        Set<Entry<Object,Object>> set = prop.entrySet() ;
        
        for(Entry<Object,Object> entry:set) {          	
        	EnviromentVariables env =obj.createEnviromentVariables();
        	env.setName(entry.getKey().toString());
        	env.setValue(entry.getValue().toString());
        	
        	returnList.add(env);
         }
        
        
        return returnList;
	}
	


	/**
	 * This method checks for variables and replace them with correct.
	 * @return 
	 */
	  public String replaceVariables(String input){
		  java.util.Random random = new  java.util.Random();
		  
		  
		  if(input.contains("$randomPW")){
	       	return input.replace("$randomPW",randomPassword(20));
	      }
	        return input;
	   }
	  /**
	   * Generates a random password with 20 characters.
	   * @return
	   */
	  private String randomPassword(int passwordLength){

	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        
	        java.util.Random random = new  java.util.Random();

	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < passwordLength; i++)
	        {
	            int randomIndex = random.nextInt(chars.length());
	            sb.append(chars.charAt(randomIndex));
	        }

	        // random password should always have quotes.
	        return sb.toString();
	    } 
}
