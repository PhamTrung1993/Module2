package storage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RAWFile {
    public void writeToFile(List<?> list,String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(list);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.out.println("Error!!");
        }
    }
    public List readFromFile(String path) {
            List<?> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            list = (List) object;
            fileInputStream.close();
            objectInputStream.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.out.println("Error!!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error!!");
        }
        return list;
    }
}
