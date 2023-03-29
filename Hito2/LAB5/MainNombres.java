package Pilas;

public class MainNombres {
    public static void main(String[] args) {
        String[] nombresEDD = new String[5];
        nombresEDD[0] = "Ana";
        nombresEDD[1] = "Juan";
        nombresEDD[2] = "Pepito";
        nombresEDD[3] = "Carla";
        nombresEDD[4] = "Freddy";

        Nombres edd = new Nombres("EDD", nombresEDD);

        //Crear un metodo estatico que determine cuantas personas
        //del paralelo EDD tienen el nombre Pepito
//        int c = cuentaNombres(edd, "Ana");
//        System.out.println("Ana se repite: " + c);
//        agregarNombrePrincipio(edd, "Henry");
//        edd.mostrarNombres();
        agregarNombreFinal(edd,"Henry");
        edd.mostrarNombres();

    }
    public static void agregarNombrePrincipio(Nombres edd, String nombreAgregar){
        String[] nombresOri = edd.getNombres();
        String[] nuevosNombres = new String[nombresOri.length +1];

        nuevosNombres[0] = nombreAgregar;
        for (int i=0; i< nombresOri.length; i++){
            nuevosNombres[i+1] = nombresOri[i];
        }
        edd.setNombres(nuevosNombres);
    }
    public static void agregarNombreFinal(Nombres edd, String nuevoNombre){
        String[] nombresOri = edd.getNombres();
        String[] nuevosNom = new String[nombresOri.length+1];
        for (int i=0; i<nombresOri.length;i++){
            nuevosNom[i] = nombresOri[i];
        }
        nuevosNom[nombresOri.length] = nuevoNombre;
        edd.setNombres(nuevosNom);
    }
    public static int cuentaNombres(Nombres edd, String nombreBuscar)
    {
        String[] nombres = edd.getNombres();
        int i = 0;
        int contador = 0;

        for (i = 0; i < nombres.length; i++) {
            if (nombres[i] == nombreBuscar) {
                contador = contador + 1;
            }
        }

        return contador;
    }
}
