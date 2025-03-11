public class conditions {
    public static void main(String[] args) {
        //if statments.
        //examples involving if statements.
        if(20 > 18){
            System.out.println("20 is greater than 18.");
        }


        int x = 30;
        int y = 21;
        if(x > y){
            System.out.println("x is greaater than y");
        }

        //else statements.
        //examples involving else statements.
        int hours = 20;
        if (hours < 18){
            System.out.println("Good day.");
        }else{
            System.out.println("Good evening.");
        }

        //else if statements.
        //examples involving else if statement.
        int time = 24;
        if (time < 12){
            System.out.println("Good morning.");
        }else if(time < 16){
            System.out.println("Good day.");
        }else{
            System.out.println("Good evening.");
        }

        //short hand if else(ternary operator)
        int duration = 20;
        String result = (duration < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
