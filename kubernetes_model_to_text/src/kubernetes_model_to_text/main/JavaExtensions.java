package kubernetes_model_to_text.main;

public class JavaExtensions {

	public static Integer counter = 0;

	public String padZeros(Integer i){

        return  String.format("%02d", i + counter);
    }
	public String formatStrings(String input){
        try {
            // try if it fails if it does not, we have to format it so kubernetes can read it as a string.
            Integer.parseInt(input);
            return "\"" +input + "\"";

        } catch (NumberFormatException e) {
            return input; // good it not parsable return it as it is
        }
    }
}
