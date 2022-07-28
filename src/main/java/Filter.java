import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected final int f;

    public Filter(int f) {
        this.f = f;
    }

    public void filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (int i : source) {
            if (i < this.f) {
                logger.log("Элемент '" + i + "' проходит");
                result.add(i);
            } else logger.log("Элемент '" + i + "' не проходит");
        }
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
    }
}
