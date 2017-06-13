/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.tarefas.model;

import java.util.Calendar;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author julio
 */
public class Topicos {
     private Long id;
     private Long id_usuario;
    
    @NotNull @Size(min=5)
    private String descricao;
   
      
    //@DateTimeFormat(pattern="dd/MM/yyyy")
    //private Calendar dataFinalizacao;

    //getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_Usuario() {
        return id_usuario;
    }

    public void setId_Usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getDescricao() {
        return descricao;
    }
       
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
