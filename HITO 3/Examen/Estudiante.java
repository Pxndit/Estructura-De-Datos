package Edades;

public class Estudiante {
    private int[] edades;

    public Estudiante(int[] edades) {
        this.edades = edades;
    }
    public int[] getEdades() {
        return edades;
    }
    public void setEdades(int[] edades) {
        this.edades = edades;
    }

    public void mostrar() {
        System.out.println("Mostrando Clase EDADES");
        for (int i=0; i < this.getEdades().length; i++) {
            System.out.print(this.edades[i] + ", ");
        }
        System.out.println();
    }
    public void mostrare(){
        for (int i=0; i < this.getEdades().length; i++) {
            System.out.print("Edad: ");
            System.out.println(this.edades[i]);
        }
        System.out.println();
    }
}
