package dev.oscar;
import dev.oscar.Automovil.tipoCom;
import dev.oscar.Automovil.tipoA;
import dev.oscar.Automovil.tipoColor;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Automovil auto1 = new    
        Automovil("Ford",2018,3,tipoCom.Biodiesel,tipoA.Subcompacto,5,6,130,
        tipoColor.Azul,100,false,0);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.
        velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.
        velocidadActual);
        System.out.println("Multa actual = " + auto1.getMulta());
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.
        velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.
        velocidadActual);
        System.out.println("¿Tiene multas? = " + auto1.tieneMultas());
        System.out.println("Valor total de multas = " + auto1.valorTotalMultas());
       
    }
}
