import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    public Moneda conversorMoneda(String monedaBase, String monedaDestino, double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/3793693c8185d9f28e024d18/pair/" +
                monedaBase + "/" + monedaDestino + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient(); //cliente de cliente - servidor
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("No se pudo realizar la conversión de moneda: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Error inesperado : " + e.getMessage());
        }




    }
}
