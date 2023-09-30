import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.*;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String API_URL = "https://lichess.org";
        String API_TOKEN = "lip_A5fyeDSv7AVQ3nAWngJr";

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(API_URL))
                    .GET()
                    .build();

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
