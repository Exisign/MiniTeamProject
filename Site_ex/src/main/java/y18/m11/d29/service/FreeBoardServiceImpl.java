package y18.m11.d29.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import y18.m11.d29.dao.FreeBoardDao;
import y18.m11.d29.domain.FreeBoard;



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

	public ArrayList<FreeBoard> getArticleList(String searchWord){
//		HashMap<String, String> hashmap = new HashMap<String, String>();
//		hashmap.put("searchWord", searchWord);
		
		return dao.getArticleList(searchWord);
	}
}
