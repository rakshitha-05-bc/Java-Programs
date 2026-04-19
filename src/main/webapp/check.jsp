<%
String user=(String)session.getAttribute("user");
%>
<html>
<body>
<%
if(user==null){
out.println("<h2>Session Expired</h2>");
}else{
out.println("<h2>Hello "+user+"! Session still active</h2>");
}
%>
</body>
</html>
