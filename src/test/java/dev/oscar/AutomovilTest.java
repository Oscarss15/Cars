package dev.oscar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AutomovilTest {
    
     private Automovil automovil;

     @BeforeEach
     public void setUp() {
         automovil = new Automovil(
             "Citroen",
             2020,
             1600,
             Automovil.tipoCom.Gasolina,
             Automovil.tipoA.Ciudad,
             3,
             5,
             120,
             Automovil.tipoColor.Rojo,
             0,
             true,
             0.0
         );
     }
 
     @Test
     public void testAcelerarDentroDelLimite() {
         automovil.acelerar(50);
         assertEquals(50, automovil.getVelocidadActual());
     }
 
     @Test
     public void testAcelerarFueraDelLimite() {
         automovil.acelerar(130);
         assertEquals(0, automovil.getVelocidadActual());
         assertTrue(automovil.tieneMultas());
         assertEquals(100, automovil.valorTotalMultas());
     }
 
     @Test
     public void testDesacelerarDentroDelLimite() {
         automovil.acelerar(50);
         automovil.desacelerar(20);
         assertEquals(30, automovil.getVelocidadActual());
     }
 
     @Test
     public void testDesacelerarFueraDelLimite() {
         automovil.desacelerar(10);
         assertEquals(0, automovil.getVelocidadActual());
     }
 
     @Test
     public void testFrenar() {
         automovil.acelerar(60);
         automovil.frenar();
         assertEquals(0, automovil.getVelocidadActual());
     }
 
     @Test
     public void testCalcularTiempoLlegada() {
         automovil.acelerar(60);
         double tiempo = automovil.calcularTiempoLlegada(120);
         assertEquals(2, tiempo);
     }
 
     @Test
     public void testTieneMultas() {
         automovil.acelerar(130);
         assertTrue(automovil.tieneMultas());
     }
 
     @Test
     public void testValorTotalMultas() {
         automovil.acelerar(130);
         assertEquals(100, automovil.valorTotalMultas());
     }
    
}
