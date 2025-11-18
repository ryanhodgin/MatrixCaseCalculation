public class MatrixCreator {

        public double a;
        public double b;
        public double c;
        public double d;
        public double e = 0;
        public double f;
        public double g;
        public double h;
        public double i;



        public MatrixCreator(double a, double b, double c, double d){

            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public MatrixCreator(double a, double b, double c, double d, double e, double f, double g, double h, double i){
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
        }

        public String toString(){

            if(e == 0) {

                return "[ " + a + " " + b + " ]\n" + "[ " + c + " " + d + " ]";
            }
            else {
                return "[ " + a + " " + b + " " + c + " ]" + "\n" +
                        "[ " + d + " " + e + " " + f + " ]" + "\n" +
                        "[ "  + g + " " + h + " " + i + " ]\n";
            }
        }

        public MatrixCreator multiply(MatrixCreator m2){


            double newA = (a * m2.a) + (b * m2.c);
            double newB = (a * m2.b) + (b * m2.d);
            double newC = (c * m2.a) + (d * m2.c);
            double newD = (c * m2.b) + (d * m2.d);

            MatrixCreator product = new MatrixCreator(newA, newB, newC, newD);

            return product;


        }

        public MatrixCreator getInverse(){

            double divisor = (a * d) - (b * c);
            double invA = 0;
            double invB = 0;
            double invC = 0;
            double invD = 0;

            if( divisor != 0){

                invA = d/divisor;
                invB = -b/divisor;
                invC = -c/divisor;
                invD = a/divisor;

            }

            return new MatrixCreator(invA, invB, invC, invD);
        }

        public boolean isHermitian(){

            if( b == c){
                return true;
            } else {
                return false;
            }

        }
        // Make a^2 + d^2 + g^2 = 1 && b^2 + e^2 + h^2 = 1 && column 3 same

        // ab  + de + gh = 0 && bc + ef + hi = 0 && ac + df + gi = 0


        // a is random
        // d is random between 1 - a^2 and 0
        // g = 1 - a ^ 2 - d ^ 2














}
