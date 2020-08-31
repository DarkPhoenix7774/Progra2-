import java.util.Date;
import java.util.List;

public class Boleto {
   private int idBoleto;
    private Date fechaEmesion;
    private double precioTotal;
    private Cliente cliente;
    private Ciudad origen;
    private Ciudad destino;
    private Categoria categoria;
    private List<Vuelo> vuelos;

    public Boleto(int idBillete, Date fechaEmesion, double precioTotal, Cliente cliente, Ciudad origen, Ciudad destino, Categoria categoria, List<Vuelo> vuelos) {
        this.idBoleto = idBillete;
        this.fechaEmesion = fechaEmesion;
        this.precioTotal = precioTotal;
        this.cliente = cliente;
        this.origen = origen;
        this.destino = destino;
        this.categoria = categoria;
        this.vuelos = vuelos;
    }

    public int getIdBillete() {
        return idBoleto;
    }

    public void setIdBillete(int idBillete) {
        this.idBoleto = idBoleto;
    }

    public Date getFechaEmesion() {
        return fechaEmesion;
    }

    public void setFechaEmesion(Date fechaEmesion) {
        this.fechaEmesion = fechaEmesion;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}
