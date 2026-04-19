package Strings;
import java.util.Scanner;
public class p2{
public static int countOccurrences(String str,String sub){
int count=0;
int index=0;
while((index=str.indexOf(sub,index))!=-1){
count++;
index=index+sub.length();
}
return count;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter main string: ");
String mainStr=sc.nextLine();
System.out.print("Enter substring: ");
String subStr=sc.nextLine();
int result=countOccurrences(mainStr,subStr);
System.out.println("Occurrences: "+result);
}
}
