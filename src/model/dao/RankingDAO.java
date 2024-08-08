
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Ranking;


public class RankingDAO {
    private String ranking;
    
     public List<Ranking> ler(){
        List<Ranking> rankings = new ArrayList<>();
        
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = conexao.prepareStatement("SELECT id, usuario_id, nome, pontuacao FROM ranking ORDER BY pontuacao DESC ");
            rs = stmt.executeQuery();
   
            while(rs.next()){
                Ranking ranking = new Ranking();
                ranking.setIdRanking(rs.getInt("id"));
                ranking.setUsuario_Id(rs.getInt("usuario_id"));
                ranking.setNome(rs.getString("nome"));
                ranking.setPontuacao(rs.getInt("pontuacao"));
    
                rankings.add(ranking);
                 
            }
            rs.close();
            stmt.close();
            conexao.close();
   
        }catch (SQLException e){
            e.printStackTrace();
        }
   
        return rankings;
    }
    public void adicionarPontuacao(Ranking rank) {
    try {
        Connection conexao = Conexao.conectar();
        PreparedStatement stmt = null;

        // Verificar se o usuário já tem uma pontuação na tabela ranking
        stmt = conexao.prepareStatement("SELECT * FROM ranking WHERE usuario_id = ?");
        stmt.setInt(1, rank.getUsuario_Id());
        //stmt.setInt(2, rank.getPontuacao());
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            // Se o usuário já tem uma pontuação, atualizar a pontuação
            int novaPontuacao = rs.getInt("pontuacao");
            if (novaPontuacao < rank.getPontuacao()) {
                
                stmt = conexao.prepareStatement("UPDATE ranking SET pontuacao = ? WHERE usuario_id = ?");
                stmt.setInt(1, rank.getPontuacao());
                stmt.setInt(2, rank.getUsuario_Id());
                stmt.executeUpdate();
                
            }
            
            
        } else {
            // Se o usuário não tem uma pontuação, inserir uma nova linha na tabela
            stmt = conexao.prepareStatement("INSERT INTO ranking (usuario_id, pontuacao, nome) VALUES (?, ?, ?)");
            stmt.setInt(1, rank.getUsuario_Id());
            stmt.setInt(2, rank.getPontuacao());
            stmt.setString(3, rank.getNome());
            stmt.executeUpdate();
        }

        rs.close();
        stmt.close();
        conexao.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    
}