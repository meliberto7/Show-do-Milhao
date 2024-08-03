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
public class Perguntas {
    
        private int idPerguntas;
        private int categoria_Id;
        private String pergunta;
        private String alternativa1;
        private String alternativa2;
        private String alternativa3;
        private String alternativa4;
        private String correta;

    public Perguntas() {
    }

    public Perguntas(int idPerguntas, int categoria_Id, String pergunta, String alternativa1, String alternativa2, String alternativa3, String alternativa4, String correta) {
        this.idPerguntas = idPerguntas;
        this.categoria_Id = categoria_Id;
        this.pergunta = pergunta;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.correta = correta;
    }

    public int getIdPerguntas() {
        return idPerguntas;
    }

    public void setIdPerguntas(int idPerguntas) {
        this.idPerguntas = idPerguntas;
    }

    public int getCategoria_Id() {
        return categoria_Id;
    }

    public void setCategoria_Id(int categoria_Id) {
        this.categoria_Id = categoria_Id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getAlternativa1() {
        return alternativa1;
    }

    public void setAlternativa1(String alternativa1) {
        this.alternativa1 = alternativa1;
    }

    public String getAlternativa2() {
        return alternativa2;
    }

    public void setAlternativa2(String alternativa2) {
        this.alternativa2 = alternativa2;
    }

    public String getAlternativa3() {
        return alternativa3;
    }

    public void setAlternativa3(String alternativa3) {
        this.alternativa3 = alternativa3;
    }

    public String getAlternativa4() {
        return alternativa4;
    }

    public void setAlternativa4(String alternativa4) {
        this.alternativa4 = alternativa4;
    }

    public String getCorreta() {
        return correta;
    }

    public void setCorreta(String correta) {
        this.correta = correta;
    }

        
}
