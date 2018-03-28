import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PlayCommand implements Command{

    public PlayCommand(String path) {
        File file = new File(path);
        try {
            Desktop desktop = null;
            if (Desktop.isDesktopSupported()) {
                desktop = Desktop.getDesktop();
            }

            desktop.open(file);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
