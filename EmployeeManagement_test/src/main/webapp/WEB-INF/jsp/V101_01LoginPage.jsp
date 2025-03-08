<%-- pageディレクティブの設定 --%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<%-- taglibディレクティブで、使用するタグライブラリを宣言 --%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>販売支援システム（テスト）</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div style="text-align:center;">
 <h2>販売支援システム（テスト）</h2>
 <h2>ログイン画面</h2>
 <div style="color:red; font-weight:bold;">
 <%-- エラーメッセージがある場合、出力 --%>
   <c:out value="${requestScope.errorMessage}"/>
   <c:forEach var="message" items="${requestScope.errorMessageList}">
     <c:out value="${message}"/><br>
   </c:forEach>
 </div>
</div>

<br>

<div style="text-align:center">
 <form action="/EmployeeManagement_test/jsysFC" method="post">
  従業員番号 <input type="text" maxlength="6" name="empNo" value="<c:out value="${ param.empNo }" />"><br>
  パスワード <input type="password" maxlength="6" name="password" value="<c:out value="${ param.password }" />"><br>
  <button style="width:100px; margin-top:5px" type="submit" name="buttonId" value="V101_01_01">ログイン</button>
 </form>
</div>
</body>
</html>