package y18.m11.d29.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import y18.m11.d29.dao.FreeBoardDao;
import y18.m11.d29.domain.FreeBoard;
import y18.m11.d29.domain.FreeBoardReply;



@Service("command")
public class FreeBoardServiceImpl implements FreeBoardService {
	
	@Autowired
	FreeBoardDao dao;
	
	public ArrayList<FreeBoard> list(){
		return dao.list();
	}
	
	public void write(String free_name, String free_title, String free_content) {
		dao.write(free_name, free_title, free_content);
	}
	
	public FreeBoard content_view(int free_num) {
		return dao.content_view(free_num);
	}
	
	public void delete(int free_num) {
		dao.delete(free_num);
	}
	
	public FreeBoard modify_view(int free_num) {
		return dao.modify_view(free_num);
	}
	
	public void modify(int free_num,String free_name, String free_title, String free_content) {
		dao.modify(free_num, free_name, free_title, free_content);
	}
	
	public void uphit(int free_num) {
		dao.uphit(free_num);
	}


	
	public void reply_input(int free_num, String reply_num, String reply_name, String reply_password, String reply_content) {
		System.out.println("command reply");
		dao.reply_input(free_num, reply_num, reply_name, reply_password, reply_content);
	}
	
	public ArrayList<FreeBoardReply> reply_get(int free_num) {
		return dao.reply_get(free_num);
	}
	
	public void reply_delete(String reply_delete) {
		dao.reply_delete(reply_delete);
	}

	@Override
	public ArrayList<FreeBoard> getArticleList(String search_select, String searchWord) {
		//만약 서치셀렉트가 free_title일때, search_title함수 만들기
		//만약 서치셀렉트가 free_name이때, search_name함수 만들기
		//만약 서치셀렉트가 free_content일때, search_content함수 만드리
		return dao.getArticleList(search_select, searchWord);
		
	}
}
