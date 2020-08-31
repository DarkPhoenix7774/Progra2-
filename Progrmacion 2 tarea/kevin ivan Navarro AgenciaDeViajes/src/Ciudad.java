public class Ciudad {
    private int idciudad;
    private String nombre;

    public Ciudad(int idciudad, String nombre) {
        this.idciudad = idciudad;
        this.nombre = nombre;
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
