package y18.m11.d29.service;

import java.util.ArrayList;

import y18.m11.d29.domain.FreeBoard;
import y18.m11.d29.domain.FreeBoardReply;

public interface FreeBoardService {
	public ArrayList<FreeBoard> list();
	public void write(String free_name, String free_title, String free_content);
	public FreeBoard content_view(int free_num);
	public void delete(int free_num);
	public FreeBoard modify_view(int free_num);
	public void modify(int free_num,String free_name, String free_title, String free_content);
	public void uphit(int free_num);
	public ArrayList<FreeBoard> getArticleList(String search_select, String searchWord);
	public void reply_input(int free_num, String reply_num, String reply_name, String reply_password, String reply_content);
	public ArrayList<FreeBoardReply> reply_get(int free_num);
	public void reply_delete(String reply_delete);

}
