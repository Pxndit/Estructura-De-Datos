import Ejercicio.Ejercicios;
import Ejercicio.Student;

public class Main {
    public static void main(String[] args) {
//        Math_utils math1 = new Math_utils();
//        math1.printApp();
//        math1.generateNaturaNumers(10);
//        math1.pairNumbers(10);
//        math1.getExtencionFromCI("12345678vb");
        Student st1 = new Student("Pepito", "Pep", 25);
        String nombre = st1.getFullName();
        System.out.println("Nombre: "+st1.getFullName());
        st1.setfullname("Pepito1");
        System.out.println("Nuevo Nombre:"+st1.getFullName());
        System.out.println("Apellido :"+st1.getLastname());
        st1.setLastname("Pep1");
        System.out.println("Nuevo Apellido: "+ st1.getLastname());
        System.out.println("Edad: "+st1.getage());
        st1.setage(30);
        System.out.println("Nueva Edad :" + st1.getage());
        //Ejercicios eje1 = new Ejercicios();
        //eje1.mostrarMensaje();
        //eje1.generarNumerosNaturales();

        // mostrando un mansaje en Java
        //System.out.println("Hola mundo!!!");
        //Generandi los primeros numeros naturales, hasta 10
        //for (int i = 1; i<21 ; i++)
        //{
        //if (i%2==0)
        //        System.out.print(i+",");

        //}
        //int i=1;
        //while (i<=5)
        //{
        //    System.out.print(i+",");
        //    i = i+1;
        //}
    }
}