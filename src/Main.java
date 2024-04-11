import Logica.Autentificador;
import Logica.Posteo;
import Logica.Propiedades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Posteo post = new Posteo();

        Autentificador sistema = new Autentificador();
        Propiedades publi = new Propiedades();
        while (Autentificador.Permiso != false){
            publi.Publicacion();
            sistema.Autentificar();
        }


        //post.verlista();
        post.postear();

        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}