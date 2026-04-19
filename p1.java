package Strings;
import java.util.Scanner;
public class p1{
public static boolean isNullOrEmpty(String str){
return str==null||str.trim().isEmpty();
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string: ");
String s=sc.nextLine();
if(isNullOrEmpty(s)){
System.out.println("String is null or contains only whitespace");
}else{
System.out.println("String is not null or empty");
}
}
}

