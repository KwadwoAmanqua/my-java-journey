public class foreachloops {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "Ford", "Mazda", "BMW", "Mercedes Benz"};

        for(String i : cars){
            System.out.println(i);
        }

        //frequency sorting array with for each loop
        int[] remarks = {1,2,5,4,3,5,2,1,3,3,1,4,3,2,5,3,4,5,3,1};
        
            int[] frequency = new int[6];
                
                        
            for (int i : remarks) {
                frequency[i]++; 
            }
                
                        
            System.out.println("|Rating |Frequency|");
            for (int i = 1; i <= 5; i++) {
                System.out.println("|   " + i + "   | " + frequency[i] + "       |");
            }
                 
        }
    }

