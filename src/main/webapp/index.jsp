<%@ page import="lib.Article" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.servlet" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
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
<!--<% List<Article> articles = (List) request.getAttribute("students");
    for(Article article : articles)
    {
        out.print(article.getTitre());
        out.print("<br/>");
        out.print(article.getResume());
        out.print("<br/>");
        out.print("Publié le : " + article.getDate());
    }

%> -->
<table border="1" style="text-align:center;margin:auto;">
		<thead>
			<tr>
				<th>Titre</th>
				<th>Resume</th>
				<th>Date</th>
			</tr>
		</thead>
<tbody>
<% List<Article> articles = (List) request.getAttribute("articles");
   for(Article article : articles) {

%>
	<tr>
		<td><%=article.getTitre()%></td>
		<td><%=article.getResume()%></td>
		<td><%=article.getDate()%></td>
	</tr>
</tbody>
</table>

</body>
</html>