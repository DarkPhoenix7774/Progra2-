import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args){
         //cliente
        Cliente carlos = new Cliente(  1,"Carlos", "Peres", "Vargas" );

        //ciudad
        Ciudad cochabamba = new Ciudad(1, "Cochabamaba");
        Ciudad santaCruz = new Ciudad( 2, "Santa Cruz");
        Ciudad tarija = new Ciudad(3, "Tarija");

        //categoria
        Categoria turista = new Categoria(1, "Turista");

        //aeropuertos
        Aeropuerto jorgeWilsterman = new Aeropuerto("JW", "Jorge Wilsterman", cochabamba);
        Aeropuerto viruViru = new Aeropuerto("vv", "ViruViru", santaCruz);
        Aeropuerto orieLea = new Aeropuerto("OL", "oriel plaza", tarija);


        //vuelos
        List<Vuelo>vuelos = new ArrayList<>();
        Vuelo cochabambaSantaCruz = new Vuelo("BOA-158", Calendar.getInstance().getTime(), jorgeWilsterman, viruViru);
        vuelos.add(cochabambaSantaCruz);
        Vuelo santaCruzTarija = new Vuelo("BOA-159", Calendar.getInstance().getTime(), viruViru, orieLea);
        vuelos.add(santaCruzTarija);

        //Boletos
        Boleto boleto = new Boleto(1, Calendar.getInstance().getTime(),650.5, carlos, cochabamba, tarija, turista, vuelos);

        System.out.println("Billete");
        System.out.println("========");
        System.out.println("Id:"+ boleto.getIdBillete());
        System.out.println("fecha: " + boleto.getFechaEmesion());
        System.out.println("precio: " + boleto.getPrecioTotal());
        System.out.println("cliente: " + boleto.getCliente().getNombre());
        System.out.println("origen: " + boleto.getOrigen().getNombre());
        System.out.println("Destino: " + boleto.getDestino().getNombre());
        System.out.println("categoria: " + boleto.getCategoria().getNombre());
        System.out.println("vuelos");
        for (Vuelo vuelo: boleto.getVuelos()) {
            System.out.println("Codigo Vuelo" + vuelo.getCodigoVuelo() + "|salida: " + vuelo.getSalida() + "|origen: " + vuelo.getOrigen().getNombre() + "|destino:" + vuelo.getDestino().getNombre());
        }
    }
}
