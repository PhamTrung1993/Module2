package codegym;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            copyFile("file\\trung.txt","file\\family.txt");
    }
    private static void copyFile(String sourcePath,String destPath) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(sourcePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter(destPath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
