package net.skhu.controller;

import java.util.List;
import java.util.Map;

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
    

    
    @RequestMapping("question")
    public List<question> question(@RequestParam("ids") String ids) {  	//  map 이용해 호출하든지   requestBody를 이용해서 list 객체를 호출해야한
    	
    	int[] id = new int[10];
    	int i=0;
    	String[] arr = ids.split(",");
    	for(String s : arr) {
    		id[i]=Integer.valueOf(s);
    		i++;
    	}
    	System.out.println(id[4]);
    	List<question> list = question.find(id[0], id[1], id[2],id[3],id[4],id[5]);
     	
    	return list;
    }
    
    @RequestMapping("question/all")
    public List<question> questionAll() {  	//  map 이용해 호출하든지   requestBody를 이용해서 list 객체를 호출해야한
    	
    	
    	List<question> list = question.findAll();
     	
    	return list;
    }
    
}
