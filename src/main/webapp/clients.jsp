<%@ page import="ua.ithillel.hillelwebapp.entity.Client" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
        crossorigin="anonymous">
  <title>Clients</title>
</head>

<body>
<div style="text-align: center;">
  <h1 class="display-3">Clients</h1>
  <div class="container">
    <table class="table">
      <thead>
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Phone</th>
      </tr>
      </thead>
      <tbody>
      <%
        List <Client> list = (List<Client>) request.getAttribute("clientsList");
      %>
      <%
        for (Client c : list) {
      %>
      <tr>
        <td><%=c.getId()%>
        </td>
        <td><%=c.getName()%>
        </td>
        <td><%=c.getSurname()%>
        </td>
        <td><%=c.getPhone()%>
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