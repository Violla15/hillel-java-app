<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<div style="text-align: center;">
    <h1>
        Languages
    </h1>
    <%
        List<String> result = (List<String>) request.getAttribute("features");
        Iterator<String> it = result.iterator();
        out.println("<br>Features <br><br>");
        while (it.hasNext()) {
            out.println(it.next() + "<br>");
        }
    %>
</div>
</body>
</html>