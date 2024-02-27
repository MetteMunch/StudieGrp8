import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //printAssignment();//opgave 1
        stringAssignment ();




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