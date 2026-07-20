import java.util.*;
public class Roots_of_Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double determinant = (b*b)-(4*a*c);
        double root1, root2;

        if(determinant > 0){
            root1 = (-b + Math.sqrt(determinant))/(2*a);
            root2 = (-b - Math.sqrt(determinant))/(2*a);

            System.out.format("Roots are real and distinct\n");
            System.out.format("Root1 =%2f\n",root1);
            System.out.format("Root2 =%2f\n",root2);
        }
        else if(determinant == 0){
            root1 = root2 = -b/(2*a);
            System.out.println("Roots are equal and real\n");
            System.out.format("Root1 =Root2=%2f\n",root1);
        }
        else{
            double realPart = -b/(2*a);
            double imaginaryPart = Math.sqrt(-determinant)/(2*a);
            System.out.format("Roots are complex and distinct \n");
            System.out.format("Root1=%2f+%2fi\n",realPart,imaginaryPart);
            System.out.format("Root2=%2f-%2fi\n",realPart,imaginaryPart);
        }

    }
}
