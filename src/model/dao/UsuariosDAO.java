/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.GlobalUser;
import model.bean.Usuarios;

/**
 *
 * @author Senai
 */
public class UsuariosDAO {
    private String usuario;
    private String senha;
    public List<Usuarios> ler(){
   List<Usuarios> usuarios = new ArrayList();
    
    try{
   Connection conexao = Conexao.conectar();
   PreparedStatement stmt = null;
   ResultSet rs = null;
   stmt = conexao.prepareStatement("select * from usuarios");
   rs = stmt.executeQuery();
   
   while(rs.next()){
     Usuarios usuario = new Usuarios();
     usuario.setIdUsuario(rs.getInt("id"));
     usuario.setUsuario(rs.getString("usuario"));
     usuario.setUsuario(rs.getString("nome"));
     usuario.setSenha((rs.getString("senha")));
    
     
     
     usuarios.add(usuario);
     System.out.println("Usuario: "+usuario.getUsuario()); 
   
   }
   rs.close();
   stmt.close();
   conexao.close();
   
   }catch (SQLException e){
   e.printStackTrace();
   
   }
   
   return usuarios;
   }
    
    public void cadastrar(Usuarios usuario){
try{
   Connection conexao = Conexao.conectar();
   PreparedStatement stmt = null;
   
   stmt = conexao.prepareStatement(
   "INSERT INTO usuarios (usuario, nome, senha) VALUES (?, ?, ?)"
   );
   
   
   stmt.setString(1, usuario.getUsuario());
   stmt.setString(2, usuario.getNome());
   stmt.setString(3, usuario.getSenha());
   
   

   stmt.executeUpdate();
   stmt.close();
   conexao.close();

}catch(SQLException e){
e.printStackTrace();
}
}
    public Usuarios verificarLogin(String usuario, String senha){
       Usuarios loginValido = new Usuarios();
try{
   Connection conexao = Conexao.conectar();
   PreparedStatement stmt = null;
   ResultSet rs = null;
   
   stmt = conexao.prepareStatement(
   "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?"
   );
   
   stmt.setString(1, usuario );
   stmt.setString(2, senha);
   

   rs = stmt.executeQuery();
   if(rs.next()){
       loginValido.setIdUsuario(rs.getInt("id"));
       GlobalUser.setId(rs.getInt("id"));
       GlobalUser.setNome(rs.getString("nome"));
       GlobalUser.setUsuario(rs.getString("usuario"));
       GlobalUser.setSenha(rs.getString("senha"));
   }

}catch(SQLException e){
e.printStackTrace();;
}
       return loginValido;

   }


}
