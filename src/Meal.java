public class Meal {

    private static int iterator = 0;
    private int id;

    private String name;
    private String description;


    public Meal(String name, String description) {
        this.id = iterator++;
        this.name = name;
        this.description = description;
    }

    public static int getIterator() {
        return iterator;
    }

    public static void setIterator(int iterator) {
        Meal.iterator = iterator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Meal() {

    }

    @Override
    public String toString() {
        return String.format(name+", "+description);
    }



}
