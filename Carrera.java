/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclista;

import java.util.ArrayList;
import java.util.Random;

import java.util.*;
public class Carrera {
    private ArrayList<Equipo> equipos;
    private int distancia;
    public Carrera(String nombre, int distancia) {
        this.distancia = distancia;
        equipos = new ArrayList<>();
    }
    public void inscribirEquipo(Equipo e) {
        equipos.add(e);
    }
    public void simularCarrera() {
        for (Equipo e : equipos) {
            for (Ciclista c : e.getCiclistas()) {
                switch (c.getNombre()) {
                    case "Ana garcia": c.setTiempo(215); break;
                    case "Juan perez": c.setTiempo(218); break;
                    case "Marta lopez": c.setTiempo(224); break;
                    case "Carlos ruiz": c.setTiempo(228); break;
                    case "Luis soto": c.setTiempo(235); break;
                    case "Pedro diaz": c.setTiempo(242); break;
                }
            }
        }
    }
    public void mostrarClasificacion() {
        System.out.println("clasificacion final ");
        ArrayList<Ciclista> todos = new ArrayList<>();
        for (Equipo e : equipos) {
            todos.addAll(e.getCiclistas());
        }
        Collections.sort(todos, Comparator.comparingInt(Ciclista::getTiempo));
        int pos = 1;
        for (Ciclista c : todos) {
            System.out.println(pos + "°: " + c.getNombre() + " - "
                    + c.getTiempo() + " min ("
                    + c.getEquipo().getNombre() + ")");
            pos++;
        }
        System.out.println("\n--- TIEMPO TOTAL POR EQUIPO ---");
        for (Equipo e : equipos) {
            int total = 0;
            for (Ciclista c : e.getCiclistas()) {
                total += c.getTiempo();
            }
            System.out.println(e.getNombre() + ": " + total + " min");
        }
    }
}