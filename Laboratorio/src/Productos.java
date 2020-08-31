import java.util.Date;
import java.util.List;

public class Productos {
    int idproducto;
    String nombreProducto;
    List<LoteProducto> loteProductos;
    Date salidaMercado;
    Laboratorio origen;
    Laboratorio destino;

    public Productos(int idproducto, String nombreProducto, List<LoteProducto> loteProductos, Date salidaMercado, Laboratorio origen, Laboratorio destino) {
        this.idproducto = idproducto;
        this.nombreProducto = nombreProducto;
        this.loteProductos = loteProductos;
        this.salidaMercado = salidaMercado;
        this.origen = origen;
        this.destino = destino;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public List<LoteProducto> getLoteProductos() {
        return loteProductos;
    }

    public void setLoteProductos(List<LoteProducto> loteProductos) {
        this.loteProductos = loteProductos;
    }

    public Date getSalidaMercado() {
        return salidaMercado;
    }

    public void setSalidaMercado(Date salidaMercado) {
        this.salidaMercado = salidaMercado;
    }

    public Laboratorio getOrigen() {
        return origen;
    }

    public void setOrigen(Laboratorio origen) {
        this.origen = origen;
    }

    public Laboratorio getDestino() {
        return destino;
    }

    public void setDestino(Laboratorio destino) {
        this.destino = destino;
    }
}