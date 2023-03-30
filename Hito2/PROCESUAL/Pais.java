package Pais;

public class Pais {
    private String nombre;
    private int nroDeDepartamentos;
    private Departamento[] departamentos1;

    public Pais(){
        this.nombre="";
        this.nroDeDepartamentos=0;
        this.departamentos1 = new Departamento[0];
    }
    public Pais(String nombre, int nroDeDepartamentos, Departamento[] departamentos1){
        this.nombre = nombre;
        this.nroDeDepartamentos = nroDeDepartamentos;
        this.departamentos1 = departamentos1;
    }
    public void agregarNuevoDepartamento(Departamento[] nuevoDepartamentos1){
        this.departamentos1 = nuevoDepartamentos1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroDeDepartamentos() {
        return nroDeDepartamentos;
    }

    public void setNroDeDepartamentos(int nroDeDepartamentos) {
        this.nroDeDepartamentos = nroDeDepartamentos;
    }

    public Departamento[] getDepartamentos1() {
        return departamentos1;
    }

    public void setDepartamentos1(Departamento[] departamentos1) {
        this.departamentos1 = departamentos1;
    }
    public void mostrarPais(){
        System.out.println("---MOSTRAR DATOS DE PAIS---");
        System.out.println("Nombre de departamentos; "+ getNombre());
        System.out.println("Numero de departamentos: "+ getNroDeDepartamentos());

        for (int i =0; i<this.getDepartamentos1().length;i++){
            this.getDepartamentos1()[i].mostrarDepartamento();
        }
    }
}
