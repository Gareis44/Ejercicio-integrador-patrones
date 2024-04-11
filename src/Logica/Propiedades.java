package Logica;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Propiedades {

    int Id_num = 0;
    String content;
    int Id_RedSocial;
    LocalDate Fecha;

    public int getId_num() {
        return Id_num;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public int getId_RedSocial() {
        return Id_RedSocial;
    }

    public String getContent() {
        return content;
    }
    static ArrayList<Object[]> ListadoPublicaciones = new ArrayList<>();



    public void Publicacion(){
        Object[] ListaPublicacion = new Object[3];
        Scanner scanner = new Scanner(System.in);
        Id_num++;
        Fecha = LocalDate.now();
        System.out.println("Ingrese los siguientes datos para la creacion de la publicacion:");
        System.out.println("Texto:");
        content = scanner.nextLine();
        System.out.println("Red social:");
        System.out.println("Twitter = 1");
        System.out.println("Facebook = 2");
        Id_RedSocial = Integer.parseInt(scanner.nextLine());
        ListaPublicacion[0] = content;
        ListaPublicacion[1] = Id_RedSocial;
        ListaPublicacion[2] = Fecha;
        ListadoPublicaciones.add(ListaPublicacion);
    }

    /*public ArrayList<Object[]> ObtenerLista(){
        return ListadoPublicaciones;
    }*/
}
