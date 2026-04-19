package LinkedList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class LinkedListIteration{
public static void main(String[] args){
LinkedList<String> list=new LinkedList<>();
list.add("Red");
list.add("Blue");
list.add("Green");
list.add("Yellow");
list.add("White");
System.out.println("List: "+list);
Iterator iteratorobj=list.listIterator(1);
while(iteratorobj.hasNext()){
System.out.println(iteratorobj.next());
}
}
}
