package campeonato;

public class Time {
    
    public String nomeTime;
    public String sigla;
    public int inscrisao;

    public Time() {
    }

    public Time(String nomeTime, String sigla, int inscrisao) {
        this.nomeTime = nomeTime;
        this.sigla = sigla;
        this.inscrisao = inscrisao;
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

    public int getInscrisao() {
        return inscrisao;
    }

    public void setInscrisao(int inscrisao) {
        this.inscrisao = inscrisao;
    }    
    
}