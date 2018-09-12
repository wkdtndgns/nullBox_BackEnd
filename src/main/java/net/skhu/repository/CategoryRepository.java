package net.skhu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.domain.category;


public interface CategoryRepository extends JpaRepository<category, Integer> {

	List<category> findByGameId(int id);
	List<category> findByGameIdAndDifficult(int id1, int id2);

}