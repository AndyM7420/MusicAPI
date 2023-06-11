import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class testing extends JFrame {
    public JPanel panel1;
    private JButton button1;

    public testing() throws IOException, InterruptedException {
        GeniusAPIConfigure news=new GeniusAPIConfigure();
        Split n=new Split(news.getResponse());
        URL s=n.artistPic;
        BufferedImage c= ImageIO.read(s);
        ImageIcon image=new ImageIcon(c);
        button1.setIcon(image);

    }
}
