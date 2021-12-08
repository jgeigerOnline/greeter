package org.example;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.logging.Logger;

public class Application {

  private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

  public static void main(final String[] args)
      throws URISyntaxException {
    final var httpRequest = HttpRequest.newBuilder()
        .uri(new URI("http://greeter"))
        .POST(BodyPublishers.ofString("Hello from Java!"))
        .build();
    HttpClient.newHttpClient()
        .sendAsync(httpRequest, BodyHandlers.ofString())
        .thenApply(HttpResponse::body)
        .thenAccept(LOGGER::info)
        .join();
  }
}

