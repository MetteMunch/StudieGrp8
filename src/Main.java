import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator regnemaskine = new Calculator();

        //printAssignment();//opgave 1
       // stringAssignment ();
        //System.out.println(regnemaskine.add(7,8));
        System.out.println(regnemaskine.divide(10,0));




    }
    public static void stringAssignment (){
        String wordToCheck = "refridgerator";
        System.out.println(wordToCheck);
        System.out.println(wordToCheck.length());
        System.out.println(wordToCheck.contains("e"));//printer true, hvis ordet indeholder det forespurgte
        }

    public static void printAssignment (){
        Scanner input = new Scanner(System.in);
        String inputToPrint;
        System.out.println("Skriv det du gerne vil have udskrevet");
        inputToPrint = input.nextLine();
        System.out.println(inputToPrint);
        System.out.println(inputToPrint.length());
    }


}