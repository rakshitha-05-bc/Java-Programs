package com.java;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet{
protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
int n=Integer.parseInt(request.getParameter("num"));
int flag=0;
if(n<=1){
flag=1;
}
for(int i=2;i<=n/2;i++){
if(n%i==0){
flag=1;
break;
}
}
if(flag==0){
out.println("<h2>"+n+" is a Prime Number</h2>");
}else{
out.println("<h2>"+n+" is NOT a Prime Number</h2>");
}
}
}
