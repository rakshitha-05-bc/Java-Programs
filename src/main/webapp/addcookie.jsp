<%
String name=request.getParameter("name");
String domain=request.getParameter("domain");
int age=Integer.parseInt(request.getParameter("age"));
Cookie c=new Cookie(name,domain);
c.setMaxAge(age);
response.addCookie(c);
%>
<html>
<body>
<h2>Cookie Added Successfully</h2>
Name: <%=name%><br>
Domain: <%=domain%><br>
Max Age: <%=age%><br>
<a href="listcookies.jsp">Go to Active Cookie List</a>
</body>
</html>
