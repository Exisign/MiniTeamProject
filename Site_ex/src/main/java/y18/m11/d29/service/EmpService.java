package y18.m11.d29.service;

import java.util.List;

import y18.m11.d29.domain.PhotoBoard;

public interface EmpService {
	int getAllPhotoCount();
	PhotoBoard selectPhotoBoard(int photoboard_number);
	List<Integer> getAllPhotoBoardNumber();
	void insertPhotoBoard(PhotoBoard photoboard);
	List<PhotoBoard> getAllPhotoBoards();
	void updatePhotoBoard(PhotoBoard photoboard);
	void deletePhotoBoard(int photoboard_number);
}
