<%-- pageディレクティブの設定 --%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%-- taglibディレクティブで、使用するタグライブラリを宣言 --%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メインメニュー</title>
<link rel="stylesheet" type="text/css" href="./css/style.css"> 
</head>
<body>
	<jsp:include page="header.jsp" />
	<div style="text-align: center;">
	
		<h2>販売支援システム</h2>
		<h2>メインメニュー</h2>

	<form action="/EmployeeManagement_test/jsysFC" method="post">
		<button type="submit" name="buttonId" value="V102_01_01">得 意 先 管 理</button><br><span class="spacer"></span>
		<button type="submit" name="buttonId" value="V102_01_02">得 意 先 別 集 計</button><br><br>
		<button style="width: fit-content" type="submit" name="buttonId" value="V102_01_03">ログアウト</button><br>
	</form>
	
	</div>

</body>
</html>