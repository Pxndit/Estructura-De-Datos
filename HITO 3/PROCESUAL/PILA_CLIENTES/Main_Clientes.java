package PILA_CLIENTES;

public class Main_Clientes {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Henry", "Pilco", 22, "direccion 1", "M");
        Cliente cliente2 = new Cliente("Alan", "Garner", 19, "direccion 2", "F");
        Cliente cliente3 = new Cliente("Jose", "Martines", 15, "direccion 3", "M");
        Cliente cliente4 = new Cliente("Luna", "Rurine", 20, "direccion 4", "F");
        Cliente cliente5 = new Cliente("Roberto", "Carlos", 18, "direccion 5", "M");


        PilaClientes pila = new PilaClientes(5);
        pila.insertar(cliente1);
        pila.insertar(cliente2);
        pila.insertar(cliente3);
        pila.insertar(cliente4);
        pila.insertar(cliente5);

        mayoresCiertaEdad(pila, 10);
    }


    public static void mayoresCiertaEdad(PilaClientes pila, int edadMayor){
        int contador = 0;
        Cliente elem = null;
        if(pila.esvacio()){
            System.out.println("La pila esta vacia");
        } else {
            while(!pila.esvacio()){
                elem = pila.eliminar();
                if(elem.getEdad() > edadMayor){
                    contador++;
                }
            }
        }
        System.out.println("Hay " + contador + " clientes mayores de " + edadMayor + " años");
    }


    public static void moverK_esimo(PilaClientes pila, Cliente k){
        PilaClientes aux = new PilaClientes(10);
        Cliente valorExtraidoPila=null;
        while(!pila.esvacio()){
            valorExtraidoPila = pila.eliminar();
            if(valorExtraidoPila!= k){
                aux.insertar(valorExtraidoPila);
            }
        }
        pila.vaciar(aux);
        pila.insertar(k);
        pila.mostrar();
    }
}
