/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author a1320858
 */
public class Jogo {
    
    private int id;
    private String timeLocal;
    private String timeVisitante;
    private int placarLocal;
    private int placarVisitante;

    public Jogo() {
    }
    
    public Jogo(int id, String timeLocal, String timeVisitante, int placarLocal, int placarVisitante) {
        this.id = id;
        this.timeLocal = timeLocal;
        this.timeVisitante = timeVisitante;
        this.placarLocal = placarLocal;
        this.placarVisitante = placarVisitante;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimeLocal() {
        return timeLocal;
    }

    public void setTimeLocal(String timeLocal) {
        this.timeLocal = timeLocal;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getPlacarLocal() {
        return placarLocal;
    }

    public void setPlacarLocal(int placarLocal) {
        this.placarLocal = placarLocal;
    }

    public int getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }
    
    public boolean partidaAcabou(){
        return true;
    }
    
    
    
}
