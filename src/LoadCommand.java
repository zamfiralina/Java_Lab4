import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class LoadCommand implements Command, Serializable {

    public LoadCommand() {
        try{
            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("catalog.txt"));

            //objIn.readObject();

            System.out.println(objIn);
            objIn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}

