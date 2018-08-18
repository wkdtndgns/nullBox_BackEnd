package net.skhu.service;
import java.util.List;

import net.skhu.domain.*;


public interface MainService {
	
	
	public List<question> findQuestion(int id1,int id2,int id3,int id4,int id5,
									int id6,int id7,int id8,int id9,int id10,int id11,int id12,
									int id13,int id14,int id15,int id16,int id17,int id18
									);
	
	public List<question> questionAll();
	
	public List<game> gameAll();
	
	public List<category> findCategoryByGameId(int id);
	
	public List<category> findCategoryByGameIdAndDifficult(int id1 ,int id2);


}
