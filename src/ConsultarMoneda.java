import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Moneda buscarMoneda(String monedaBase, String monedaTarget) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/6087bd2de46f8d881450de2f/pair/"+ monedaBase +"/"+ monedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                        .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e){
            throw new RuntimeException ("No enconntre la moneda");
        }




    }

}
