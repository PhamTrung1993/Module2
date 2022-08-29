package rawfiles;

import model.Hotel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RAWFiles {
    public void writeToFile(List<?> guestroomsList, String path) throws IOException {
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));

            for (Object guestroom : guestroomsList ) {
                objectOutputStream.writeObject(guestroom);
            }
            objectOutputStream.flush();;
            System.out.println("Save Sucessfull!");
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Error!!");
        } finally {
            objectOutputStream.close();
        }
    }
    public List<Hotel> readFromFile(String path) throws IOException {
        ObjectInputStream objectInputStream = null;
        List<Hotel> guestroomsList= new ArrayList<Hotel>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            guestroomsList = (List<Hotel>) objectInputStream.readObject();

        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Error!!");
        }
        finally {
            objectInputStream.close();
        }
        return guestroomsList;
    }
}
