package Logica;

import java.util.ArrayList;
import java.util.List;

public class Posteo {
    Propiedades propiedades = new Propiedades();
    ArrayList<Object[]> ListPublic = propiedades.ListadoPublicaciones;

    /*public void verlista(){
        System.out.println(ListPublic);
    }*/
    public void postear(){

        for (int i = 0; i <= ListPublic.size()-1; i++){
            Object[] Public = ListPublic.get(i);
            if((int) Public[1] == 1 && Public[0].toString().length() <= 280){
                System.out.println("Mensaje \""+ Public[0] + "\" enviado por TWITTER.");
            } else if ((int) Public[1] == 2) {
                System.out.println("Mensaje \""+ Public[0] + "\" enviado por FACEBOOK.");
            }
        }
    }
}
