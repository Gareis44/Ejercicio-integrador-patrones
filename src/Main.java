import Logica.Autentificador;
import Logica.Posteo;
import Logica.Propiedades;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate Fecha;
        String content;
        int Id_RedSocial;

        Posteo post = new Posteo();
        Autentificador sistema = new Autentificador();
        Propiedades publi = new Propiedades();
        Scanner scanner = new Scanner(System.in);

        while (Autentificador.Permiso != false) {
            Fecha = LocalDate.now();
            System.out.println("Ingrese los siguientes datos para la creacion de la publicacion:");
            System.out.println("Texto:");
            content = scanner.nextLine();
            System.out.println("Red social:");
            System.out.println("Twitter = 1");
            System.out.println("Facebook = 2");
            Id_RedSocial = Integer.parseInt(scanner.nextLine());

            publi.Publicacion(Fecha, content, Id_RedSocial);
            sistema.Autentificar();
        }
        post.postear();
        scanner.close();
    }
}