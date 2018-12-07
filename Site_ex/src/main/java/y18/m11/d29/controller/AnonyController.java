package y18.m11.d29.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import y18.m11.d29.service.AnonyService;

@Controller
public class AnonyController {

	@Resource(name = "anonyService")
	AnonyService service;

	@RequestMapping("anonymous/list")
	public String list(Model model) {

		model.addAttribute("list", service.listDao());

		return "anonymous/list";
	}

	@RequestMapping("anonymous/writeForm")
	public String writeForm() {

		return "anonymous/writeForm";
	}

	@RequestMapping("anonymous/write")
	public String write(@RequestParam String title, @RequestParam String content,@RequestParam String user_id, Model model) {

		System.out.println(title);
		System.out.println(content);
		System.out.println(user_id);
		service.writeDao(title, content,user_id);

		return "redirect:/anonymous/list";
	}

	@RequestMapping("anonymous/view")
	public String view() {

		return "anonymous/view";
	}

	@RequestMapping("anonymous/delete")
	public String delete(@RequestParam String num, Model model) {

		service.deleteDao(num);

		return "redirect:/anonymous/list";
	}

	@RequestMapping("anonymous/content_view")
	public String content_view(@RequestParam String num,Model model) {
		
		
		service.upHit(num);

		model.addAttribute("content_view", service.contentView(num));
		model.addAttribute("reply",service.reply(num));
		
		return "anonymous/content_view";
	}
	
	@RequestMapping("anonymous/stranger")
	public String stranger(@RequestParam String anony_num,@RequestParam String content) {
		service.insertReply(anony_num, content);
		return "redirect:/anonymous/content_view?num="+anony_num;
	}

	@RequestMapping("anonymous/modify_view")
	public String modify_view(@RequestParam String num, Model model) {
		model.addAttribute("num", num);
		return "anonymous/modify";
	}

	@RequestMapping("anonymous/modify")
	public String modify(@RequestParam String title, @RequestParam String content, @RequestParam String num,
			Model model) {

		service.modify(title, content, num);

		return "redirect:/anonymous/list";

	}
	
/*	@RequestMapping("/insert_reply") //댓글넣기
	public String insert_reply(@RequestParam String anony_num,@RequestParam String content,Model model,HttpSession session) {
		
		service.insertReply(anony_num, content);
		model.addAttribute("reply",service.reply(anony_num));
		session.setAttribute("anony_num", anony_num);
		
		System.out.println("1:"+anony_num);
		
		return "content_view";
	}*/
	
	
	@RequestMapping("anonymous/search_list")
	public void search_list(@RequestParam String searchWord, Model model) {

		model.addAttribute("search_list", service.searchList(searchWord));
		System.out.println(service.searchList(searchWord));

	}

}
