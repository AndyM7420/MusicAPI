import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://genius-song-lyrics1.p.rapidapi.com/search/?q=wildest%20dreams&per_page=10&page=1"))
                .header("X-RapidAPI-Key", "fc46e8e060mshb4afaef40775858p12604fjsn24c0e6fb879f")
                .header("X-RapidAPI-Host", "genius-song-lyrics1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(request.uri().getQuery());
         */
        URL s=new URL("https://images.genius.com/d022400aad4680759c278a348d5aaa9b.300x300x1.png");
        GeniusAPIConfigure stupid=new GeniusAPIConfigure();
        BufferedImage c= ImageIO.read(s);
        ImageIcon image=new ImageIcon(c);
        JFrame frame = new JFrame("musicPlayer");
        frame.setContentPane(new testing().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setSize(840, 690);
        frame.setLocationRelativeTo(null);
        System.out.println(":\"");


    }
}