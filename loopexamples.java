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

        //for loop:even numbers between 0-10;
        
    }
}
