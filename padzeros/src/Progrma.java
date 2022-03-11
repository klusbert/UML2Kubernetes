public class Progrma {


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(padZeros(i));
        }
    }

    private static String padZeros(Integer i){
        return  String.format("%02d", i);
    }



}
