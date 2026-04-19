package com.java;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/VisitServlet")
public class VisitServlet extends HttpServlet{
protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String name=request.getParameter("uname");
int count=0;
Cookie cookies[]=request.getCookies();
if(cookies!=null){
for(int i=0;i<cookies.length;i++){
if(cookies[i].getName().equals("visitCount")){
count=Integer.parseInt(cookies[i].getValue());
}
}
}
count++;
Cookie nameCookie=new Cookie("username",name);
nameCookie.setMaxAge(60);
Cookie countCookie=new Cookie("visitCount",String.valueOf(count));
countCookie.setMaxAge(60);
response.addCookie(nameCookie);
response.addCookie(countCookie);
out.println("<h2>Welcome back "+name+"! you have visited this page "+count+" times</h2>");
out.println("<h3>Cookie List with Values:</h3>");
Cookie c[]=request.getCookies();
if(c!=null){
for(int i=0;i<c.length;i++){
out.println("Name: "+c[i].getName()+" Value: "+c[i].getValue()+" MaxAge: "+c[i].getMaxAge()+"<br>");
}
}
out.println("<p>Cookie expiry is set to 60 seconds. After 1 minute, refresh to see reset.</p>");
out.println("<br><a href='index.html'>Go Back</a>");
}
}
