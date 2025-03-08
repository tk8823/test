<%-- pageディレクティブの設定 --%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>

<%-- taglibディレクティブで、使用するタグライブラリを宣言 --%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<header>
		<!-- ロゴの表示 -->
		<img src="./image/logo.jpg" alt="Sales System" width="5%" height="5%">
		<!-- ログイン情報の表示 -->
		<c:if test="${requestScope.employee != null}">
			<div class="header-employee">
				従業員名：
				<c:out value="${ employee.empName }" />
			</div>
			<br>
		</c:if>
	</header>
</body>
</html>