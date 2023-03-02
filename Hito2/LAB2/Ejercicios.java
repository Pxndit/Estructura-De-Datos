package Ejercicio;

public class Ejercicios {
    private int i;
    private int limite;

    public Ejercicios(){
        this.i = 1;
        this.limite=10;
    }
    public void mostrarMensaje(){
        System.out.println("Hola mundo!!");
    }
    public void generarNumerosNaturales(){
        for (int i = 1; i<10 ; i++)
        {
                System.out.print(i+",");

        }

    }
}
