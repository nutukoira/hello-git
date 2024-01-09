import java.util.Scanner;


public class TestProject {
    
    
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String line = myScanner.nextLine(); 
        String[] numbers = line.split(" ");
        
        int length = numbers.length;
        
        double d = 0;
        for (String s : numbers) {
            d += Double.parseDouble(s);
        }
        System.out.println("Mean: " + d/length);
       
    }
}
