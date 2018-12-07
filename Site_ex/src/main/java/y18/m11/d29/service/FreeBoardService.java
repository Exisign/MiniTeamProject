package y18.m11.d29.service;

import java.util.ArrayList;

import y18.m11.d29.domain.FreeBoard;

public interface FreeBoardService {
	public ArrayList<FreeBoard> list();
	public void write(String free_name, String free_title, String free_content);
	public FreeBoard content_view(int free_num);
	public void delete(int free_num);
	public FreeBoard modify_view(int free_num);
	public void modify(int free_num,String free_name, String free_title, String free_content);
	public void uphit(int free_num);
	public ArrayList<FreeBoard> getArticleList(String searchWord);
}
