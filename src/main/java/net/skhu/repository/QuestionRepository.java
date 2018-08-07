package net.skhu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.domain.question;;

public interface QuestionRepository extends JpaRepository<question, Integer> {
	
	
	List<question> findByCategoryIdOrCategoryId(int id1,int id2);


}