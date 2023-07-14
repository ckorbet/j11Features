package com.cartorgon.j11f;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;

public class HttpClientPoCMain {

  public static void main(final String[] args) throws Exception {
//    HttpClientPoCMain.httpClientSimple();
    HttpClientPoCMain.httpClientAsync();
  }
  
  public static final void httpClientSimple() throws Exception {
    final HttpClient httpClient = HttpClient.newHttpClient();
    
    final HttpRequest request = HttpRequest.newBuilder(URI.create("https://pluralsight.com"))
        .GET()
        .build()
        ;
    
    final HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
    
    System.out.println(response.headers().map());
    System.out.println("Simple HTTP request is done!!");
  }
  
  public static final void httpClientAsync() {
    final HttpClient httpClient = HttpClient.newBuilder()
        .version(Version.HTTP_2)
        .build();
    
    final HttpRequest request = HttpRequest.newBuilder(URI.create("https://google.com"))
        .GET()
        .build();
    
    final CompletableFuture<HttpResponse<String>> response = httpClient.sendAsync(request, BodyHandlers.ofString());
    
    response.thenAccept(System.out::println);
    response.join();
    System.out.println("Async HTTP request is done!!");
  }

}
