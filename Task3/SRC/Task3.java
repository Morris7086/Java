import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {
        String path = null;
        String startDate = null;
        String endDate = null;

        try {
            if (args.length < 1) {
                System.out.printf("Данные не введены");
                return;
            }
            path = args[0]; //"C:/Users/Morris/IdeaProjects/task3/log.log";
            startDate = args[1]; //"2020-01-01T12:00:00";
            endDate = args[2]; //"2020-01-01T13:40:00";
            LogReader logReader = new LogReader(path, startDate, endDate);
            logReader.openAndRead();
        } catch (NumberFormatException e) {
            System.out.println("Проверьте рправильность ввода данных");
            //e.printStackTrace();
        }
    }
}
