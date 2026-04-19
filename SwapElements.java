package LinkedList;
import java.util.LinkedList;
import java.util.Collections;
public class SwapElements{
public static void main(String[] args){
LinkedList<String> l_list=new LinkedList<>();
l_list.add("Red");
l_list.add("Blue");
l_list.add("Green");
l_list.add("Yellow");
l_list.add("White");
System.out.println("Before Swap: "+l_list);
Collections.swap(l_list,0,2);
System.out.println("After Swap: "+l_list);
}
}
