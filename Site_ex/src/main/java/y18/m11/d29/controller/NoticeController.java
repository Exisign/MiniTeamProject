package y18.m11.d29.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import y18.m11.d29.dao.NoticeDao;
import y18.m11.d29.domain.Notice;


/**
 * Handles requests for the application home page.
 */
@Controller
public class NoticeController {
	
	Notice contentdto;
	
	@Autowired
	private SqlSession sqlSession;
	
	
	private static final Logger logger = LoggerFactory.getLogger(NoticeController.class);
	
	
	//쿼리문
	@RequestMapping("notice/notice")
	public String notice() {
		
		return "notice/notice";
	}
	
	
	@RequestMapping("notice/list")
	public String list(Model model) {
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		System.out.println(dao.listDao());
		model.addAttribute("list", dao.listDao());
		
		return "notice/list";
	}
	
	@RequestMapping("notice/writeForm")
	public String writeForm() {
		
		return "notice/writeForm";
	}
	
//	@RequestMapping("/write")
//	public String write(@ModelAttribute ContentDto dto) {
//		Dao dao = sqlSession.getMapper(Dao.class);
//		
//		dao.writeDao(dto.getUser_num(), dto.getNotice_title(), dto.getNotice_content());
//		return "redirect:list";
//	} 
	
	@RequestMapping("notice/write")
	public String write(HttpServletRequest request, Model model) {
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		
		String notice_title = request.getParameter("notice_title");
		String notice_content = request.getParameter("notice_content");
		
		dao.writeDao(notice_title, notice_content);
		
		return "redirect:/notice/list";
	}
	
	
	@RequestMapping("/view")
	public String view() {
		
		return "/view";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		dao.deleteDao(request.getParameter("user_num"));
		return "redirect:list";
	}
	
	
}
