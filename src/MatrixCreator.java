public class MatrixCreator {

        public double a;
        public double b;
        public double c;
        public double d;



        public MatrixCreator(double a, double b, double c, double d){

            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public String toString(){
            return "[ " + a + " " + b + " ]\n" + "[ " + c + " " + d + " ]";

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












}
