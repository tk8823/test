package dao;

import java.sql.*;
import entity.*;

public class EmployeeDAO {


	// データベースへの接続
	private Connection con;

	// コンストラクタ
	public EmployeeDAO(Connection con) {
		this.con = con;
	}

	// 従業員を検索するメソッド
	public Employee findEmployee(String empNo, String password) throws SQLException {
		/*
		String sql = "SELECT employee_no, employee_name, password "
			       + "FROM employee WHERE employee_no = ? AND password = ?";
		PreparedStatement stmt = null;
		ResultSet res = null;
		Employee employee = null;

		try {
			// PreparedStatementの作成
			stmt = con.prepareStatement(sql);
			// パラメータの設定
			stmt.setString(1, empNo);
			stmt.setString(2, password);
			// SQL文の実行
			res = stmt.executeQuery();
			// 結果セットから情報を取り出す
			if (res.next()) {
				// Employeeオブジェクトの生成
				employee = new Employee(res.getString("employee_no"),
										res.getString("employee_name"),
										res.getString("password"));
			}
		} finally {
			// クローズ処理
			if (res != null) {
				res.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		}
		*/
		Employee employee = null;
		String empName = null;
		
		if (empNo.equals("H20001") && password.equals("zy0001")) {
			empName = "安藤直也";
		} else if (empNo.equals("H20002") && password.equals("yx0002")) {
			empName = "加西春美";
		} else if (empNo.equals("H20003") && password.equals("xw0003")) {
			empName = "坂口雅也";
		}
		
		if (empName != null) {
			employee = new Employee(empNo, empName, password);
		}
		
		return employee;
	}
}