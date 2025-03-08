package logic;

import java.sql.*;
import common.*;
import dao.*;
import entity.*;

public class EmployeeFindLogic {
	// 従業員を検索する
	public Employee findEmployee(String empNo, String password)
			throws SalesBusinessException, SalesSystemException {
		/*
		Connection con = null;
		Employee employee = null;
		try {
			// データベースの接続を取得する
			con = ConnectionManager.getConnection();

			// DAOを生成し、メソッドを呼び出す
			EmployeeDAO employeeDAO = new EmployeeDAO(con);
			employee = employeeDAO.findEmployee(empNo, password);

			// 検索結果がない場合、業務エラーを発生させる
			if (employee == null) {
				throw new SalesBusinessException("該当する従業員は存在しません。");
			}
		} catch (SQLException e) {
			// データベースエラーの場合、システムエラーを発生させる
			throw new SalesSystemException("システムエラーが発生しました。管理者に連絡してください。");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				throw new SalesSystemException("システムエラーが発生しました。管理者に連絡してください。");
			}
		}
		*/
		Employee employee = null;
		Connection con = null;
		
		try {
			// データベースの接続を取得する
//			con = ConnectionManager.getConnection();

			// DAOを生成し、メソッドを呼び出す
			EmployeeDAO employeeDAO = new EmployeeDAO(con);
			employee = employeeDAO.findEmployee(empNo, password);

			// 検索結果がない場合、業務エラーを発生させる
			if (employee == null) {
				throw new SalesBusinessException("該当する従業員は存在しません。");
			}
		} catch (SQLException e) {
			// データベースエラーの場合、システムエラーを発生させる
			throw new SalesSystemException("システムエラーが発生しました。管理者に連絡してください。");
		} finally {
//			try {
//				if (con != null) {
//					con.close();
//				}
//			} catch (SQLException e) {
//				throw new SalesSystemException("システムエラーが発生しました。管理者に連絡してください。");
//			}
		}
		
		return employee;
	}
}