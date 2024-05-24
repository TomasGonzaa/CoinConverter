import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {

    public Moneda convertirMoneda(String primerMoneda, String segundaMoneda, double cantidad){
        URI link = URI.create("https://v6.exchangerate-api.com/v6/1bcd9893f398c9a0c57d1915/pair/" + primerMoneda +"/"+ segundaMoneda + "/" + cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();
        try {
            HttpResponse<String> response;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Moneda tazaConversionPar(String primerMoneda, String segundaMoneda){
        URI link = URI.create("https://v6.exchangerate-api.com/v6/1bcd9893f398c9a0c57d1915/pair/" + primerMoneda +"/"+ segundaMoneda + "/");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();
        try {
            HttpResponse<String> response;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Moneda tazaConversionMoneda(String divisa){
        URI link = URI.create("https://open.er-api.com/v6/latest/" + divisa);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();
        try {
            HttpResponse<String> response;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Moneda no encontrada.");
        }
    }


}
