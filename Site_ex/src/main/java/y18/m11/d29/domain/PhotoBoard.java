package y18.m11.d29.domain;

import java.sql.Date;

public class PhotoBoard {
	/**
	 * 사진글 고유 번호
	 */
	private int photo_number;
	/**
	 * 사진글 글쓴이 고유번호(fk)
	 */
	private int photo_user_number;
	/**
	 * 사진글 제목
	 */
	private String photo_title;
	/**
	 * 사진글 내용
	 */
	private String photo_content;
	/**
	 * 사진글 조회 수
	 */
	private int photo_view_count;
	/**
	 * 원글에 달린 새 덧글 그룹에 부여되는 번호(원글을 기준으로 그룹 넘버를 가져간다)
	 */
	private int photo_group;
	/**
	 * 답글이 원글을 기준으로 위에서 몇번째에 위치할 것인지
	 */
	private int photo_step;
	/**
	 * 원글의 답글인지,답글의 답글인지. ***들여쓰기 횟수
	 */
	private int photo_indent;
	/**
	 * 사진글의 날짜
	 */
	private Date photo_date;
	/**
	 * 사진글의 삭제 날짜
	 */
	private Date photo_delete_date;
	
	public int getPhoto_number() {
		return photo_number;
	}
	public void setPhoto_number(int photo_number) {
		this.photo_number = photo_number;
	}
	public int getPhoto_user_number() {
		return photo_user_number;
	}
	public void setPhoto_user_number(int photo_user_number) {
		this.photo_user_number = photo_user_number;
	}
	public String getPhoto_title() {
		return photo_title;
	}
	public void setPhoto_title(String photo_title) {
		this.photo_title = photo_title;
	}
	public String getPhoto_content() {
		return photo_content;
	}
	public void setPhoto_content(String photo_content) {
		this.photo_content = photo_content;
	}
	public int getPhoto_view_count() {
		return photo_view_count;
	}
	public void setPhoto_view_count(int photo_view_count) {
		this.photo_view_count = photo_view_count;
	}
	public int getPhoto_group() {
		return photo_group;
	}
	public void setPhoto_group(int photo_group) {
		this.photo_group = photo_group;
	}
	public int getPhoto_step() {
		return photo_step;
	}
	public void setPhoto_step(int photo_step) {
		this.photo_step = photo_step;
	}
	public int getPhoto_indent() {
		return photo_indent;
	}
	public void setPhoto_indent(int photo_indent) {
		this.photo_indent = photo_indent;
	}
	public Date getPhoto_date() {
		return photo_date;
	}
	public void setPhoto_date(Date photo_date) {
		this.photo_date = photo_date;
	}
	public Date getPhoto_delete_date() {
		return photo_delete_date;
	}
	public void setPhoto_delete_date(Date photo_delete_date) {
		this.photo_delete_date = photo_delete_date;
	}
	
	@Override
	public String toString() {
		return "PhotoBoard [photo_number=" + photo_number + ", photo_user_number=" + photo_user_number
				+ ", photo_title=" + photo_title + ", photo_content=" + photo_content + ", photo_view_count="
				+ photo_view_count + ", photo_group=" + photo_group + ", photo_step=" + photo_step + ", photo_indent="
				+ photo_indent + ", photo_date=" + photo_date + ", photo_delete_date=" + photo_delete_date + "]";
	}
}
