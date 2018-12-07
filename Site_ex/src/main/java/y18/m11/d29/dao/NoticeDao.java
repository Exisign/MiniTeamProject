package y18.m11.d29.dao;

import java.util.ArrayList;

import y18.m11.d29.domain.Notice;

public interface NoticeDao {
	public ArrayList<Notice> listDao(); 
	public void writeDao(String notice_title, String notice_content);
	public void deleteDao(String user_num);
}
