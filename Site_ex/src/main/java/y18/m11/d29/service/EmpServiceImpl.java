package y18.m11.d29.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import y18.m11.d29.dao.PhotoBoardDao;

import y18.m11.d29.domain.PhotoBoard;

@Service("empService")
public class EmpServiceImpl implements EmpService{
		@Autowired
		private PhotoBoardDao photoboardDao;

		@Override
		public int getAllPhotoCount() {
			return photoboardDao.getAllPhotoBoardCount();
		}
		@Override
		public PhotoBoard selectPhotoBoard(int photoboard_number) {
			PhotoBoard photoboard = photoboardDao.selectPhotoBoard(photoboard_number);
			return photoboard;
		}
		@Override
		public List<Integer> getAllPhotoBoardNumber() {
			return photoboardDao.getAllPhotoBoardNumber();
		}
		@Override
		public void insertPhotoBoard(PhotoBoard photoboard) {
			photoboardDao.insertPhotoBoard(photoboard);
		}
		@Override
		public List<PhotoBoard> getAllPhotoBoards() {
			 return photoboardDao.getAllPhotoBoards();
		}
		@Override
		public void updatePhotoBoard(PhotoBoard photoboard) {
			photoboardDao.updatePhotoBoard(photoboard);
		}
		@Override
		public void deletePhotoBoard(int photoboard_number) {
			photoboardDao.deletePhotoBoard(photoboard_number);
		}
}
