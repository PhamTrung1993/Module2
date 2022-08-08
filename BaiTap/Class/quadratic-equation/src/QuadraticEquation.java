public class QuadraticEquation {
    double a,b,c;

    public void solve()
    {
        double delta, n1, n2;
        delta = b*b - 4*a*c;
        if(delta<0){
            System.out.println("The equation has no roots");
        }
        else if(delta==0){
            n1 = n2 = -b/(2*a);
            System.out.println("Equation with double solution "
                    + "\nx1 = x2 =" + n1);
        }
        else{
            n1 = (-b + Math.sqrt(delta))/(2*a);
            n2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("The equation has two distinct solutions: "
                    + "\nX1 = " + n1 + "\nX2 = " + n2);
        }
    }

}
