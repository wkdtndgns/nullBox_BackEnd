package net.skhu.service.serivceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.skhu.domain.*;
import net.skhu.repository.*;
import net.skhu.service.MainService;

@Service
public class MainServiceImpl implements MainService{
	
	@Autowired 
	CategoryRepository categoryRespository;
	
	@Autowired 
	GameRepository gameRepository;
	
	@Autowired 
	QuestionRepository questionRepository;
	

	@Override
	public List<question> questionAll() {
		
		List<question> list =questionRepository.findAll();
		
		return list;
	}


	@Override
	public List<game> gameAll() {
		
		List<game> list = gameRepository.findAll();
		
		return list;
	}


	@Override
	public List<category> findCategoryByGameIdAndDifficult(int id1 ,int id2) {
		List<category> list =categoryRespository.findByGameIdAndDifficult(id1, id2);
		return list;
	}


	@Override
	public List<category> findCategoryByGameId(int id) {
		List<category> list = categoryRespository.findByGameId(id);
		return list;
	}


	@Override
	public List<question> findQuestion(int id1, int id2, int id3, int id4, int id5, int id6, int id7, int id8, int id9,
			int id10, int id11, int id12, int id13, int id14, int id15, int id16, int id17, int id18) {
		List<question> list = questionRepository.find(id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id13, id14, id15, id16, id17, id18);
		
		
		return list;
	}

	
}
