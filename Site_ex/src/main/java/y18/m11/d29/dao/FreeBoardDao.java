package y18.m11.d29.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.ResolverUtil.Test;

import y18.m11.d29.domain.FreeBoard;

public interface FreeBoardDao {
	public ArrayList<FreeBoard> list();
	public void write(String free_name, String free_title, String free_content);
	public FreeBoard content_view(int free_num);
	public void delete(int free_num);
	public FreeBoard modify_view(int free_num);
	public void modify(int free_num,String free_name, String free_title, String free_content);
	public void uphit(int free_num);
	public List<Test> testlist(@Param("pagenum") int pagenum, @Param("contentnum") int contentnum);
	public int testcount();
	public ArrayList<FreeBoard> getArticleList(String searchWord);
	

}
