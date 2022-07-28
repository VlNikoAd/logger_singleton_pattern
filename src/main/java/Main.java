import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    protected static String[] listData = {"Введите размер списка: ",
            "Введите верхнюю границу для значений:",
            "Введите порог для фильтра:"};
    protected static Scanner scanner = new Scanner(System.in);
    protected static Logger logger = Logger.getInstance();

    public static void main(String[] args) throws IOException {

        logger.log("Запускаем программу...");
        logger.log("Просим пользователя ввести входные данные для списка");
        int[] values = getValues(listData);

        logger.log("Создаем и наполняем список");
        List<Integer> randomArray = getRandomArray(values[0], values[1]);
        System.out.println("Вот случайный список: " + randomArray);

        logger.log("Запускаем фильтрацию списка");
        Filter filter = new Filter(values[2]);
        filter.filterOut(randomArray);

        logger.log("Завершаем программу");
    }

    private static int[] getValues(String[] listData) {
        int[] values = new int[3];

        for (int i = 0; i < listData.length; i++) {
            logger.log(listData[i]);
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static List<Integer> getRandomArray(int sizeArray, int topValue) {
        Random random = new Random();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < sizeArray; i++) {
            arr.add(random.nextInt(topValue));
        }
        return arr;
    }
}
