package y18.m11.d29.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import y18.m11.d29.dao.UserInfoDao;
import y18.m11.d29.domain.User_Info;

@Service("loginService")
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired UserInfoDao userinfodao;
	
	@Override
	public String checkLogin(User_Info userinfo, HttpSession session) {
		System.out.println("checkLogin");
		System.out.println(userinfo);
		System.out.println("/"+userinfodao.checkLogin(userinfo)+"/");
		
		String result = userinfodao.checkLogin(userinfo);
		
		if(result==null) {
			System.out.println("정보 없음");
			return "redirect:/login";
		}else {
			session.setAttribute("user", result);
			System.out.println("정보 조회됨");
			return "redirect:/main";
		}
	}

	@Override
	public boolean checkId(User_Info userinfo) {
		if(userinfodao.checkId(userinfo)=="") {	
			return false;
		}else {
			return true;
		}
	}

	@Override
	public void checkout(HttpSession session) {
		session.removeAttribute("user");
	}

	/**
	 * 아이디에 대한 중복 확인
	 */
	@Override
	public String tryJoin(User_Info userinfo) {
		System.out.println("checkJoin");
		System.out.println(userinfo);
		System.out.println("/"+userinfodao.checkLogin(userinfo)+"/");
		
		if(userinfodao.checkId(userinfo)==null&&userinfodao.checkNickName(userinfo)==null) {
			System.out.println("가입 진행");
			userinfodao.tryJoin(userinfo);
			return "redirect:/main";
		}else if(userinfodao.checkId(userinfo)!=null) {
			System.out.println("아이디 중복 됨");
			return "redirect:/join";
		}else{
			System.out.println("닉네임 중복 됨");
			return "redirect:/join";
		}
	}
}
