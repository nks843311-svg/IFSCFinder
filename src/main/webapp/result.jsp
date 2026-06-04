<%@ page import="com.model.Bank" %>

<%
Bank bank =
(Bank)request.getAttribute("bank");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>

<h2>Bank Details</h2>

<%
if(bank != null){
%>

<table border="1">

<tr>
<td>IFSC</td>
<td><%= bank.getIfsc() %></td>
</tr>

<tr>
<td>Bank Name</td>
<td><%= bank.getBankName() %></td>
</tr>

<tr>
<td>Branch</td>
<td><%= bank.getBranch() %></td>
</tr>

<tr>
<td>Address</td>
<td><%= bank.getAddress() %></td>
</tr>

<tr>
<td>City</td>
<td><%= bank.getCity() %></td>
</tr>

<tr>
<td>State</td>
<td><%= bank.getState() %></td>
</tr>

</table>

<%
}else{
%>

<h3>IFSC Code Not Found</h3>

<%
}
%>

<br><br>

<a href="index.jsp">
Search Another IFSC
</a>

</body>
</html>