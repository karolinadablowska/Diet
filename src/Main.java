import java.util.Scanner;

public class Main {

    private static final int STOP_PROGRAM = 0;
    
    public static void main (String [] args) {

            Diet diet = new Diet(7,7);
            Scanner sc = new Scanner(System.in);

            int option;
            do {
                System.out.println("--------------------------------");
                System.out.println("1 - add meal");
                System.out.println("2 - modify meal");
                System.out.println("3 - display meal");
                System.out.println("4 - delete meal");

                System.out.println("5 - add diet");
                System.out.println("6 - display diet for all week");
                System.out.println("7 - show diet for one day");



                option = sc.nextInt();

                switch (option) {
                    case 1:
                        diet.add();
                        break;
                    case 2:
                        diet.modify();
                        break;
                    case 3:
                        diet.displayMeal();
                        break;
                    case 4:
                        diet.delete();
                    case 5:
                        diet.addDiet();
                    case 6:
                        diet.displayDiet();
                    case 7:
                        diet.showDietForOneDay();
                }
            } while(option != STOP_PROGRAM);

    }
}
