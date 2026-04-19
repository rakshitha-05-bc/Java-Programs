package Strings;
import java.util.Scanner;

public class p10{

static int countWords(String str){
if(str==null || str.trim().equals("")){
return 0;
}

String[] words=str.trim().split("\\s+");
return words.length;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.print("Enter a string: ");
String input=sc.nextLine();

int result=countWords(input);

System.out.println("Number of words: "+result);
}
}
