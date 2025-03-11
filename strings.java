public class strings {
    public static void main(String[] args) {
        String greeting = "Hello";

        //string length
        String txt = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
        System.out.println("The length of this string is: " + txt.length());
        
        //string methods
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());

        //finding a character in a string
        String wrds = "Please locate where 'locate' occurs!!";
        System.out.println(wrds.indexOf("locate"));

        //concatenation
        //string with words
        String firstName = "Kwadwo ";
        String lastName = "Owusu Amanqua";
        System.out.println(firstName +" "+ lastName);

        System.out.println(firstName.concat(lastName));

        //strings wtih numbers
        int x = 10;
        String y = "20";
        String z = x + y;
        System.out.println(z);

        //special characters
        //backslash escape character
        String min = "We ae the \\so\\ called \"Vikings\" from \'the\' north.";
        System.out.println(min);

        //escape sequence new line
        String java ="My name is \nJARVIS";
        System.out.println(java);

    }
}
