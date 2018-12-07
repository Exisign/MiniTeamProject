package y18.m11.d29.service;

import javax.servlet.http.HttpSession;

import y18.m11.d29.domain.User_Info;

public interface UserInfoService{
	String checkLogin(User_Info userinfo, HttpSession session);
	String tryJoin(User_Info userinfo);
	boolean checkId(User_Info userinfo);
	void checkout(HttpSession session);
}
