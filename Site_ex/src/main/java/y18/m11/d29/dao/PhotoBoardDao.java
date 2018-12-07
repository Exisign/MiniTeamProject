package y18.m11.d29.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import y18.m11.d29.domain.PhotoBoard;

public interface PhotoBoardDao {

	int getAllPhotoBoardCount();
	PhotoBoard selectPhotoBoard(int photoboard_number);
	List<Integer> getAllPhotoBoardNumber();
	void insertPhotoBoard(PhotoBoard photoboard);
	List<PhotoBoard> getAllPhotoBoards();
	void updatePhotoBoard(PhotoBoard photoboard);
	void deletePhotoBoard(int photoboard_number);
	String[] getColumnNames();
}
