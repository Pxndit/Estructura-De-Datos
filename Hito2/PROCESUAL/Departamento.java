package Pais;

public class Departamento {
    private String nombre;
    private Provincia[] nroProvincias;

    public Departamento(){
        this.nombre="";
        this.nroProvincias = new Provincia[0];
    }
    public Departamento(String nombre, Provincia[] nroProvincias){
        this.nombre= nombre;
        this.nroProvincias =nroProvincias;
    }
    // Cree un metodo que inrese provicias
    public void agregarNuebaProvincia(Provincia[] nuevoNroProvincias){
        this.nroProvincias = nuevoNroProvincias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia[] getNroProvincias() {
        return nroProvincias;
    }

    public void setNroProvincias(Provincia[] nroProvincias) {
        this.nroProvincias = nroProvincias;
    }

    //mostrar
    public void mostrarDepartamento(){
        System.out.println("---DATOS DE DEPARTAMENTO---");
        System.out.println("Nombre de departamento: "+ getNombre());

        for (int i =0; i< this.getNroProvincias().length;i++){
            this.getNroProvincias()[i].mostrarProvinvia();
        }
    }
}
