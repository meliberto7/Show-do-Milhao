/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author costa
 */
public class Global {
    private static int id;
    public static List<Perguntas> perguntas = new ArrayList();
    public static int numeroPergunta = 0;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Global.id = id;
    }

    public static List<Perguntas> getPerguntas() {
        return perguntas;
    }

    public static void setPerguntas(List<Perguntas> perguntas) {
        Global.perguntas = perguntas;
    }

    public static int getNumeroPergunta() {
        return numeroPergunta;
    }

    public static void setNumeroPergunta(int numeroPergunta) {
        Global.numeroPergunta = numeroPergunta;
    }

   

    
    
}
