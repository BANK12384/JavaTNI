import java.util.Scanner;

public class Ex501
{
    public static boolean is_even(int number){
        return number %2 == 0;
    }

    static String check_type_number(int number) {
        if (number > 0){
            return "Positive Number";
        }
        else if (number < 0){
            return "Negative Number";
        }
        else{
            return "Zero Number";
        }
    }

    static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sacn.nextInt();

        if (number == 0 ){
            System.out.println(number + " is " + check_type_number(number));
        }

        else if (is_even(number) ){
            System.out.println(number + " is Even and "+ check_type_number(number));
        }

        else{
            System.out.println(number+ " is Odd and "+ check_type_number(number));
        }
    }
}
