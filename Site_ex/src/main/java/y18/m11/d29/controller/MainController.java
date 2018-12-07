package y18.m11.d29.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.SessionScope;
import org.springframework.web.method.annotation.SessionAttributesHandler;

import y18.m11.d29.domain.User_Info;
import y18.m11.d29.service.UserInfoService;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	UserInfoService userInfoService;
	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String mainCall(Locale locale, Model model) {
		System.out.println("main");
		
		return "/frame/main";
	}
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		System.out.println("loginForm");
		return "frame/login";
	}
	@RequestMapping(value="/login/try", method = RequestMethod.POST)
	public String loginTry(@ModelAttribute User_Info user_info, HttpSession session) {
		System.out.println("login");
		System.out.println(user_info);
		
		return userInfoService.checkLogin(user_info, session);
	}
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		System.out.println("logout");
		userInfoService.checkout(session);
		return "redirect:/main";
	}
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public String join() {
		System.out.println("join");
		return "frame/join";
	}
	@RequestMapping(value="/join/try", method = RequestMethod.POST)
	public String joinTry(@ModelAttribute User_Info user_info) {
		System.out.println("join/try");
		System.out.println(user_info);
		
		return userInfoService.tryJoin(user_info);
	}
//	@RequestMapping(value="notice", method = RequestMethod.GET)
//	public String notice(Locale locale, Model model) {
//		System.out.println("notice");
//		return "notice/list";
//	}
//	@RequestMapping(value="photoboard", method = RequestMethod.GET)
//	public String photoboard(Locale locale, Model model) {
//		System.out.println("photo");
//		return "photo/list";
//	}
//	@RequestMapping(value="freeboard", method = RequestMethod.GET)
//	public String freeboard(Locale locale, Model model) {
//		System.out.println("free");
//		return "free/list";
//	}
//	@RequestMapping(value="annonymousboard", method = RequestMethod.GET)
//	public String annonymousboard(Locale locale, Model model) {
//		System.out.println("annonymous");
//		return "annonymous/list";
//	}
}
