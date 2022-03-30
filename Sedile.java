/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractdemoauto;

/**
 *
 * @author PPiC
 */
public class Sedile {
    String materiale;
    int costo;

    public Sedile(String materiale, int costo) {
        this.materiale = materiale;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Sedile{" + "materiale=" + materiale + ", costo=" + costo + '}';
    }

    
    public String getMateriale() {
        return materiale;
    }

    public int getCosto() {
        return costo;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    
    
    
}




