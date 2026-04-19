package Swings;
import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;

public class CountryCapitalList extends JFrame{
JList<String> list;

CountryCapitalList(){

String countries[]={"USA","India","Vietnam","Canada","Denmark","France","Great Britain","Japan","Africa","Greenland","Singapore"};

HashMap<String,String> capitals=new HashMap<>();
capitals.put("USA","Washington D.C.");
capitals.put("India","New Delhi");
capitals.put("Vietnam","Hanoi");
capitals.put("Canada","Ottawa");
capitals.put("Denmark","Copenhagen");
capitals.put("France","Paris");
capitals.put("Great Britain","London");
capitals.put("Japan","Tokyo");
capitals.put("Africa","Addis Ababa");
capitals.put("Greenland","Nuuk");
capitals.put("Singapore","Singapore");

list=new JList<>(countries);

list.addListSelectionListener(new ListSelectionListener(){
public void valueChanged(ListSelectionEvent e){
if(!e.getValueIsAdjusting()){
String country=list.getSelectedValue();
System.out.println("Capital of "+country+" is: "+capitals.get(country));
}
}
});

add(new JScrollPane(list));

setSize(300,300);
setTitle("Country-Capital List");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

public static void main(String[] args){
new CountryCapitalList();
}
}

