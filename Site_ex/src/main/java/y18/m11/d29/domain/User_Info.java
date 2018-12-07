package y18.m11.d29.domain;

import java.sql.Date;

public class User_Info {
	/**
	 * 유저 고유 번호
	 */
	private int user_number;
	/**
	 * 유저 권한
	 */
	private String user_validate;
	/**
	 * 유저 ID
	 */
	private String user_id;
	/**
	 * 유저 PW
	 */
	private String user_pw;
	/**
	 * 유저 이름
	 */
	private String user_name;
	/**
	 * 유저 닉네임
	 */
	private String user_nickname;
	/**
	 * 유저 email
	 */
	private String user_email;
	/**
	 * 유저 전화번호
	 */
	private String user_phone;
	/**
	 * 유저 가입일
	 */
	private Date user_join_date;
	/**
	 * 유저 탈퇴일
	 */
	private Date user_exit_date;
	
	User_Info(){
		user_validate = "";
	}
	
	public int getUser_number() {
		return user_number;
	}
	public void setUser_number(int user_number) {
		this.user_number = user_number;
	}
	public String getUser_validate() {
		return user_validate;
	}
	public void setUser_validate(String user_validate) {
		this.user_validate = user_validate;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_nickname() {
		return user_nickname;
	}
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public Date getUser_join_date() {
		return user_join_date;
	}
	public void setUser_join_date(Date user_join_date) {
		this.user_join_date = user_join_date;
	}
	public Date getUser_exit_date() {
		return user_exit_date;
	}
	public void setUser_exit_date(Date user_exit_date) {
		this.user_exit_date = user_exit_date;
	}
	
	@Override
	public String toString() {
		return "User_Info [user_number=" + user_number + ", user_validate=" + user_validate + ", user_id=" + user_id
				+ ", user_pw=" + user_pw + ", user_name=" + user_name + ", user_nickname=" + user_nickname
				+ ", user_email=" + user_email + ", user_phone=" + user_phone + ", user_join_date=" + user_join_date
				+ ", user_exit_date=" + user_exit_date + "]";
	}
	
}
