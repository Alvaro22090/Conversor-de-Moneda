import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public InformacionMoneda buscarMoneda(String moneda, String objetivo, double cantidad){
        URI direcion = URI.create("https://v6.exchangerate-api.com/v6/c7d33f2cf49e84eef45727cd/pair/" + moneda + "/"
                + objetivo + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direcion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), InformacionMoneda.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
