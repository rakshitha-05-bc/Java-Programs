package ArrayList;
import java.util.ArrayList;
public class ColorRemove{
public static void main(String[] args){
ArrayList<String> colors=new ArrayList<>();
colors.add("Red");
colors.add("Blue");
colors.add("Green");
colors.add("Yellow");
colors.add("White");
System.out.println("Original List: "+colors);
colors.remove(1);
colors.remove("Blue");
System.out.println("Updated List: "+colors);
}
}
