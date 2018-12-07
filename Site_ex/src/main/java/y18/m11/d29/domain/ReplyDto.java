package y18.m11.d29.domain;

import java.sql.Date;

public class ReplyDto {

	private int anony_num;
	private int reply_num;
	private String reply_content;
	private String reply_user;
	private Date reply_date;
	
	public ReplyDto() {
		// TODO Auto-generated constructor stub
	}

	public int getAnony_num() {
		return anony_num;
	}

	public void setAnony_num(int anony_num) {
		this.anony_num = anony_num;
	}

	public int getReply_num() {
		return reply_num;
	}

	public void setReply_num(int reply_num) {
		this.reply_num = reply_num;
	}

	public String getReply_content() {
		return reply_content;
	}

	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}

	public String getReply_user() {
		return reply_user;
	}

	public void setReply_user(String reply_user) {
		this.reply_user = reply_user;
	}

	public Date getReply_date() {
		return reply_date;
	}

	public void setReply_date(Date reply_date) {
		this.reply_date = reply_date;
	}
	
	
}
