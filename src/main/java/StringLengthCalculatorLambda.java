public class StringLengthCalculatorLambda {

    @FunctionalInterface
    interface StringLengthCalculator {
        int findLength(String inputString);
    }

    /*
    method that takes lambda expression as an argument, which is basically implementation
    of the 'findLength(String inputString)' of the above interface.
     */
    public static void printStringLength(StringLengthCalculator lengthCalculator, String inputString){
        System.out.println(lengthCalculator.findLength(inputString));

    }
    public static void main(String[] args) {
        //Writing a lambda that implements this method of the interface
        StringLengthCalculator calculatorFunction = inputString -> inputString.length();
        int length = calculatorFunction.findLength("Simranjot Singh Walia");
        System.out.println(length);


        //passing lambda as value
        printStringLength(inputString -> inputString.length(), "Ahluwalia");
    }
}
