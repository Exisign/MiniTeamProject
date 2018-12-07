package y18.m11.d29.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import y18.m11.d29.service.FreeBoardServiceImpl;

@Controller
public class FreeBoardController {

	@Autowired
	FreeBoardServiceImpl command;

	@RequestMapping("free/list")
	public String list(String searchWord, HttpServletRequest request, Model model) {
		System.out.println("freelist");
		model.addAttribute("freeBoardlist",command.list());
		return "free/list";
	}
	
	@RequestMapping("free/write_view")
	public String writeView(Model model) {
		System.out.println("freeWriteView");
		return "free/write_view";
	}
	
	@RequestMapping("free/write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("freeWrite");
		command.write(request.getParameter("fName"), 
				request.getParameter("fTitle"),
				request.getParameter("fContent"));
		return "redirect:/free/list";
	}
	
	@RequestMapping("free/content_view")
	public String contentView(HttpServletRequest request, Model model) {
		System.out.println("freeContentView");
		command.uphit(Integer.parseInt(request.getParameter("free_num")));
		model.addAttribute("content_view",command.content_view(Integer.parseInt(request.getParameter("free_num"))));
		
		return "free/content_view";
	}
	
	//////
	
	@RequestMapping("free/list2")
	public void list2(HttpServletRequest request, Model model) {
		System.out.println(command.getArticleList(request.getParameter("searchWord")));
		model.addAttribute("searchWord",command.getArticleList(request.getParameter("searchWord")));	
	}
	
	
	
	@RequestMapping("free/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		command.delete(Integer.parseInt(request.getParameter("free_num")));
		
		return "redirect:/free/list";
	}
	
	@RequestMapping("free/modify_view")
	public String modifyView(HttpServletRequest request, Model model) {
	
		model.addAttribute("modify_view",command.modify_view(Integer.parseInt(request.getParameter("free_num"))));
		return "free/modify";
	}
	
	@RequestMapping("free/modify")
	public String modify(HttpServletRequest request, Model model) {
		
		command.modify(Integer.parseInt(request.getParameter("free_num")),
				request.getParameter("fName"),
				request.getParameter("fTitle"),
				request.getParameter("fContent"));
		
		return "redirect:/free/list";
	}
	
	
	@RequestMapping("free/backlist")
	public String backlist() {
		return "free/list";
	}
	
	
	
}
