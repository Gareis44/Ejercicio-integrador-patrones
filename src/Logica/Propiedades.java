package Logica;
import java.time.LocalDate;
import java.util.ArrayList;
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
    public static ArrayList<Object[]> ListadoPublicaciones = new ArrayList<>();

    public void Publicacion(LocalDate Fecha, String content, int Id_RedSocial){
        Object[] ListaPublicacion = new Object[3];
        ListaPublicacion[0] = content;
        ListaPublicacion[1] = Id_RedSocial;
        ListaPublicacion[2] = Fecha;
        ListadoPublicaciones.add(ListaPublicacion);
    }
}