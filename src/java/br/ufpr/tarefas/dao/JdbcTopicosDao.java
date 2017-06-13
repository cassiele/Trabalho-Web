/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.tarefas.dao;

import br.ufpr.tarefas.jdbc.MysqlConnectionFactory;

import br.ufpr.tarefas.model.Topicos;
import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
/**
 *
 * @author julio
 */
public class JdbcTopicosDao {
    private Connection connection;

    public JdbcTopicosDao() {
        connection = (new MysqlConnectionFactory()).getConnection();
    }
    
    //metodo que adiciona no banco de dados
    public void adiciona(Topicos topicos) {
        String sql = "insert into topicos " + "(descricao) " + "values (?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, topicos.getDescricao());    
           
//            stmt.setDate(3, new Date(tarefa.getDataFinalizacao().getTimeInMillis()));
            // executa
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
    public List<Topicos> lista() {
        String sql = "select * from topicos";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Topicos> topicos = new ArrayList<Topicos>();
            while (rs.next()) {
                Topicos topico = new Topicos();
                topico.setId(rs.getLong("id"));
                topico.setDescricao(rs.getString("descricao"));                      
              
                topicos.add(topico);
            }
            stmt.close();
            return topicos;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
        public List<Topicos> getLista() {
        String sql = "select * from topicos";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Topicos> topicos = new ArrayList<Topicos>();
            while (rs.next()) {
                Topicos topico = new Topicos();
                topico.setId(rs.getLong("id"));
                topico.setDescricao(rs.getString("descricao"));                             
                

               topicos.add(topico);
            }
            stmt.close();
            return topicos;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
    
}
