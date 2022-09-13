<%@ page import="ua.ithillel.hillelwebapp.entity.Car" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
    <title>Cars</title>
</head>

<body>
<div style="text-align: center;">
    <h1 class="display-3">Cars</h1>
    <div class="container">
        <table class="table">
            <thead>
            <tr>
                <th>Id</th>
                <th>Manufacturer</th>
                <th>Model</th>
                <th>Price</th>
                <th>Year</th>
                <th>Available</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<Car> list = (List) request.getAttribute("carsList");
            %>
            <%
                for (Car c : list) {
            %>
            <tr>
                <td><%=c.getId()%>
                </td>
                <td><%=c.getManufacturer()%>
                </td>
                <td><%=c.getModel()%>
                </td>
                <td><%=c.getPrice()%>
                </td>
                <td><%=c.getYear()%>
                </td>
                <td><%=c.isAvailable()%>
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