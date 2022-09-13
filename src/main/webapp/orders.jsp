<%@ page import="ua.ithillel.hillelwebapp.entity.Order" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
    <title>Orders</title>
</head>

<body>
<div style="text-align: center;">
    <h1 class="display-3">Orders</h1>
    <div class="container">
        <table class="table">
            <thead>
            <tr>
                <th>Id</th>
                <th>Date</th>
                <th>Car-id</th>
                <th>Client-id</th>
                <th>Manager-id</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<Order> list = (List<Order>) request.getAttribute("ordersList");
            %>
            <%
                for (Order c : list) {
            %>
            <tr>
                <td><%=c.getId()%>
                </td>
                <td><%=c.getDate()%>
                </td>
                <td><%=c.getCar().getId()%>
                </td>
                <td><%=c.getClient().getId()%>
                </td>
                <td><%=c.getManager().getId()%>
                </td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>