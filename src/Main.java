import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Unit: ");
        String unit1 = scan.nextLine();

        System.out.println("Enter amount: ");
        Double unit2 = scan.nextDouble();

        Double newWord = scan.next().DoubleAt(0);

        switch (unit1){
            case 'kg':
                newWord = unit2*1000;
                break;
                switch (unit1){
                    case 't':
                        newWord = unit2/1000;
                        break;

                }

        }
    }
}