/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

/**
 *
 * @author Senai
 */


import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Perguntas;

public class PerguntasDAO {
    public List<Perguntas> ler() {
        List<Perguntas> perguntas = new ArrayList<>();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM perguntas");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Perguntas pergunta = new Perguntas();
                pergunta.setIdPerguntas(rs.getInt("id"));
                pergunta.setCategoria_Id(rs.getInt("categoria_id"));
                pergunta.setPergunta(rs.getString("pergunta"));
                pergunta.setAlternativa1(rs.getString("alternativa1"));
                pergunta.setAlternativa2(rs.getString("alternativa2"));
                pergunta.setAlternativa3(rs.getString("alternativa3"));
                pergunta.setAlternativa4(rs.getString("alternativa4"));
                pergunta.setCorreta(rs.getString("correta"));
                
                perguntas.add(pergunta);
                System.out.println("Pergunta: " + pergunta.getPergunta());
            }
            
            rs.close();
            stmt.close();
            conexao.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return perguntas;
    }
    public List<Perguntas> lerPorCategoria(int categoriaId) {
        List<Perguntas> perguntas = new ArrayList<>();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM perguntas WHERE categoria_id = ?");
            stmt.setInt(1, categoriaId);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Perguntas pergunta = new Perguntas();
                pergunta.setIdPerguntas(rs.getInt("id"));
                pergunta.setCategoria_Id(rs.getInt("categoria_id"));
                pergunta.setPergunta(rs.getString("pergunta"));
                pergunta.setAlternativa1(rs.getString("alternativa1"));
                pergunta.setAlternativa2(rs.getString("alternativa2"));
                pergunta.setAlternativa3(rs.getString("alternativa3"));
                pergunta.setAlternativa4(rs.getString("alternativa4"));
                pergunta.setCorreta(rs.getString("correta"));
                
                perguntas.add(pergunta);
               
            }
            
            rs.close();
            stmt.close();
            conexao.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return perguntas;
    }
    
}




