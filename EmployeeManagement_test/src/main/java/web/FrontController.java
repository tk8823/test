package web;

import java.io.*;

import common.SalesSystemException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = { "/jsysFC" })
public class FrontController extends HttpServlet {
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 遷移先ページ名の設定
		String path="/WEB-INF/jsp/";
		String page = null;
		// Actionクラス
		ActionIF action = null;
		// パラメータの取得
		request.setCharacterEncoding("UTF-8");
		String buttonId = request.getParameter("buttonId");

		// パラメータ未送信または空文字の場合
		if (buttonId == null || buttonId.equals("")) {
			buttonId = "V000_00_00";
		}
		// リクエスト種別の判定
		switch (buttonId) {
		case "V100_00_00":
		case "V102_01_03":
			// ログイン画面
			page = "V101_01LoginPage.jsp";
			break;
		case "V101_01_02":
		case "V200_01_01":
			// メインメニュー画面（各画面から戻る場合）
			page = "V102_01MainMenu.jsp";
			break;
		case "V101_01_01":
			// メインメニュー画面（ログイン時）
			action = new EmployeeFindAction();
			try {
				page = action.execute(request);
			} catch (SalesSystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
/*
		case "V102_01_01":
			// 得意先管理メニュー
			action = new CustomerManagementMenuAction();
			try {
				page = action.execute(request);
			} catch (SalesSystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "V200_01_02":
			// 得意先検索画面
			action = new CustomerFindViewAction();
			try {
				page = action.execute(request);
			} catch (SalesSystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "V201_01_02":
			// 得意先検索結果表示
			action = new CustomerFindAction();
			try {
				page = action.execute(request);
			} catch (SalesSystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "V202_01_01":
			// 得意先登録画面
			page = "V202_01CustomerRegistView.jsp";
			break;
		// TODO: 登録結果画面を表示する処理を要追加

		case "V203_01_01":
			// 得意先削除画面表示
			action = new CustomerDeleteAction();
			try {
				page = action.execute(request);
			} catch (SalesSystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "V203_02_01":
			// 削除する得意先を検索
			action = new CustomerDeleteFindAction();
			try {
				page = action.execute(request);
			} catch (SalesSystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "V203_02_02":
			// 得意先削除処理
			action = new CustomerDeleteExecuteAction();
			try {
				page = action.execute(request);
			} catch (SalesSystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		// TODO: 変更画面を作成する場合に修正
//		case "V204_01_01":
//			// 得意先変更画面
//			page = "";
//			break;

		case "V205_01_01":
			// 得意先一覧画面
			action = new CustomerFindAction();	// TODO: Actionクラスの名前が決まったら修正
			try {
				page = action.execute(request);
			} catch (SalesSystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "V301_01_01":
			// 月別受注集計画面
			page = "V301_01MonthlyCustomer.jsp";
			break;
		// TODO: 年次受注集計画面を作成する場合に修正
//		case "V302_01_01":
//			// 年次受注集計画面
//			page = "";
//			break;
		// TODO: 商品別受注集計画面を作成する場合に修正
//		case "V303_01_01":
//			// 商品別受注集計画面
//			page = "";
//			break;
 */
		default:
			// buttonIdが存在しない場合
			page = "V101_01LoginPage.jsp";
		}

		// 結果画面に転送
		RequestDispatcher rd = request.getRequestDispatcher(path + page);
		rd.forward(request, response);
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}