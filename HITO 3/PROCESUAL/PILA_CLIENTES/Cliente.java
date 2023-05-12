package PILA_CLIENTES;

public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String genero;
    public Cliente(String nombre, String apellido, int edad, String direccion, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostrarDatos(){
        System.out.println("Datos del cliente");
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("APELLIDO: " + this.apellido);
        System.out.println("EDAD: " + this.edad);
        System.out.println("DIRECCION: " + this.direccion);
        System.out.println("GENERO: " + this.genero);
    }
}
