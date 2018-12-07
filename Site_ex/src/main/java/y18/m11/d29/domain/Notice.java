package y18.m11.d29.domain;

import java.sql.Date;

public class Notice {
	private int sqs;
	private int user_num;
	private String notice_title;
	private String notice_content;
	private Date notice_date;
	private int notice_view_count;
	private int notice_Group;
	private int notice_step;
	private int notice_indent;
	private Date notice_delete_date;
	private int notice_delete_check;

public Notice() {
		
	}

	public Notice(int sqs, int user_num, String notice_title, String notice_content, Date notice_date, int notice_view_count,
			int notice_Group, int notice_step, int notice_indent, Date notice_delete_date, int notice_delete_check) {
		
		this.user_num = user_num;
		this.notice_title = notice_title;
		this.notice_content = notice_content;
		this.notice_date = notice_date;
		this.notice_view_count = notice_view_count;
		this.notice_Group = notice_Group;
		this.notice_step = notice_step;
		this.notice_indent = notice_indent;
		this.notice_delete_date = notice_delete_date;
		this.notice_delete_check = notice_delete_check;
	}

	public int getSqs() {
		return sqs;
	}

	public void setSqs(int sqs) {
		this.sqs = sqs;
	}

	public int getUser_num() {
		return user_num;
	}

	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}

	public String getNotice_title() {
		return notice_title;
	}

	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}

	public String getNotice_content() {
		return notice_content;
	}

	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}

	public Date getNotice_date() {
		return notice_date;
	}

	public void setNotice_date(Date notice_date) {
		this.notice_date = notice_date;
	}

	public int getNotice_view_count() {
		return notice_view_count;
	}

	public void setNotice_view_count(int notice_view_count) {
		this.notice_view_count = notice_view_count;
	}

	public int getNotice_Group() {
		return notice_Group;
	}

	public void setNotice_Group(int notice_Group) {
		this.notice_Group = notice_Group;
	}

	public int getNotice_step() {
		return notice_step;
	}

	public void setNotice_step(int notice_step) {
		this.notice_step = notice_step;
	}

	public int getNotice_indent() {
		return notice_indent;
	}

	public void setNotice_indent(int notice_indent) {
		this.notice_indent = notice_indent;
	}

	public Date getNotice_delete_date() {
		return notice_delete_date;
	}

	public void setNotice_delete_date(Date notice_delete_date) {
		this.notice_delete_date = notice_delete_date;
	}

	public int getNotice_delete_check() {
		return notice_delete_check;
	}

	public void setNotice_delete_check(int notice_delete_check) {
		this.notice_delete_check = notice_delete_check;
	}

	@Override
	public String toString() {
		return "ContentDto [sqs=" + sqs + ", user_num=" + user_num + ", notice_title=" + notice_title
				+ ", notice_content=" + notice_content + ", notice_date=" + notice_date + ", notice_view_count="
				+ notice_view_count + ", notice_Group=" + notice_Group + ", notice_step=" + notice_step
				+ ", notice_indent=" + notice_indent + ", notice_delete_date=" + notice_delete_date
				+ ", notice_delete_check=" + notice_delete_check + "]";
	}

}
