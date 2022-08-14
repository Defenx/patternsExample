package org.example.adapter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.example.adapter.bean.User;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Messenger {

    @SneakyThrows
    public void sendRequest() {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();
        List<User> users = objectMapper.readValue(httpResponse.body(), new TypeReference<List<User>>() {
        });

        users.forEach(System.out::println);

    }

}
