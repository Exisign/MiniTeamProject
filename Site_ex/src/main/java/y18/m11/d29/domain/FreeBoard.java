package y18.m11.d29.domain;

import java.sql.Date;

public class FreeBoard {
	int free_num;
	String free_title;
	String free_content;
	Date free_date;
	int free_hit;
	int free_group;
	int free_step;
	int free_indent;
	String free_name;

	public FreeBoard() {
		
	}
	
	public FreeBoard(int free_num, String free_title, String free_content, Date free_date, int free_hit, int free_group,
			int free_step, int free_indent, String free_name) {
		super();
		this.free_num = free_num;
		this.free_title = free_title;
		this.free_content = free_content;
		this.free_date = free_date;
		this.free_hit = free_hit;
		this.free_group = free_group;
		this.free_step = free_step;
		this.free_indent = free_indent;
		this.free_name = free_name;
	}
	
	public int getFree_num() {
		return free_num;
	}
	public void setFree_num(int free_num) {
		this.free_num = free_num;
	}
	public String getFree_title() {
		return free_title;
	}
	public void setFree_title(String free_title) {
		this.free_title = free_title;
	}
	public String getFree_content() {
		return free_content;
	}
	public void setFree_content(String free_content) {
		this.free_content = free_content;
	}
	public Date getFree_date() {
		return free_date;
	}
	public void setFree_date(Date free_date) {
		this.free_date = free_date;
	}
	public int getFree_hit() {
		return free_hit;
	}
	public void setFree_hit(int free_hit) {
		this.free_hit = free_hit;
	}
	public int getFree_group() {
		return free_group;
	}
	public void setFree_group(int free_group) {
		this.free_group = free_group;
	}
	public int getFree_step() {
		return free_step;
	}
	public void setFree_step(int free_step) {
		this.free_step = free_step;
	}
	public int getFree_indent() {
		return free_indent;
	}
	public void setFree_indent(int free_indent) {
		this.free_indent = free_indent;
	}
	public String getFree_name() {
		return free_name;
	}
	public void setFree_name(String free_name) {
		this.free_name = free_name;
	}

	@Override
	public String toString() {
		return "FreeBoard [free_num=" + free_num + ", free_title=" + free_title + ", free_content=" + free_content
				+ ", free_date=" + free_date + ", free_hit=" + free_hit + ", free_group=" + free_group + ", free_step="
				+ free_step + ", free_indent=" + free_indent + ", free_name=" + free_name + "]";
	}
	
	

	
	
}
