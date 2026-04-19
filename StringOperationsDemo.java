package Strings;
import java.util.*;
public class StringOperationsDemo{
public static void main(String[] args){
String str1="Hello";
String str2=new String("World");
System.out.println("String 1: "+str1);
System.out.println("String 2: "+str2);
System.out.println("\nLength of str1: "+str1.length());
System.out.println("Character at index 1: "+str1.charAt(1));
String s1="Java";
String s2="java";
System.out.println("\nEquals: "+s1.equals(s2));
System.out.println("Equals Ignore Case: "+s1.equalsIgnoreCase(s2));
System.out.println("CompareTo: "+s1.compareTo(s2));
String text="Welcome to Java Programming";
System.out.println("\nIndex of 'Java': "+text.indexOf("Java"));
System.out.println("Contains 'Welcome': "+text.contains("Welcome"));
System.out.println("\nSubstring (0-7): "+text.substring(0,7));
System.out.println("Substring from index 11: "+text.substring(11));
String modified=text.replace("Java","Python");
System.out.println("\nAfter Replace: "+modified);
System.out.println("Uppercase: "+text.toUpperCase());
System.out.println("Lowercase: "+text.toLowerCase());
String spaceStr="   Hello Java   ";
System.out.println("\nBefore Trim: '"+spaceStr+"'");
System.out.println("After Trim: '"+spaceStr.trim()+"'");
String concat=str1+" "+str2;
System.out.println("\nConcatenation (+): "+concat);
System.out.println("Concatenation (concat): "+str1.concat(str2));
String fruits="Apple,Banana,Orange";
String[] arr=fruits.split(",");
System.out.println("\nSplitting String:");
for(String f:arr){
System.out.println(f);
}
StringBuilder sb=new StringBuilder("Hello");
sb.append(" World");
sb.insert(5," Java");
sb.replace(0,5,"Hi");
System.out.println("\nStringBuilder Result: "+sb);
String name="Rakshitha";
int age=20;
String formatted=String.format("Name: %s, Age: %d",name,age);
System.out.println("\nFormatted String: "+formatted);
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter Email: ");
String email=sc.nextLine();
if(email.contains("@")&&email.contains(".")&&!email.startsWith("@")&&!email.endsWith(".")&&email.endsWith(".com")){
System.out.println("Valid Email");
}else{
System.out.println("Invalid Email");
}
sc.close();
}
}
