package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.domain.game;
import net.skhu.repository.GameRepository;

@RestController
@RequestMapping("api")
public class MainController {

	@Autowired GameRepository game;
	
    @RequestMapping("list")
    public List<game> list(Model model) {
        List<game> list = game.findAll();
        model.addAttribute("list", list);
  
        return list;
    }
    



}
