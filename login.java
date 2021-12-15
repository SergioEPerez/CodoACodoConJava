/**nombre, apellido, edad, hobbie, editor de código preferido, sistema operativo que utiliza**/

package escuela.codoacodoconjava;
import java.util.Scanner;




public class login {
    

    public static void main (String[] args){

        Scanner lectura = new Scanner (System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = lectura.next();

        
        System.out.println("Ingrse su apellido: ");
        String apellido = lectura.next();

        System.out.println("Ingrese su edad: ");
        int edad = lectura.nextInt();
        
        System.out.println("Un Hobbie?: ");
        String hobbie = lectura.next();
        
        System.out.println("Editor de código preferido?: ");
        String editor = lectura.next();
        
        System.out.println("Sistema operativo que usa?: ");
        String sistemaOp = lectura.next();
        
        
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Los datos ingresados son:");
        
     
        

                    System.out.println("Nombre: "+ nombre);
                    System.out.println("Apellido: "+ apellido);
                    System.out.println("Edad: "+ edad);
                    System.out.println("Hobbie: "+ hobbie);
                    System.out.println("Editor de código: "+ editor);
                    System.out.println("Sistema operativo que usa: "+ sistemaOp);



        }//cierra método main

        }//cierra clas
        
