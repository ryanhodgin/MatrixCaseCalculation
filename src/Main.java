import java.util.Random;

    public class Main {


        public static void main(String args[]) {


            int[] nums = getRandom8();

            for(int i = 0; i < nums.length; i++){
                System.out.println(nums[i]);
            }




            MatrixCreator matrix1 = new MatrixCreator(3,2,4,5);

            MatrixCreator matrixInv = matrix1.getInverse();

            System.out.println(matrixInv);





        }
        public static int[] getRandom8() {

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
