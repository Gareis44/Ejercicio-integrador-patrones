package Logica;
import java.util.Scanner;

public class Autentificador {
    public static boolean Permiso = true;
    public void Autentificar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Añadir otra publicacion? SI o NO");
        String decision = scanner.nextLine();
        if (decision.equalsIgnoreCase("NO")){
            Permiso = false;
            System.out.println("No se ingresaran mas publicaciones");
        }
    }
}