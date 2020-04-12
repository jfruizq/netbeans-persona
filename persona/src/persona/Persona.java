
package persona;
import java.util.Scanner;
public class Persona {  //atributos de la clase persona
    private Scanner teclado;
    private String nombre;
    private int edad;
    
    public Persona() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre=teclado.next();
        System.out.print("Ingrese edad:");
        edad=teclado.nextInt();
    }
    
    public void imprimir() {   //declaro los metodos imprimir y si es mayor de edad
        System.out.println("Nombre:"+nombre);
        System.out.println("Edad:"+edad);
    }
    
    public void esMayorEdad() {  // con el ciclo si le pongo la condicion
        if (edad>=18) {
            System.out.print(nombre+" es mayor de edad.");
        } else {
            System.out.print(nombre+" no es mayor de edad.");
        }
    }
    
    public static void main(String[] ar) { // invoco al constructor
        Persona persona1=new Persona();  // llamo a los otros dos metodos
        persona1.imprimir();
        persona1.esMayorEdad();
    }
}
