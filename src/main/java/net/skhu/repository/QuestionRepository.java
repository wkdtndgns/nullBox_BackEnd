package net.skhu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.skhu.domain.question;;

public interface QuestionRepository extends JpaRepository<question, Integer> {
	
	List<question> findAll();
	
	
    @Query("SELECT q.id , q.name FROM question q "
    		+ "WHERE categoryId =?1 or categoryId=?2 or categoryId= ?3 "
    		+ "or categoryId =?4 or categoryId=?5 or categoryId= ?6 "
    		+ "or categoryId =?7 or categoryId=?8 or categoryId= ?9 "
    		+ "or categoryId =?10 or categoryId=?11 or categoryId= ?12 "
    		+ "or categoryId =?13 or categoryId=?14 or categoryId= ?15 "
    		+ "or categoryId =?16 or categoryId=?17 or categoryId= ?18 "
    		)
    List<question> find(@Param("id1") int id1, @Param("id2") int id2,@Param("id3") int id3,
    		@Param("id4") int id4, @Param("id5") int id5,@Param("id6") int id6,
    		@Param("id7") int id7, @Param("id8") int id8,@Param("id9") int id9,
    		@Param("id10") int id10, @Param("id11") int id11,@Param("id12") int id12,
    		@Param("id13") int id13, @Param("id14") int id14,@Param("id15") int id15,
    		@Param("id16") int id16, @Param("id17") int id17,@Param("id18") int id18
    		);



}