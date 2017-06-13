/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.tarefas.controllers;

import br.ufpr.tarefas.model.Comentarios;
import br.ufpr.tarefas.dao.JdbcComentariosDao;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author julio
 */
@Controller
public class ComentariosController {
     @RequestMapping("/novoComentario")
    public String form(){
        return "comentario/formulario";
    }

    @RequestMapping("/adicionaComentario")
    public String adicionar(@Valid Comentarios comentarios, BindingResult result) {
        if (result.hasErrors()) {
            return "comentario/formulario";
        }
        JdbcComentariosDao dao = new JdbcComentariosDao();
        dao.adiciona(comentarios, );
        return "comentario/adicionada";
    }
}
