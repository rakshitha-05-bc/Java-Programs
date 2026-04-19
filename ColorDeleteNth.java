package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class ColorDeleteNth{
public static void main(String[] args){
ArrayList<String> colors=new ArrayList<>();
colors.add("Red");
colors.add("Blue");
colors.add("Green");
colors.add("Yellow");
colors.add("White");
Scanner sc=new Scanner(System.in);
System.out.println("Original List: "+colors);
System.out.print("Enter index to delete: ");
int n=sc.nextInt();
if(n>=0 && n<colors.size()){
colors.remove(n);
System.out.println("Updated List: "+colors);
}else{
System.out.println("Invalid index");
}
}
}
