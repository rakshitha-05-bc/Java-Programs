package Strings;
import java.util.Scanner;

public class p7{

static String truncate(String str,int length){
if(str.length()<=length){
return str;
}
else{
return str.substring(0,length)+"...";
}
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.print("Enter a string: ");
String input=sc.nextLine();

System.out.print("Enter required length: ");
int len=sc.nextInt();

String result=truncate(input,len);

System.out.println("Truncated String: "+result);
}
}

