public class Calc {


        private int numA;
        private int numB;

        Calc(int numA,int numB){
            this.numA = numA;
            this.numB = numB;
            if(numA<0 || numB<0){
                throw new IllegalArgumentException();
            }
        }

        public int sum(){
            return this.numA + this.numB;
        }
    }


