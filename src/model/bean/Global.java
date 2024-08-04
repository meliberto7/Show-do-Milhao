package model.bean;

import java.util.ArrayList;
import java.util.List;


public class Global {
    private static int id;
    public static List<Perguntas> perguntas = new ArrayList();
    public static List<String> numeros = new ArrayList();
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

    public static List<String> getNumeros() {
        return numeros;
    }

    public static void setNumeros(List<String> numeros) {
        Global.numeros = numeros;
    }
    
    
}
