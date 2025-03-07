package common;

import java.util.ArrayList;

public class SalesBusinessException extends Exception {
	/** エラーメッセージリスト */
	private ArrayList<String> messageList = new ArrayList<>();

	/**
	 * コンストラクタ
	 *
	 * @param message
	 *            エラーメッセージ
	 */
	public SalesBusinessException(String message) {
		super(message);
	}
	/**
	 * コンストラクタ
	 *
	 * @param messageList
	 *            エラーメッセージリスト
	 */
	public SalesBusinessException(ArrayList<String> messageList) {
		super();
		this.messageList = messageList;
	}
	/**
	 * エラーメッセージリストを取得する。
	 *
	 * @return エラーメッセージリスト
	 */
	public ArrayList<String> getMessageList() {
		return messageList;
	}

	/**
	 * エラーメッセージリストを設定する。
	 *
	 * @param messageList
	 *            エラーメッセージリスト
	 */
	public void setMessageList(ArrayList<String> messageList) {
		this.messageList = messageList;
	}

}