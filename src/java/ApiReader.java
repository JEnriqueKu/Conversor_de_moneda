import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.*;

public class ApiReader {

    public Currencies readApi() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(URI.create("https://v6.exchangerate-api.com/v6/d05dc155b5aa6eb77959b065/latest/USD"))
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        Gson gson = new GsonBuilder().create();

        String responseBody = response.body();
        JsonObject jsonObject = gson.fromJson(responseBody,JsonObject.class);


        return gson.fromJson(jsonObject.get("conversion_rates"),Currencies.class);
    }



}
