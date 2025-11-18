import java.util.Random;

    public class Main {


        public static void main(String[] args) {

            Random randNum = new Random();

            OrthogonalMatrix ortMatrix = new OrthogonalMatrix();

            double[] values = ortMatrix.getOrthogonalMatrix();

            MatrixCreator matrix = new MatrixCreator(values[0],values[1],values[2],values[3],values[4],
            values[5],values[6],values[7],values[8]);

            System.out.println(matrix);

        }
        public static int[] getRandomNums() {

            Random randNum = new Random();

            int[] ranNums = new int[8];

            for(int i = 0; i < 8; i++){

                int num = randNum.nextInt(3);

                if(num == 0){

                    ranNums[i] = 0;

                }
                else if(num == 1){
                    ranNums[i] = 1;
                }
                else{
                    ranNums[i] = -1;
                }


            }

            return ranNums;


        }



   }
