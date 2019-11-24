<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>JSPの基本</title>
</head>
<body>
<h3>JSPの基本的なタグ</h3>
<%-- JSPのコメント --%>
<%!

 int cnt1 = 0;

 int adding(int num1, int num2){
	 return num1 + num2;
 }
%>
<%
 int cnt2 = 10;
%>
<p>データの出力</p>
<%= cnt1 %> : <%= cnt2 %><br>
<%= adding(cnt1,cnt2) %><br>
<%
    cnt1++;
    cnt2++;
%>
</body>
</html>