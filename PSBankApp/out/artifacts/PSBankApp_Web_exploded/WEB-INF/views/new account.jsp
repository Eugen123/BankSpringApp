<%--
  Created by IntelliJ IDEA.
  User: eugen.dragomir
  Date: 5/8/2019
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="lbl.title" /></title>
</head>
<body>
<h1>Create new account</h1>
<form:form action="saveAccount" modelAttribute="account">
    <table>
        <tr>
            <td><spring:message code="lbl.accountno"/></td>
            <td>
                <form:input path="accountNo" size="30"/>
            </td>
        </tr>
        <tr>
            <td><spring:message code="lbl.accountHolder"/></td>
            <td>
                <form:input path="accountHolder" size="30"/>
            </td>
        </tr>
        <tr>
            <td><spring:message code="lbl.balance"/></td>
            <td>
                <form:input path="balance" size="30"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center"></td>
            <td>
                <input type="submit" value="Create Account" name="btnSubmit">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
