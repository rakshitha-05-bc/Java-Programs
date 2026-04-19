package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ColorSort{
public static void main(String[] args){
ArrayList<String> colors=new ArrayList<>();
colors.add("Red");
colors.add("Blue");
colors.add("Green");
colors.add("Yellow");
colors.add("White");
System.out.println("Before Sorting: "+colors);
Collections.sort(colors);
System.out.println("After Sorting: "+colors);
}
}
