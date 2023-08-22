package facebook;

import java.util.Scanner;

public class Facebook {
    // Se solicita que el usuario ingrese los datos para el inicio de sesion
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Sistema sis= new Sistema();
        
        System.out.println("Facebook");
        System.out.print("Ingresar usuario: ");
        sis.usuario= sc.next();
        System.out.print("Ingresar contraseña: ");
        sis.contraseña= sc.next();
        
        if (sis.validar_ingreso()){
            System.out.println("Felicidades "+ sis.usuario+" has ingresado al programa correctamente!");
        }
        else{
            System.out.println("Lo sentimos, pero el usuario "+ sis.usuario +" no se encuentra en el sistema");
        }
        
    }
    
}
