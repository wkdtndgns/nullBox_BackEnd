package net.skhu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.skhu.domain.question;;

public interface QuestionRepository extends JpaRepository<question, Integer> {
	
	
	List<question> findByCategoryIdOrCategoryId(int id1,int id2);
	
    @Query("SELECT q.id , q.name FROM question q "
    		+ "WHERE categoryId =?1 or categoryId=?2 or categoryId= ?3 "
    		+ "or categoryId =?4 or categoryId=?5 or categoryId= ?6")
    List<question> find(@Param("id1") int id1, @Param("id2") int id2,@Param("id3") int id3,
    		@Param("id4") int id4, @Param("id5") int id5,@Param("id6") int id6
    		);



}