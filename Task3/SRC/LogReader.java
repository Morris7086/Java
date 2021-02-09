import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class LogReader {
    
    private String path;
    private String startDate;
    private String endDate;
    
    public LogReader (String path, String startDate, String endDate) {
        this.path = path;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public void openAndRead() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        ArrayList<String> list = new ArrayList<>();

        Reader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            System.out.println("Файл log не найден");
            e.printStackTrace();
        }
        BufferedReader bReader = new BufferedReader(reader);
        String string;
        try {
            while ((string = bReader.readLine()) != null) {
                if (string.contains("2020")) {
                    String[] str = string.split("\\.");
                    try {
                        Date stDate = format.parse(startDate);
                        Date ndDate = format.parse(endDate);
                        Date curDate = format.parse(str[0]);
                        if (curDate.after(stDate) && curDate.before(ndDate)) {
                            list.add(str[1]);
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }
            bReader.close();
            new Counter().count(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
