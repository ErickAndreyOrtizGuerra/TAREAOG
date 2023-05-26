package tareaprograiipoo;

import java.util.Scanner;

public class TareaPrograIIPOO {
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Calculadora calculadora = new Calculadora("Erick Andrey Ortiz Guerra");
        CalculadoraEspecial calculadoraEsp = new CalculadoraEspecial("OG");
        boolean salir = false;
        int opcion; 
        
        do {
            System.out.println("=======================");
            System.out.println(" MENU DE LA CALCULADORA");
            System.out.println("=======================");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Raiz Cuadrada");
            System.out.println("6. Verificar numero Primo");
            System.out.println("7. Seno");
            System.out.println("8. Coseno");
            System.out.println("9. Tangente");
            System.out.println("10. Logaritmo");
            System.out.println("11. Raiz Cubica");
            System.out.println("12. Salir");
            System.out.println("=======================");
            System.out.print("Selecciona una opcion con el numero por favor: ");
            
            opcion = sn.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + calculadora.sumar(597, 57));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + calculadora.restar(110, 57));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es: " + calculadora.multiplicar(189, 53));
                    break;
                case 4:
                    System.out.println("El resultado de la division es: " + calculadora.dividir(16, 64));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es: " + calculadora.raizCuadrada(159));
                    break;
                case 6:
                    System.out.println("¿Es primo? " + calculadora.esPrimo(11));
                    break;
                case 7:
                    System.out.println("El resultado del calculo del seno es: " + calculadoraEsp.seno(55));
                    break;
                case 8:
                    System.out.println("El resultado del calculo del coseno es: " + calculadoraEsp.coseno(615));
                    break;
                case 9:
                    System.out.println("El resultado del calculo de la tangente es: " + calculadoraEsp.tangente(930));
                    break;
                case 10:
                    System.out.println("El resultado del logaritmo en base 10 es: " + calculadoraEsp.logaritmo(78));
                    break;
                case 11:
                    System.out.println("La raiz cubica del numero es: " + calculadoraEsp.raizCubica(18));
                    break;
                case 12:
                    salir = true;
                    break;
                default:
                    System.out.println("Por favor, selecciona una opcion valida.");
            }
            
            System.out.println();
        } while (!salir);
        
        System.out.println("¡Gracias por utilizar la calculadora!");
    }
}
