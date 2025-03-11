public class loopexamples {
    public static void main(String[] args) {
        //while loop example
        int countdown = 10 ;
        while(countdown > 0){
            System.out.println(countdown);
            countdown--;
        } 
        System.out.println("Happy New Year!!!");

        //while loop example with a game
        int dice = 1;

        while (dice <= 6) {
         if (dice < 6) {
            System.out.println("No Yatzy.");
         } else {
                System.out.println("Yatzy!");
         }
            
        dice = dice + 1;
        }

        //for loop example
        for(int i = 0; i <= 5; i++){
            System.out.println(i);
        }

        //for loop:even numbers between 0-10.(alt 1)
        for(int m = 0; m < 10; m= m + 2){
            System.out.println(m);
        }
        //alt 2.
        for(int n = 0; n < 10; n++){
            if( n % 2 == 0){
                System.out.println(n);
            }else{
                continue;
            }
        }

        //9 times multiplication table
        int number = 9;

        for(int i=0; i<=10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
