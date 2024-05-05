import java.io.IOException;

public class Program {
    public static void main(String[] args) {


        HashMap<String, String> dogs = new HashMap<>();
        dogs.put("Шарик", "дворняжка");
        dogs.put("Рекс", "немецкая овчарка");
        dogs.put("Бобик", "йоркширский терьер");
        dogs.put("Барбос", "боксер");
        dogs.put("Джек", "джек рассел терьер");


        // печать с помощью toString
        System.out.println(dogs);

        // печать с помощью foreach iterable
        int i = 1;
        for (HashMap<String, String>.Entity element : dogs) {
            System.out.println(i++ + ": " + element.key + ": " + element.value);
        }
    }
}
