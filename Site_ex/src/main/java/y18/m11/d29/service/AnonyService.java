package y18.m11.d29.service;

import java.util.ArrayList;
import java.util.HashMap;

import y18.m11.d29.domain.Anonymous;
import y18.m11.d29.domain.ReplyDto;

public interface AnonyService {

	public ArrayList<Anonymous> listDao();

	public void writeDao(String title, String content,String user_id);

	public Anonymous viewDao(String strID);

	public void deleteDao(String anony_num);

	public Anonymous contentView(String anony_num);

	public void upHit(String anony_num);

	public void modify(String title, String content, String anony_num);

	public ArrayList<Anonymous> searchList(String searchWord);
	
	public ArrayList<ReplyDto> reply(String anony_num);

	public void insertReply(String anony_num, String content);

}
