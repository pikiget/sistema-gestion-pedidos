public class Cliente {
    private String nombre;
    private String dni;
    private String telefono;

    public Cliente(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public String getTelefono() { return telefono; }

    @Override
    public String toString() {
        return "Cliente[" + nombre + ", DNI: " + dni + ", Tel: " + telefono + "]";
    }
}