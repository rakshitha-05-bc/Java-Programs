package Strings;
public class PerformanceTest{
public static void main(String[] args){
long startTime,endTime;
StringBuffer sbf=new StringBuffer();
startTime=System.currentTimeMillis();
for(int i=0;i<10000;i++){
sbf.append("AIET");
}
endTime=System.currentTimeMillis();
System.out.println("StringBuffer Time: "+(endTime-startTime)+" ms");
StringBuilder sbd=new StringBuilder();
startTime=System.currentTimeMillis();
for(int i=0;i<10000;i++){
sbd.append("AIET");
}
endTime=System.currentTimeMillis();
System.out.println("StringBuilder Time: "+(endTime-startTime)+" ms");
}
}
