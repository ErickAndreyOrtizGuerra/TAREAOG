package tareaprograiipoo;

public class CalculadoraEspecial {
    //Atributos de Clase, pueden ser Publicos, Privados y Protegidos (en herencia)
    public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;

    //Constructor de la clase
    public CalculadoraEspecial(String propietario){
        this.tipoCalculadora="Calculadora Especial";
        this.dimensionPantalla=10;
        this.numeroDeSerie="12345abc";
        this.color="Azul";
        this.nombrePropietario=propietario;
    }

    //Constructor vacio
    public CalculadoraEspecial(){
    }
   
  
    public double seno(double numero) {
        return Math.sin(Math.toRadians(numero));
    }

    public double coseno(double numero) {
        return Math.cos(Math.toRadians(numero));
    }

    public double tangente(double numero) {
        return Math.tan(Math.toRadians(numero));
    }
    
    public double logaritmo(double numero){
        return Math.log10(numero);
    }
    
    public double raizCubica(double numero){
        return Math.cbrt(numero);
    }

   
}