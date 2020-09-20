import java.util.Scanner;

public class Diet implements Actions {

    private Meal[] meals;
    private Week[] weeks;

    public int mealIndex = 0;

    public Diet(int mealSize, int dayOfWeeks) {
        meals = new Meal[mealSize];
        weeks = new Week[dayOfWeeks];

    }

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.next();

        System.out.println("Enter description: ");
        String description = sc.next();

        Meal meal = new Meal(name, description);

        meals[mealIndex++] = meal;
    }


    @Override
    public void modify() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a id: ");
        int id = sc.nextInt();

        Meal meal = findMeal(id);
        if (meals != null) {

            System.out.println("Enter name + (" + meal.getName() + "): ");
            String name = sc.next();
            meal.setName(name);

            System.out.println("Enter a description (" + meal.getDescription() + "): ");
            String description = sc.next();
            meal.setDescription(description);

        } else {
            System.out.println("Meal doesn't exist");
        }
    }

    @Override
    public void delete() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a id: ");
        int id = sc.nextInt();

        if (mealExists(id)) {
            if (id == mealIndex - 1) {
                meals[id] = null;
            } else {
                int i;
                for (i = id; i < meals.length - 1; i++) {
                    meals[i] = meals[i + 1];
                }
                meals[i] = null;
            }
            mealIndex--;
        } else {
            System.out.println("Meal not exists.");
        }
    }


    private Meal findMeal(int id) {
        for (int i = 0; i < weeks.length && meals[i] != null; i++) {
            if (meals[i].getId() == id) {
                return meals[i];
            }
        }
        return null;
    }


    public void displayMeal() {
        for (int i = 0; i < meals.length && meals[i] != null; i++) {
            System.out.println(meals[i]);
        }
    }

    private boolean mealExists(int id) {
        for (int i = 0; i < meals.length && meals[i] != null; i++) {
            if (meals[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void addDiet() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter id of meal: ");
            int id = sc.nextInt();

            Meal meal = findMeal(id);
            System.out.println("Your meal: " + meal.getName());

            if (meals != null) {
                System.out.println("Enter day of diet: ");
                int daysOfWeek = sc.nextInt();

                Diet diet = new Diet (id, daysOfWeek);

            }
        }
    }

    public void displayDiet() {
        for (int i = 0; i<weeks.length; i++) {
            System.out.println("Meal is: " + meals[i] + "," + "for: " + weeks[i]);
        }
    }

    public void showDietForOneDay() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day of diet: ");
        int daysOfWeek = sc.nextInt();

             if (daysOfWeek == 0) {
                System.out.println(meals[0] + ", poniedziałek");
            } else if (daysOfWeek == 1) {
                System.out.println(meals[1] + ", wtorek");
            } else if (daysOfWeek == 2) {
                System.out.println(meals[2] + ", środa");
            } else if (daysOfWeek == 3) {
                System.out.println(meals[3] + ", czwartek");
            } else if (daysOfWeek == 4) {
                System.out.println(meals[4] + ", piątek");
            } else if (daysOfWeek == 5) {
                System.out.println(meals[5] + ", sobota");
            } else if (daysOfWeek == 6) {
                System.out.println(meals[6] + ", niedziela");
            }


        }





        }
















