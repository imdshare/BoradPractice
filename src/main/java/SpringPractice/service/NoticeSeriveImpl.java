package SpringPractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringPractice.dao.NoticeDao;
import SpringPractice.entity.NoticeEntity;

@Service
public class NoticeSeriveImpl implements NoticeService{
	
	@Autowired
	NoticeDao noticeDao;
//
//	@Override
//	public void save(TestBoard testBoard) {
//		dao.save(testBoard);
//	}
//
//	@Override
//	public List<TestBoard> getList() {
//		List<TestBoard> list =dao.findAll();
//		return list;
//	}
//
//	@Override
//	public TestBoard findIdx(Long idx) {
//		TestBoard result = dao.findById(idx).orElse(null);
//		System.out.println(result);
//		return result;
//	}
//
//	@Override
//	public void delete(Long idx) {
//		dao.deleteById(idx);
//	}
//
//	@Transactional
//	@Override
//	public void update(TestBoard testBoard) {
//		dao.findByIdx(testBoard.getIdx());
//		dao.save(testBoard);
//	}

	@Override
	public List<NoticeEntity> noticelist() {
		// TODO Auto-generated method stub
		return noticeDao.findAll();
	}

	@Override
	public void save(NoticeEntity noticeEntity) {
		// TODO Auto-generated method stub
		noticeDao.save(noticeEntity);
	}

	@Override
	public NoticeEntity getByIdx(long idx) {
		// TODO Auto-generated method stub
		return noticeDao.findById(idx).orElse(null);//이거 아니면 idx는 null이다
	}

	@Override
	public void deleteByIdx(long idx) {
		// TODO Auto-generated method stub
		noticeDao.deleteById(idx);
	}



}
