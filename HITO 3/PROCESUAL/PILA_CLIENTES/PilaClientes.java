package PILA_CLIENTES;

public class PilaClientes {
    private int tope;
    private int max;
    private Cliente[] pila1;

    public PilaClientes(int max) {
        this.max = max;
        this.tope = 0;
        this.pila1 = new Cliente[this.max+1];
    }

    public boolean esvacio(){
        if(tope == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean eslleno(){
        if(tope == max){
            return true;
        }else{
            return false;
        }
    }
    public int nroElementos(){return this.tope;}
    public void insertar(Cliente nuevoCliente){
        if(!eslleno()){
            tope++;
            this.pila1[tope] = nuevoCliente;
        }else{
            System.out.println("LA PILA ESTA LLENA");
        }
    }
    public Cliente eliminar() {
        Cliente elementoEliminado = null;
        if (!esvacio()) {
            elementoEliminado = this.pila1[tope];
            tope--;
        } else {
            System.out.println("LA PILA ESTA VACIA");
        }
        return elementoEliminado;
    }
    public void mostrar(){
        Cliente elem=null;
        if(esvacio()){
            System.out.println("NO HAY ESTUDIANTES");
        } else {
            System.out.println("ESTUDIANTES REGISTRADOS");
            PilaClientes aux = new PilaClientes(this.max);
            while(!esvacio()){
                elem = this.eliminar();
                aux.insertar(elem);
                elem.mostrarDatos();
            }
            vaciar(aux);
        }
    }
    public void vaciar(PilaClientes a){
        while (!a.esvacio()) {
            insertar(a.eliminar());
        }
    }
}
