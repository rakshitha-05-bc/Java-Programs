package Strings;
import java.util.Scanner;
public class p4{
public static boolean isPalindrome(String str){
String cleaned=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
int i=0,j=cleaned.length()-1;
while(i<j){
if(cleaned.charAt(i)!=cleaned.charAt(j))return false;
i++;
j--;
}
return true;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string: ");
String s=sc.nextLine();
if(isPalindrome(s)){
System.out.println("String is a palindrome");
}else{
System.out.println("String is not a palindrome");
}
}
}
