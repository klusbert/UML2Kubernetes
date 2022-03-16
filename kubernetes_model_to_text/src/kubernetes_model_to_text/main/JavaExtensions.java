
package kubernetes_model_to_text.main;

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

	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"#$";
	        
	        java.util.Random random = new  java.util.Random();

	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < passwordLength; i++)
	        {
	            int randomIndex = random.nextInt(chars.length());
	            sb.append(chars.charAt(randomIndex));
	        }

	        // random password should always have quotes.
	        return "\"" +sb.toString() + "\"";
	    } 
}
