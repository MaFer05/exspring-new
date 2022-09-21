package exspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model; //u-user;i-interface; -> usada quando quero passar uma informação para o jsp

import exspring.repositories.GeneroRepository;

@Controller
@RequestMapping("/generos")
public class GeneroController{
    @Autowired
    private GeneroRepository generosRepo;

    @RequestMapping("list")
    public String list(Model model) {
        model.addAttribute("generos", this.generosRepo.findAll());
        return "list";
    }

    @RequestMapping("insert")
    public String insert() {
        return "insert";
    }
}