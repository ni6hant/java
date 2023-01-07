public class isUpperCase {

    public static int isUpperCase(String inputString){
        System.out.println("UpperCase" + inputString.toUpperCase());
        System.out.println("compareTo" + inputString.compareTo(inputString.toUpperCase()));
        return inputString.compareTo(inputString.toUpperCase());
    }

    public static void main(String[] args) {

    }
}
