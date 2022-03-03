package java2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Assignment10Q6 {

	public static void main(String[] args) {
		String url = "https://httpbin.org/get";
		HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
							  .uri(URI.create(url))
							  .GET()
							  .build();
							  
		HttpClient Client = HttpClient.newBuilder()
							.build();
							
		
		try {
			HttpResponse<String> resp = Client.send(request, BodyHandlers.ofString());
			System.out.println(resp.statusCode());
			System.out.println(resp.body());
			//System.out.println(resp.headers());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}