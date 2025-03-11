public class conditionsexample {
    public static void main(String[] args) {
        //real-life examples
        //open a door with a code
        int doorCode = 1337;
        if(doorCode == 1337){
            System.out.println("Correct code. The door is now open.");
        }else{
            System.out.println("Wrong code. The door remains closed");
        }
        
        //check whether a number is even or odd
        int myNum = 10;
        if(myNum % 2 == 0){
            System.out.println("This number is even.");
        }else{
            System.out.println("This number is odd");
        }

        //check whether a number is positive or negative
        int num = -3;
        if(num > 0){
            System.out.println("This number is positive.");
        }else{
            System.out.println("This number is negative");
        }

        //find out if a person is old enough to vote
        int myAge = 17;
        if(myAge > 18){
            System.out.println("You can vote.");
        }else{
            System.out.println("You are not allowed to vote.");
        }
    }
}
