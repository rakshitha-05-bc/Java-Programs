package Strings;
import java.util.Scanner;
import java.util.Random;

public class p9{

static String generateRandomString(int length){
String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
Random r=new Random();
String result="";

for(int i=0;i<length;i++){
int index=r.nextInt(chars.length());
result=result+chars.charAt(index);
}

return result;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.print("Enter required length: ");
int len=sc.nextInt();

String output=generateRandomString(len);

System.out.println("Random String: "+output);
}
}
