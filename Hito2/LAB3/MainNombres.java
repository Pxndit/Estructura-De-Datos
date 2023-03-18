package Pilas;

public class MainNombres {
    public static void main(String[] args{
        String[] nombresEDD = new String[5];
        nombresEDD[0] = "Ana";
        nombresEDD[1] = "Juan";
        nombresEDD[2] = "Pepito";
        nombresEDD[3] = "Carla";
        nombresEDD[4] = "Sergio";

        Nombres EDD = new Nombres("EDD", nombresEDD);
        personasConMismoNombre(EDD);
        // crear un metodo estatico que determine cuantas personas tienen el nombre Pepito
    }
    public static String personasConMismoNombre(Nombres obj1){
        String[] Nombres = obj1.getNombres();
        String nombreIgu = Nombres[0];
        for ( String i = ""; i == "Pepito";){
            if (Nombres[i] == nombreIgu){
                System.out.println("Nombres igual a Pepito: "+ nombreIgu);
            }
        }
        return nombreIgu;
    }

        }
