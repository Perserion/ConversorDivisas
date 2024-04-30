package api;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;




public class CurrencyAPI {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/fbb3a28897f594055cfd0423/latest/USD";
    private static final HttpClient httpClient = HttpClient.newBuilder().build();

    public static String getExchangeRates() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(API_URL))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            return response.body();
        } else {
            throw new RuntimeException("Error al obtener la respuesta de la API: " + response.statusCode());
        }
    }
}

