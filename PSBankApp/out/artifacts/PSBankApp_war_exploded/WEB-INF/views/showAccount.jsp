<%--
  Created by IntelliJ IDEA.
  User: eugen.dragomir
  Date: 5/12/2019
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="lbl.title"/></title>
</head>
<body>
<h2>PS: Banck Account Details</h2>
<p><spring:message code="lbl.accountno"/> ${account.accountNo}</p>
<p><spring:message code="lbl.accountHolder"/> ${account.accountHolder}</p>
<p><spring:message code="lbl.balance"/> ${account.balance}</p>
</body>
</html>
