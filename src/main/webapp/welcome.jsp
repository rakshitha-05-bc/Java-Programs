<%
String name=request.getParameter("uname");
session.setAttribute("user",name);
session.setMaxInactiveInterval(60);
%>
<html>
<body>
<h2>Hello <%=name%>!</h2>
<a href="check.jsp">Check Session After 1 Minute</a>
</body>
</html>
