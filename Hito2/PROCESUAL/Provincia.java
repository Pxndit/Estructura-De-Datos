package Pais;

public class Provincia {
    private String nombre;
     public Provincia(){
         this.nombre="";
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public void mostrarProvinvia(){
         System.out.println("Mostrar nombre de provincia: ");
         System.out.println("Nombre de provincia: " + getNombre());
     }
}
