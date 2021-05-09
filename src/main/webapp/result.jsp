<%@ page import="java.util.*" %>
<%@ page import="java.io.PrintWriter" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="cdt" uri="http://java.sun.com/jsp/jstl/cdt"%>
<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>

<h3> Using forEach from Core Solution below</h3>

<c:forEach var="beer" items="${styles}" >

    <br>try:${beer}
    </c:forEach>


<br/>

<h3> Custom Tag Solution below </h3>
<cdt:CurrentTimeDate color="green" size="22px" />

</body>
</html>