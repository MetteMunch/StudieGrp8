public class Calculator {

    public Calculator(){
        //constructor
    }

    public int add(int number1, int number2){
        return number1 + number2;
    }
    public int subtract(int number1, int number2){
        return number1 - number2;
    }
    public int multiply(int number1, int number2){
        return number1 * number2;
    }
    public int divide(int number1, int number2){
        if(number2 == 0) {
            throw new IllegalArgumentException("Not possible to divide with 0");
        }
        return number1 / number2;
    }
}
