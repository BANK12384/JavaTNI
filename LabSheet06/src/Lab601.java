import java.util.Scanner;

public class Lab601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String even = "",odd = "";
        int num;
        for (int i = 1 ; i <= 5 ;i++){
            System.out.print("Enter number "+i+": ");
            num  = scanner.nextInt();
            while (num<=0){
                System.out.print("The number must be positive! Enter number again: ");
                num  = scanner.nextInt();
            }
            if(num%2 == 0){
                even += num+" ";
            }
            else {
                odd += num+" ";
            }
        }
        System.out.println("List of even number: "+even);
        System.out.println("List of odd number: "+odd);
    }
}
