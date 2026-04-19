package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ColorSubList{
public static void main(String[] args){
ArrayList<String> colors=new ArrayList<>();
colors.add("Red");
colors.add("Blue");
colors.add("Green");
colors.add("Yellow");
colors.add("White");
System.out.println("Original List: "+colors);
List<String> sub=colors.subList(0,2);
System.out.println("Extracted Elements: "+sub);
}
}
