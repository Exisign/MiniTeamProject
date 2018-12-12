package y18.m11.d29.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import y18.m11.d29.service.FreeBoardService;

@Controller
public class FreeBoardController {

	@Autowired
	FreeBoardService command;

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
	public String contentView(@RequestParam("free_num") int free_num, HttpServletRequest request, Model model) {
		System.out.println("freeContentView");
		command.uphit(Integer.parseInt(request.getParameter("free_num")));
		model.addAttribute("content_view",command.content_view(Integer.parseInt(request.getParameter("free_num"))));
		model.addAttribute("reply2",command.reply_get(free_num));
		System.out.println(command.reply_get(free_num));
		return "free/content_view";
	}
	
	
	@RequestMapping("free/list2")
	public void list2(@RequestParam("search_select") String search_select, HttpServletRequest request, Model model) {
		System.out.println(command.getArticleList(search_select, request.getParameter("searchWord")));
		System.out.println("입력한 타이틀 검색값은" + search_select + "입니다.");
		//여기서 서치셀렉트로 조건을 나누고, 조건에 따라 함수를 다르게 호출한다.
		
		//입력값을 조건으로 넘긴다.
		//셀렉트 옵션의 값을 각각 title,name,content로 준다.
		//그러면 그 값은 select name의 값으로 받아진다.
		//select name을 파라미터 변수로 넣는다.
		model.addAttribute("searchWord",command.getArticleList(search_select, request.getParameter("searchWord")));	
	
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
	
	@RequestMapping("free/reply")
	public String reply(@RequestParam("free_num") int free_num, @RequestParam("reply_num") String reply_num, @RequestParam("reply_name") String reply_name, @RequestParam("reply_password") String reply_password,  @RequestParam("reply_content") String reply_content, Model model) {
		command.reply_input(free_num, reply_num, reply_name, reply_password, reply_content);
		
		//댓글을 쓴만큼 타이틀옆에 댓글개수를 표시한다.
		//댓글을 하나 쓰면 title_reply_num을 받는다.
		//받은 타이틀리플라이넘을 모델에 넣는다.
		//그리고 리스트단에서 불러오게 한다.
		return "redirect:content_view?free_num="+free_num;
	}
	
	@RequestMapping("free/reply_delete") //입력value가 매핑url뒤에 ?쿼리문으로 붙어들어옴
	public String replyDelete(@RequestParam("free_num") int free_num, @RequestParam("reply_delete") String reply_delete, Model model){
		
		command.reply_delete(reply_delete);
		System.out.println("딜리트넘버는 "+reply_delete+"입니다");
		
		return "redirect:content_view?free_num="+free_num;
		
		//정상추가로직후, 딜리트로직
		//${reply2.reply_num}을 받는다
	}
}
