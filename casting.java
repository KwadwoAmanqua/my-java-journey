public class casting {
    public static void main(String[] args) {
        //casting
        //widening casting
        int myInt = 18;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        //narrowing casting
        double hisDouble = 3.142d;
        int hisInt = (int) hisDouble;

        System.out.println(hisDouble);
        System.out.println(hisInt);

        //real-life example
        int maxScore = 500;
        int userScore = 423;

        float percentage = (float) userScore/maxScore * 100.0f;

        System.out.println("User's percantge is " + percentage);

    }
}
