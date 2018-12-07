package y18.m11.d29.dao;

import y18.m11.d29.domain.User_Info;

public interface UserInfoDao {
	/**
	 * 아이디와 비밀번호를 가지고 데이터를 조회함. 해당되는 자료가 없을 경우 null, 있을 경우 해당되는 id를 반환할 예정임
	 * @param user_id
	 * @param user_pw
	 * @return
	 */
	String checkLogin(User_Info userinfo);
	/**
	 * 해당되는 user_id가 있으면 그것 return, 없으면 null
	 * @param user_id
	 * @return
	 */
	String checkId(User_Info userinfo);
	/**
	 * 해당되는 user_nickname이 있으면 그것 return, 없으면 null
	 * @param userinfo
	 * @return
	 */
	String checkNickName(User_Info userinfo);
	/**
	 * 입력 된 정보를 통해서 insert문을 실행한다.
	 * @param userinfo
	 */
	void tryJoin(User_Info userinfo);
}
