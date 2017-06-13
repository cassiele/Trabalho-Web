/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.tarefas.dao;

import br.ufpr.tarefas.jdbc.MysqlConnectionFactory;
import br.ufpr.tarefas.model.Comentarios;
import br.ufpr.tarefas.model.Topicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author julio
 */
public class JdbcComentariosDao {
     private Connection connection;

    public JdbcComentariosDao() {
        connection = (new MysqlConnectionFactory()).getConnection();
    }
    
    //metodo que adiciona no banco de dados
    public void adiciona(Comentarios comentario, int id_topico) {
        String sql = "insert into comentarios " + "(descricao, id_topico) " + "values (?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, comentario.getComentario()); 
            stmt.setInt(2, comentario.getId_Comentario());
           
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
    
}
