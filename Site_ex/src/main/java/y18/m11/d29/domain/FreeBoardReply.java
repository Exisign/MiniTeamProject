package y18.m11.d29.domain;

import java.sql.Date;

public class FreeBoardReply {
	int free_num;
	private int reply_num;
	private String reply_name;
	private String reply_password;
	private String reply_content;
	private Date reply_date;
	
	public FreeBoardReply() {
		
	}
	
	public FreeBoardReply(int free_num, int reply_num, String reply_name, String reply_password, String reply_content, Date reply_date) {
		super();
		this.free_num = free_num;
		this.reply_num = reply_num;
		this.reply_name = reply_name;
		this.reply_password = reply_password;
		this.reply_content = reply_content;
		this.reply_date = reply_date;
	}

	public int getFree_num() {
		return free_num;
	}

	public void setFree_num(int free_num) {
		this.free_num = free_num;
	}

	public int getReply_num() {
		return reply_num;
	}
	public void setReply_num(int reply_num) {
		this.reply_num = reply_num;
	}
	public String getReply_name() {
		return reply_name;
	}
	public void setReply_name(String reply_name) {
		this.reply_name = reply_name;
	}
	public String getReply_password() {
		return reply_password;
	}
	public void setReply_password(String reply_password) {
		this.reply_password = reply_password;
	}
	public String getReply_content() {
		return reply_content;
	}
	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}
	public Date getReply_date() {
		return reply_date;
	}
	public void setReply_date(Date reply_date) {
		this.reply_date = reply_date;
	}

	@Override
	public String toString() {
		return "댓글 번호: " + reply_num + ", 작성자: " + reply_name + 
				"내용: " + reply_content + ", 작성일: " + reply_date+"\n";
	}
	
}
