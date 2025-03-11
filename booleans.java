public class booleans {
    public static void main(String[] args) {
        
        //boolean values
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        //boolean expression
        int x = 9;
        int y = 10;
        System.out.println(x > y);
        System.out.println(x == y);

        //real life example
        int myAge = 20;
        int votingAge = 18;

        if(myAge >= votingAge){
            System.out.println("Old enough to vote!");
        }else{
            System.out.println("Not old enough to vote.");
        }
        
    }
}
