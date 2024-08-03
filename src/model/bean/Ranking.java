/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Senai
 */
public class Ranking {
    private int idRanking;
    private int usuario_Id;
    private String nome;
    private int pontuacao;

    public Ranking() {
    }

    public Ranking(int idRanking, int usuario_Id, String nome, int pontuacao) {
        this.idRanking = idRanking;
        this.usuario_Id = usuario_Id;
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public int getIdRanking() {
        return idRanking;
    }

    public void setIdRanking(int idRanking) {
        this.idRanking = idRanking;
    }

    public int getUsuario_Id() {
        return usuario_Id;
    }

    public void setUsuario_Id(int usuario_Id) {
        this.usuario_Id = usuario_Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    

}