package LinkedList;
import java.util.LinkedList;
public class InsertEnd{
public static void main(String[] args){
LinkedList<String> l_listobj=new LinkedList<>();
l_listobj.add("Red");
l_listobj.add("Blue");
l_listobj.add("Green");
l_listobj.add("Yellow");
l_listobj.add("White");
System.out.println("Before: "+l_listobj);
l_listobj.offerLast("Pink");
System.out.println("After: "+l_listobj);
}
}
