package conversordemonedas.servicios;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import conversordemonedas.modelos.TasaDeCambio;
import conversordemonedas.utilidades.Configuracion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaIntercambioDeMoneda {
    public TasaDeCambio consultaTasa(String base, String target){
        String apiKey = Configuracion.obtener("API_KEY");
        //URL para API
        URI url = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + base + "/" + target);

        try {
            //Crear cliente
            HttpClient cliente = HttpClient.newHttpClient();
            //Crear solicitud
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(url)
                    .GET()
                    .build();
            //Enviar request y guardar respuesta
            HttpResponse<String> response = cliente
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //Parsear JSON
            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            base = jsonObject.get("base_code").getAsString();
            target = jsonObject.get("target_code").getAsString();
            double rate = jsonObject.get("conversion_rate").getAsDouble();

            //Devolver objeto TasaDeCambio
            return new TasaDeCambio(base, target, rate);
        } catch (IOException | InterruptedException e) {
            System.out.println("Ocurrió un error:" + e.getMessage());
            return null;
        } catch (Exception e){
            System.out.println("Ocurrió un error inesperado.");
            return null;
        }
    }
}
