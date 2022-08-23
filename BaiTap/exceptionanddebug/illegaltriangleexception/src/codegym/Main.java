package codegym;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            inputSide();
        }
        catch (TriangleException triangleException) {
            triangleException.printStackTrace();
        }
        catch (IOException element) {
            element.printStackTrace();
        }
    }
    private static void inputSide() throws IOException, TriangleException{
    int aSide;
    int bSide;
    int cSide;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a side");
    aSide = Integer.parseInt(br.readLine());
    System.out.println("Enter b side");
    bSide = Integer.parseInt(br.readLine());
    System.out.println("Enter c side");
    cSide = Integer.parseInt(br.readLine());

    if (aSide <= 0 || bSide <= 0 || cSide <= 0) {
        throw new TriangleException("Side is not valid value");
    }

    if (aSide + bSide <= cSide || bSide + cSide <= aSide || aSide +cSide <= bSide) {
        throw new TriangleException();
    }
    Triangle triangle = new Triangle(aSide,bSide,cSide);
        System.out.println("Triangle is three Edge :");
    System.out.print(triangle.getaSide() + " " + triangle.getbSide() + " " + triangle.getcSide());
    }
}
