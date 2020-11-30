package SpringPractice.service;

import java.util.List;

import SpringPractice.entity.NoticeEntity;





public interface NoticeService {
	
	List<NoticeEntity> noticelist();

	void save(NoticeEntity noticeEntity);

	NoticeEntity getByIdx(long idx);

	void deleteByIdx(long idx);
	
//	void save(TestBoard testBoard);
//
//	List<TestBoard> getList();
//
//	TestBoard findIdx(Long idx);
//
//	void delete(Long idx);
//
//	void update(TestBoard testBoard);



}
