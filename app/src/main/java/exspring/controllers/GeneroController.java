package exspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import exspring.repositories.GeneroRepository;

@Controller
@RequestMapping("/generos")
public class GeneroControler{
    @Autowired
    private GeneroRepository generosRepo;

    @RequestMapping("list")
    public String list(Model model) {
        model.addAtribute("generos", this.generosRepo.findAll());
        return "list";
    }
}