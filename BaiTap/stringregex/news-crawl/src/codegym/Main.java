package codegym;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {

            URL url = new URL("https://www.dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");

            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n+","");

            Pattern pattern = Pattern.compile("(<item><title>)([^<]+)");
            Matcher m = pattern.matcher(content);

            while (m.find()) {
                System.out.println("New is: " + m.group(2));

            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
