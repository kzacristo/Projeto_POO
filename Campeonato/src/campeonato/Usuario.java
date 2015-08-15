
package campeonato;

public class Usuario {
    private String userid;
    private String senha;

    public Usuario(String userid, String senha) {
        this.userid = userid;
        this.senha = senha;
    }

    public String getUserid() {
        return userid;
    }

    public String getSenha() {
        return senha;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
    
    
}
