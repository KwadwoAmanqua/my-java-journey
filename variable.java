public class variable {
    public static void main(String[] args) {
        // int variable
        int myNum = 20;
        System.out.println(myNum);
        
        //float varaible
        float myFloatNum = 5.098f;
        
        //printing variables and adding values deaclred.
        System.out.println(myFloatNum);
        String firstName = "Kwadwo ";
        String lastName = "Owusu Amanqua";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        //decalring many variables at once and adding their values.
        int x, y, z;
        x = y = z =10;
        System.out.println(x + y + z);

        //variables examples
        //1)student data 
        String studentName = "Kwadwo Owusu Amanqua";
        int studentID = 20978883;
        int studentAge = 20;
        float studentFees = 5092.98f;
        char studentGrade = 65;

        System.out.println("Student name: " + studentName);
        System.out.println("StudentID: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fees owed: " + studentFees);
        System.out.println("Student grade: " + studentGrade);

        //2)area of a rectangle
        int length = 18;
        int width =15;
        int area;

        area = length * width ;

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);

    }
}
