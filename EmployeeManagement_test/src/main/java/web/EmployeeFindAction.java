package web;

import java.util.ArrayList;
import jakarta.servlet.http.*;
import common.*;
import entity.*;
import logic.*;

public class EmployeeFindAction implements ActionIF {

	@Override
	public String execute(HttpServletRequest request) {
		String page = "V102_01MainMenu.jsp";

		try {
			// セッションチェック
//			HttpSession session = request.getSession(false);
//			if (session == null) {
//				throw new SalesSystemException("セッションが無効です。");
//			}
			// パラメータの取得
			String empNo = request.getParameter("empNo");
			String password = request.getParameter("password");

			// パラメータ未送信または未入力の場合
			// SalesBusinessExceptionをスローする

			// エラーメッセージリストの生成
			ArrayList<String> errorMessageList = new ArrayList<>();
			if (empNo == null || empNo.equals("")) {
				errorMessageList.add("従業員番号を入力してください。");
			}
			if (password == null || password.equals("")) {
				errorMessageList.add("パスワードを入力してください。");
			}
			if (!errorMessageList.isEmpty()) {
				throw new SalesBusinessException(errorMessageList);
			}

			// 業務Logic呼び出し
			EmployeeFindLogic logic = new EmployeeFindLogic();
			Employee employee = logic.findEmployee(empNo, password);

			// 処理結果の格納
			request.setAttribute("employee", employee);
//			session.setAttribute("employee", employee);		//ログインしているかのチェックとして使用するため
		} catch (SalesBusinessException e) {
			// 業務エラー発生時
			// エラーメッセージリストをリクエストスコープに格納
			// 遷移先ページ名の設定
			request.setAttribute("errorMessage", e.getMessage());
			request.setAttribute("errorMessageList", e.getMessageList());
			page = "V101_01LoginPage.jsp";
		} catch (SalesSystemException e) {
			// システムエラー発生時
			// エラーメッセージをリクエストスコープに格納
			// 遷移先ページ名の設定
			request.setAttribute("errorMessage", e.getMessage());
			page = "V901_01SystemErrorPage.jsp";
		}
		// 遷移先ページ名を返却
		return page;
	}
}