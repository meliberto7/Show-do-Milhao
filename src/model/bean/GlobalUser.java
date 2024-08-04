
package model.bean;


public class GlobalUser {
    
    private static int id;
    private static String usuario;
    private static String nome;
    private static String senha;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        GlobalUser.id = id;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        GlobalUser.usuario = usuario;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        GlobalUser.nome = nome;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        GlobalUser.senha = senha;
    }
    
    
    
}
