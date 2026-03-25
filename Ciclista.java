/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclista;

public class Ciclista {
    private String nombre;
    private int tiempo;
    private Equipo equipo;
    public Ciclista(String nombre) {
        this.nombre = nombre;
        this.tiempo = 0;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}