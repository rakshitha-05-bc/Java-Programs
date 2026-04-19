package LinkedList;
import java.util.LinkedList;
import java.util.Iterator;
public class ReverseLinkedList{
public static void main(String[] args){
LinkedList<String> list=new LinkedList<>();
list.add("Red");
list.add("Blue");
list.add("Green");
list.add("Yellow");
list.add("White");
System.out.println("List: "+list);
Iterator it=list.descendingIterator();
while(it.hasNext()){
System.out.println(it.next());
}
}
}
