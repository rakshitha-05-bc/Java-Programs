<%
Cookie cookies[]=request.getCookies();
%>
<html>
<body>
<h2>Active Cookies</h2>
<%
if(cookies!=null){
for(int i=0;i<cookies.length;i++){
out.println("Name: "+cookies[i].getName()+" Value: "+cookies[i].getValue()+"<br>");
}
}else{
out.println("No Cookies Found");
}
%>
</body>
</html>
