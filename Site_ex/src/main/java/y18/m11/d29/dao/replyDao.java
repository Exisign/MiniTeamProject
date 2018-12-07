package y18.m11.d29.dao;

import java.util.ArrayList;

import y18.m11.d29.domain.ReplyDto;

public interface replyDao {

	 // 댓글 목록
    public ArrayList<ReplyDto> reply(String anony_num);
    
    public void insertReply(String anony_num, String content);


}
