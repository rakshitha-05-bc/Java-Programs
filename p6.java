package Strings;
import java.util.Scanner;

public class p6{
static String capitalizeWords(String str){
String[] words=str.split(" ");
String result="";
for(int i=0;i<words.length;i++){
if(words[i].length()>0){
result=result+Character.toUpperCase(words[i].charAt(0))+words[i].substring(1).toLowerCase()+" ";
}
}
return result.trim();
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string: ");
String input=sc.nextLine();
String output=capitalizeWords(input);
System.out.println("Capitalized String: "+output);
}
}

