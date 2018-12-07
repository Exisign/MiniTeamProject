package y18.m11.d29.domain;

import java.sql.Date;

public class Anonymous {

	private int anony_num;
	private String user_id;
	private String anony_title;
	private String anony_content;
	private Date anony_date;
	private int anony_view_count;
	private Date delete_date;
	
	public Anonymous() {
		// TODO Auto-generated constructor stub
	}

	public int getAnony_num() {
		return anony_num;
	}

	public void setAnony_num(int anony_num) {
		this.anony_num = anony_num;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getAnony_title() {
		return anony_title;
	}

	public void setAnony_title(String anony_title) {
		this.anony_title = anony_title;
	}

	public String getAnony_content() {
		return anony_content;
	}

	public void setAnony_content(String anony_content) {
		this.anony_content = anony_content;
	}

	public Date getAnony_date() {
		return anony_date;
	}

	public void setAnony_date(Date anony_date) {
		this.anony_date = anony_date;
	}

	public int getAnony_view_count() {
		return anony_view_count;
	}

	public void setAnony_view_count(int anony_view_count) {
		this.anony_view_count = anony_view_count;
	}

	public Date getDelete_date() {
		return delete_date;
	}

	public void setDelete_date(Date delete_date) {
		this.delete_date = delete_date;
	}
	
	
	

}
