/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclista;

class Velocista extends Ciclista {
    private int velocidadMaxima;
    public Velocista(String n, int num, int v) {
        super(n, num);
        velocidadMaxima = v;
    }
    public double calcularRendimiento() {
        return (velocidadMaxima / 50.0) * 100;
    }
    public void esprintar() {
        System.out.println("Esprintando...");
    }
}