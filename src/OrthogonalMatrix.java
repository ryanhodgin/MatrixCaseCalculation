import java.util.Random;

public class OrthogonalMatrix {

    Random randNum = new Random();

    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    double g;
    double h;
    double i;

    double B;
    double E;
    double H;


    public OrthogonalMatrix() {
         a = randNum.nextDouble(-1,1);

        double upperBound = Math.sqrt(1 - Math.pow(a,2));

         d = randNum.nextDouble(-1 * upperBound, upperBound);

         g = Math.sqrt(1 - Math.pow(a, 2) - Math.pow(d, 2));

        // ab  + de + gh = 0

         b = randNum.nextDouble(-1,1);

         e = randNum.nextDouble(-1,1);

         h = (-((a * b) + (d * e)))/g;

        double normalizer = Math.sqrt(Math.pow(b,2) + Math.pow(e,2)+ Math.pow(h,2));

         B = b/normalizer;

         E = e/normalizer;

         H = h/normalizer;

         c = ((d * H) - (g * E));

         f = -((a * H) - (B * g));

         i = ((a * E) - (B * d));
    }

    public double[] getOrthogonalMatrix() {

        return new double[]{a,B,c,d,E,f,g,H,i,};
    }



}
