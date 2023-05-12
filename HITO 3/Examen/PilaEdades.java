package Edades;

public class PilaEdades {
    private int max;
    private int tope;

    private PilaEdades[] edades;

    public PilaEdades(){
        this.max = 0;
        this.tope = 0;
        this.edades = new PilaEdades[this.max = 1];
    }
    public boolean esVacio(){
        if(this.tope==0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean esLlena(){
        if(this.tope == this.max){
            return true;
        }
        else{
            return false;
        }
    }
//    public PilaEdades nroElementos(){
//        return this.tope;
//    }
    public void adicionar(int nuevaEdad){
        if(esLlena()){
            System.out.println("Pila llena; "+ this.tope);
        }
        else{
            tope= tope +1;
            edades[tope] = nuevaEdad;
        }
    }
    public PilaEdades eliminar(){
        PilaEdades itemEliminado = null;

        if (esVacio() == true){
            System.out.println("Pila Vacia: "+ this.tope);
        }
        else{
            itemEliminado = (edades[this.tope]);
            tope = tope-1;
        }
        return itemEliminado;
    }
    public void vaciar(PilaEdades pila){
        while (!pila.esVacio()){
            adicionar(pila.eliminar());
        }
    }
    public void mostrar() {
        PilaEdades edad = null;
        if (esVacio() == true) {
            System.out.println("NO HAY ITEMS QUE MOSTRAR: ");
        } else {
            System.out.println("MOSTRANDO PILA DE LIBROS: ");
            PilaEdades aux = new PilaEdades();
            while (esVacio() == false) {
                edad = eliminar();
                edad.mostrar();
                aux.adicionar(edad);
            }
            vaciar(aux);
            System.out.println("");
        }
    }
}
