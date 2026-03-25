/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclista;

public class Main {
    public static void main(String[] args) {
        Ciclista c1 = new Ciclista("Ana García") {};
        Ciclista c2 = new Ciclista("Juan Pérez") {};
        Ciclista c3 = new Ciclista("Marta López");
        Ciclista c4 = new Ciclista("Carlos Ruiz");
        Ciclista c5 = new Ciclista("Luis Soto");
        Ciclista c6 = new Ciclista("Pedro Díaz");
        Equipo equipo1 = new Equipo("estrellita");
        Equipo equipo2 = new Equipo("pulgarcito");
        equipo1.agregarCiclista(c1);
        equipo1.agregarCiclista(c2);
        equipo1.agregarCiclista(c3);
        equipo2.agregarCiclista(c4);
        equipo2.agregarCiclista(c5);
        equipo2.agregarCiclista(c6);
        c1.setEquipo(equipo1);
        c2.setEquipo(equipo1);
        c3.setEquipo(equipo1);
        c4.setEquipo(equipo2);
        c5.setEquipo(equipo2);
        c6.setEquipo(equipo2);
        Carrera carrera = new Carrera("gano el premio", 50);
        carrera.inscribirEquipo(equipo1);
        carrera.inscribirEquipo(equipo2);
        carrera.simularCarrera();
        carrera.mostrarClasificacion();
    }
}