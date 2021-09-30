package Assignment2;

import java.util.Scanner;

   public class FindLngthAndName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text");
        String text =input.nextLine();
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length()-1));
    }
}