package entity;

public class Employee {

	/** 従業員番号 */
	private String empNo;

	/** 従業員名 */
	private String empName;

	/** パスワード */
	private String password;

	/**
	 * コンストラクタ（引数なし）
	 */
	public Employee() {
	}

	/**
	 * コンストラクタ:引数で指定した値を設定する。
	 * @param empNo 従業員番号
	 * @param empName 従業員名
	 * @param password パスワード
	 */
	public Employee(String empNo, String empName, String password) {
		this.empNo = empNo;
		this.empName = empName;
		this.password = password;
	}

	/**
	 * empNoのGetter
	 * @return empNo
	 */
	public String getEmpNo() {
		return empNo;
	}

	/**
	 * empNoのSetter
	 * @param empNo
	 */
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	/**
	 * empNameのGetter
	 * @return empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * empNameのSetter
	 * @param empName
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * passwordのGetter
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * passwordのSetter
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
