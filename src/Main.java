import java.util.HashMap;
import java.util.Scanner;

public class UnitConverter {
    public static final Map<String, String> MEASUREMENT;
    static {
        MEASUREMENT = new HashMap<String, String>();
        MEASUREMENT.put("temp", "temperature");
        MEASUREMENT.put("len", "length");
        MEASUREMENT.put("m", "mass");
        MEASUREMENT.put("spd", "speed");
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        intro();

        while (flag){
            String answer = " ";

            convertingProcess (input);

            System.out.print("Do you want to choose another type of measurement? Yes(y) or No(n)?");
            answer = input.nextLine();

            while (!answer.toLowerCase().startsWith("n") && !answer.toLowerCase().startsWith("y")){
                System.out.println("Please choose Yes(y) or No(n)!");
                System.out.print("Do you want to choose another type of measurement? Yes(y) or No(n)?");
                answer = input.nextLine();
            }

            if (answer.toLowerCase().startsWith("n")){
                flag = false;
            }
        }
        }
        public static void intro() {
        System.out.println();
        System.out.println("This program converts available units between one another");
        System.out.println("of a given type of measurement. All the measurements and");
        System.out.println("units are displayed in this format: name (user input).");
        System.out.println();
        }
        public static Converter getMeasurementConverter(Scanner input){
        String type = " ";
        ConverterFactory converterFactory = new ConverterFactory();

        System.out.println();
            System.out.println("The types of measurement that can be used are listed below");
            System.out.println("      - Temperature (temp)");
            System.out.println("      - Length (len");
            System.out.println("      - Mass (m)");
            System.out.println("      - Speed  (spd)");
            System.out.println();

            System.out.println("What type of measurement do you want tu use? ");
            type = input.nextLine();
            while (!MEASUREMENT.containsKey(type)){
                System.out.println("Your input was wrong!");
                System.out.print("What type of measurement do you want to use?");
                type = input.nextLine();
            }
            return converterFactory.getConverter(MEASUREMENT.get(type));
        }
        public static void convertingProcess(Scanner input){
        Converter converter = getMeasurementConverter(input);
        boolean temp = true;

        while (temp){
            String reply = " ";

            System.out.println("These are your choices of units:");

            converter.unitsInfo();
            converter.userInput();

            System.out.printf("The value after conversion is %.3f", converter.convert());
            System.out.println();

            System.out.print("Do you want to convert another unit? Yes(y) or No(n)? ");
            reply = input.nextLine();

            while (!reply.toLowerCase().startsWith("n") && !reply.toLowerCase().startsWith("y")){
                System.out.println("Please enter Yes(y) or No(n)!");
                System.out.print("Do you want to convert another unit? Yes (y) or No(n)?");
                reply = input.nextLine();
            }

            if (reply.toLowerCase().startsWith("n")){
                temp = false
            }
        }
        }
    }