public class nestedloops {
    public static void main(String[] args) {
        //nested for example.
        for(int i = 1; i <= 3; i++){
            System.out.println("Outer:" + i);

            for(int j = 1;j <=3;j++){
                System.out.println("Inner:" + j);

                for(int k = 1;k <= 2;k++){
                    System.out.println("Innermost:" + k);
                }
            }
        }

        //example 2.
        int[] a = {3, 5, 1, 2, 4};
        int i, j, temp;

        for(i = 4; i >= 0; i--){
            for( j = 0; j < 1; j++){
                if(a[j] > a[j + 1])
                {
                    temp = a[j];
                    a[j] =a[ j + 1];
                    System.out.println(a[j+1] = temp);
                }
            }
        }
      }      }   