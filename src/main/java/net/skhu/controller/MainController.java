package net.skhu.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.domain.category;
import net.skhu.domain.game;
import net.skhu.domain.question;
import net.skhu.repository.CategoryRepository;
import net.skhu.repository.GameRepository;
import net.skhu.repository.QuestionRepository;

@RestController
@RequestMapping("api")
public class MainController {

	@Autowired GameRepository game;
	@Autowired CategoryRepository category;
	@Autowired QuestionRepository question;
	
    @RequestMapping("list")
    public List<game> list(Model model) {
        List<game> list = game.findAll();
        model.addAttribute("list", list);
  
        return list;
    }
       
    @RequestMapping("category/{id}")
    public List<category> category(@PathVariable("id") int id) {  	
    	List<category> list = category.findByGameId(id);   	
    	
    	return list;
    }
    @RequestMapping("category/{id1}/{id2}")
    public List<category> categoryDifficult(@PathVariable("id1") int id1,@PathVariable("id2") int id2) {  	
    	List<category> list = category.findByGameIdAndDifficult(id1,id2);
    	
    	Collections.shuffle(list); 
    	
    	return list;
    }
    

    
    @RequestMapping("question")
    public List<question> question(@RequestParam("ids") String ids) {  	//  map 이용해 호출하든지   requestBody를 이용해서 list 객체를 호출해야한
    	
    	int[] id = new int[18];
    	int i=0;
    	String[] arr = ids.split(",");
    	for(String s : arr) {
    		id[i]=Integer.valueOf(s);
    		i++;
    	}
    	
    	List<question> list = question.find(id[0], id[1], id[2],id[3],id[4],id[5],
    			id[6], id[7], id[8],id[9],id[10],id[11],id[12], id[13], id[14],id[15],id[16],id[17]
    								);
     	
    	Collections.shuffle(list); 
    	
    	return list;
    }
    
    @RequestMapping("question/all")
    public List<question> questionAll() {  	//  map 이용해 호출하든지   requestBody를 이용해서 list 객체를 호출해야한
    	
    	
    	List<question> list = question.findAll();
    	Collections.shuffle(list); 
    	
    	return list;
    }
    
}
