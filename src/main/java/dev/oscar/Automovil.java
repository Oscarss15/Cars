package dev.oscar;

public class Automovil {

    
    String marca;
    int modelo;
    int motor;
    enum tipoCom{Gasolina, Bioetanol, Diesel, Biodiesel, Gasnatural};
    tipoCom tipoCombustible;
    enum tipoA {Ciudad, Subcompacto, Compacto, Familiar, ejecutivo, suv};
    tipoA tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    enum tipoColor {Blanco, Negro, Rojo, Naranja, Amarillo, Verde, Azul, Violeta};
    tipoColor color;
    int velocidadActual = 0 ;
    boolean esAutomatico; 
    double multa = 0.0;   

    

    public Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil,
            int numeroPuertas, int cantidadAsientos, int velocidadMaxima, tipoColor color, int velocidadActual,
            boolean esAutomatico, double multa) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
        this.esAutomatico = esAutomatico;
        this.multa = multa;
    }

  
    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public int getModelo() {
        return modelo;
    }


    public void setModelo(int modelo) {
        this.modelo = modelo;
    }


    public int getMotor() {
        return motor;
    }


    public void setMotor(int motor) {
        this.motor = motor;
    }


    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }


    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    public tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }


    public void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }


    public int getNumeroPuertas() {
        return numeroPuertas;
    }


    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }


    public int getCantidadAsientos() {
        return cantidadAsientos;
    }


    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }


    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }


    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    public tipoColor getColor() {
        return color;
    }


    public void setColor(tipoColor color) {
        this.color = color;
    }


    public int getVelocidadActual() {
        return velocidadActual;
    }


    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }


    public boolean isEsAutomatico() {
        return esAutomatico;
    }


    public void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }


    public double getMulta() {
        return multa;
    }


    public void setMulta(double multa) {
        this.multa = multa;
    }


    public void acelerar(int incrementoVelocidad){
        if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
           
            velocidadActual = velocidadActual + incrementoVelocidad;
            } else { 
            multa+=100;
            System.out.println("No se puede incrementar a una velocidad  superior a la máxima del automóvil.  Multa actual: " + multa);

            }
    }

    public void desacelerar(int decrementoVelocidad){
        if (velocidadActual - decrementoVelocidad > 0) {
           
            velocidadActual = velocidadActual - decrementoVelocidad;
            } else { 
            System.out.println("No se puede decrementar a una velocidad  inferior a 0");
            }
    }

    public void frenar(){
        velocidadActual=0;
    }
    public double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
        }

        public boolean tieneMultas() {
            return multa > 0;
        }
    
        public double valorTotalMultas() {
            return multa;
        }
      
   public void imprimir(){

    System.out.println("Marca = " + marca);
    System.out.println("Modelo = " + modelo);
    System.out.println("Motor = " + motor);
    System.out.println("Tipo de combustible = " + tipoCombustible);
    System.out.println("Tipo de automóvil = " + tipoAutomovil);
    System.out.println("Número de puertas = " + numeroPuertas);
    System.out.println("Cantidad de asientos = " +
    cantidadAsientos);
    System.out.println("Velocida máxima = " + velocidadMaxima);
    System.out.println("Color = " + color);
    System.out.println("Es automático = " + (esAutomatico ? "Sí" : "No"));
    System.out.println("Multa actual = " + multa);
    
   }
   
    
}
