import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GeniusAPIConfigure {
    private HttpRequest request;
    private  String rapidAPIKey;
    private String createURI;

    private HttpHeaders header;

    public String getRapidAPIKey() {
        return rapidAPIKey;
    }

    public void setRapidAPIKey(String rapidAPIKey) {
        this.rapidAPIKey = rapidAPIKey;
    }

    public HttpResponse<String> getResponse() {
        return response;
    }

    public void setResponse(HttpResponse<String> response) {
        this.response = response;
    }

    private HttpResponse<String> response;
    public GeniusAPIConfigure() throws IOException, InterruptedException {
        rapidAPIKey="fc46e8e060mshb4afaef40775858p12604fjsn24c0e6fb879f";
        request = HttpRequest.newBuilder()
                .uri(URI.create("https://genius-song-lyrics1.p.rapidapi.com/search/multi/?q=solo&per_page=1&page=1"))
                .header("X-RapidAPI-Key", "fc46e8e060mshb4afaef40775858p12604fjsn24c0e6fb879f")
                .header("X-RapidAPI-Host", "genius-song-lyrics1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        createURI= request.uri().getQuery();
        header=request.headers();
        response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }

    public String changeURI(){
        return "balls";
    }

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

    public String getCreateURI() {
        return createURI;
    }

    public void setCreateURI(String createURI) {
        this.createURI = "q=+"+createURI+"&per_page=2&page=1";
        request=HttpRequest.newBuilder()
                .uri(URI.create("https://genius-song-lyrics1.p.rapidapi.com/search/?"+this.createURI))
                .header("X-RapidAPI-Key", rapidAPIKey).header("X-RapidAPI-Host", "genius-song-lyrics1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody()).build();
    }

    public HttpHeaders getHeader() {
        return header;
    }

    public void setHeader(HttpHeaders header) {
        this.header = header;
    }
    public void request() throws IOException, InterruptedException {
        response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        Split updated=new Split(response);
    }
    public HttpResponse<String> makeRequest(String str) throws IOException, InterruptedException {
        str = "q=+"+createURI+"&per_page=1&page=1";
        request = HttpRequest.newBuilder()
                .uri(URI.create("https://genius-song-lyrics1.p.rapidapi.com/search/multi/?q=" + str))
                .header("X-RapidAPI-Key", rapidAPIKey)
                .header("X-RapidAPI-Host", "genius-song-lyrics1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody()).build();
        return response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }
}