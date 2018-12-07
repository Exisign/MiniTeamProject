package y18.m11.d29.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import y18.m11.d29.dao.AnonymousBoardDao;
import y18.m11.d29.dao.replyDao;
import y18.m11.d29.domain.Anonymous;
import y18.m11.d29.domain.ReplyDto;

@Service("anonyService")
public class AnonyServiceImpl implements AnonyService {

	@Autowired
	AnonymousBoardDao dao;

	@Autowired
	replyDao replyDao;

	@Override
	public ArrayList<Anonymous> listDao() {
		return dao.listDao();
	}

	@Override
	public void writeDao(String title, String content,String user_id) {
		dao.writeDao(title, content,user_id);
	}

	@Override
	public Anonymous viewDao(String strID) {
		return dao.viewDao(strID);
	}

	@Override
	public void deleteDao(String anony_num) {
		dao.deleteDao(anony_num);
	}

	@Override
	public Anonymous contentView(String anony_num) {
		return dao.contentView(anony_num);
	}

	@Override
	public void upHit(String anony_num) {
		dao.upHit(anony_num);
	}

	@Override
	public void modify(String title, String content, String anony_num) {
		dao.modify(title, content, anony_num);
	}

	@Override
	public ArrayList<Anonymous> searchList(String searchWord) {

		return dao.searchList(searchWord);
	}

	@Override
	public ArrayList<ReplyDto> reply(String anony_num){
		return replyDao.reply(anony_num);
	}

	@Override
	public void insertReply(String anony_num, String content) {
		replyDao.insertReply(anony_num, content);
	}


}