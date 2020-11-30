package SpringPractice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import SpringPractice.entity.NoticeEntity;




public interface NoticeDao extends JpaRepository<NoticeEntity, Long> {

	@Query
	NoticeEntity findByIdx(Long idx);

}
