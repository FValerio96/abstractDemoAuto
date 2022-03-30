/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.abstractdemoauto;

/**
 *
 * @author PPiC
 */
public class AbstractDemoAuto {
    Ruota ruota;
    int n_ruote;
    Sedile sedile;
    int n_sedili;
 
    public AbstractDemoAuto(Ruota ruota, int n_ruote, Sedile sedile, int n_sedili) {
        this.ruota = ruota;
        this.n_ruote = n_ruote;
        this.sedile = sedile;
        this.n_sedili = n_sedili;
    }

    @Override
    public String toString() {
        return "AbstractDemoAuto{" + "ruota=" + ruota + ", n_ruote=" + n_ruote + ", sedile=" + sedile + ", n_sedili=" + n_sedili + '}';
    }
    
    

    
    
    
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Ruota r = new Ruota(12);
        Sedile s = new Sedile("pelle di pippo", 200);
        AbstractDemoAuto a = new AbstractDemoAuto(r, 4, s, 4);
        
        System.out.println(a.toString());
        
        
    }
}
