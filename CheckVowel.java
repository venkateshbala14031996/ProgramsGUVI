import java.io.*;
import java.util.Scanner;
 class CheckVowel {
public static void main (String args[]) {
char character;
Scanner in=new Scanner(System.in);
character = in.next().charAt(0);
if(character == 'A' || character == 'a' || character == 'E' || character == 'e' || character == 'I' || character == 'i' || character == 'O' || character == 'o' || character == 'U' || character == 'u') {
 System.out.println("Vowel");
 }
 else {
   System.out.println("Consonant");
   }
 }
}


 
