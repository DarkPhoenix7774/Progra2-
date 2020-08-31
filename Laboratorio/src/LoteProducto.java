import java.util.Date;
import java.util.List;

public class LoteProducto {
    Date fechaElaboracion;
    int idmedidas;
    List<Productos> productos;

    public LoteProducto(Date fechaElaboracion, int idmedidas, List<Productos> productos) {
        this.fechaElaboracion = fechaElaboracion;
        this.idmedidas = idmedidas;
        this.productos = productos;
    }

    public Date getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(Date fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public int getIdmedidas() {
        return idmedidas;
    }

    public void setIdmedidas(int idmedidas) {
        this.idmedidas = idmedidas;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }
}
