/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclista;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Ciclista> ciclistas = new ArrayList<>();
    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    public void agregarCiclista(Ciclista c) {
        ciclistas.add(c);
        c.setEquipo(this); 
    }
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Ciclista> getCiclistas() {
        return ciclistas;
    }
}