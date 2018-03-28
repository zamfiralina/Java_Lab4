import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveCommand  implements Command, Serializable {
    public SaveCommand() {
        try{
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("catalog.txt"));

            objOut.writeObject(this);

            objOut.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
