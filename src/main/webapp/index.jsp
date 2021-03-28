<%@ page import="lib.Article" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.servlet" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<!-- LOADER -->
<div id="preloader">
    <img class="preloader" src="images/loaders/heart-loading2.gif" alt="">
</div>
<!-- END LOADER -->

<h3> Students Information </h3>
<% List<Article> articles = (ArrayList<Article>)request.getAttribute("students");
    int i = 0;
    //javax.servlet.jsp.JspWriter out;
    for(Article article : articles)
    {
        out.print(article.getTitre());
        out.print("<br/>");
        out.print(article.getResume());
        out.print("<br/>");
        out.print("Publié le : " + article.getDate());
    }

%>

</body>
</html>