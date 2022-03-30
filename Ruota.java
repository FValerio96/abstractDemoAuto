/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractdemoauto;

/**
 *
 * @author PPiC
 */
public class Ruota {
    private int pollici;
    
       public Ruota(int pollici) {
        this.pollici = pollici;
    }
    
    public void setRuota(int pollici){
        this.pollici = pollici;
    }

    public int getPollici() {
        return pollici;
    }   

    @Override
    public String toString() {
        return "Ruota{" + "pollici=" + pollici + '}';
    }
    
    
}
