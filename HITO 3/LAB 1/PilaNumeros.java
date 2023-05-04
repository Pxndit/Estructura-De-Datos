package PilasHito3;

public class PilaNumeros {
    private int max;
    private int tope;
    private int[] numeros;

    public PilaNumeros() {
        this.max = 10;
        this.tope=0;
        this.numeros=new int[this.max +1];
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
    public int nroElementos(){
        return this.tope;
    }
    //Adisionar nuevo numero
    public void adicionar(int nuevoNumero){
        if(esLlena()){
            System.out.println("Pila llena; "+ this.tope);
        }
        else{
            tope= tope +1;
            numeros[tope] = nuevoNumero;
        }
    }
    public String eliminar(){
        int itemEliminado=0;

        if (esVacio() == true){
            System.out.println("Pila Vacia: "+ this.tope);
        }
        else{
            itemEliminado = numeros[this.tope];
            tope = tope-1;
        }
        return itemEliminado;
    }
    public void vaciar(PilaNumeros pila){
        while (!pila.esVacio()){
            adicionar(pila.eliminar());
        }
    }
    public void mostrar() {
        int item =0;
        if(esVacio()==true){
            System.out.println("NO HAY ITEMS QUE MOSTRAR: ");
        } else{
          System.out.println("MOSTRANDO PILA DE NUMEROS: ");
          PilaNumeros aux =new PilaNumeros();
          while (esVacio()==false){
              item = eliminar();
              System.out.print(item +", ");
              aux.adicionar(item);
          }
          vaciar(aux);
          System.out.println("");
          System.out.println("TOPE= "+ this.tope);
        }
    }
}
