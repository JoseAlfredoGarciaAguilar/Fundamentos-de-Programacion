
package weaserpiente;

import java.util.Random;

public class Jugador {
    public String Nombre;
    public int Posicion;

    public Jugador(String Nombre, int Posicion) {
        this.Nombre = Nombre;
        this.Posicion = 1;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPosicion() {
        return Posicion;
    }

    public void setPosicion(int Posicion) {
        this.Posicion = Posicion;
    }
    
    public int Dado()
    {
        Random Azar = new Random();
        int dados = Azar.nextInt(10) + 2;
        return dados;
    }
    
}
