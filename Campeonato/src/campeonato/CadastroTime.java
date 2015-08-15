
package campeonato;


public class CadastroTime {
    
    public String nomeTime;
    public String sigla;    

    public CadastroTime() {
    }

    public CadastroTime(String nomeTime, String sigla) {
        this.nomeTime = nomeTime;
        this.sigla = sigla;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }      
  
    
}
