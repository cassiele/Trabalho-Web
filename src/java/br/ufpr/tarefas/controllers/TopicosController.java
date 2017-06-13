/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.tarefas.controllers;


import br.ufpr.tarefas.dao.JdbcTopicosDao;

import br.ufpr.tarefas.model.Topicos;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author julio
 */
@Controller
public class TopicosController {
    @RequestMapping("/novoTopico")
    public String form(){
        return "topicos/formulario";
    }
    
    @RequestMapping("/adicionaTopico")
    public String adicionar(@Valid Topicos topicos, BindingResult result){        
        if (result.hasErrors()){
            return "topicos/formulario";
        }
        
        JdbcTopicosDao dao = new JdbcTopicosDao();
        dao.adiciona(topicos);
        return "topicos/adicionada";
    }
    
      @RequestMapping("/listaTopicos")
    public String listar(Model model) {
        JdbcTopicosDao dao = new JdbcTopicosDao();
        List<Topicos> topicos = dao.getLista();
        model.addAttribute("topicos",topicos);
        return "topicos/lista";
    }
}
