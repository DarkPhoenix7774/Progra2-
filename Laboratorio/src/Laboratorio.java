public class Laboratorio {
    String calidadProducto;
    String codigoProducto;
    String nombre;

    public Laboratorio(String calidadProducto, String codigoProducto, String nombre) {
        this.calidadProducto = calidadProducto;
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
    }

    public String getCalidadProducto() {
        return calidadProducto;
    }

    public void setCalidadProducto(String calidadProducto) {
        this.calidadProducto = calidadProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
