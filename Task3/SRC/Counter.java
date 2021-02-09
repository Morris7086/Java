import java.sql.SQLOutput;
import java.util.ArrayList;

public class Counter {

    public static void count (ArrayList<String> list) {
        Report report = new Report();

        for (String string : list) {
            String tmp = string.substring(0, string.indexOf("l"));
            int valume = Integer.parseInt(tmp.substring(tmp.lastIndexOf(" ") + 1));

            if (string.contains("top up")) {
                report.countOfTopUp++;
                if (string.contains("success")) {
                    report.volumeOfTopUpSuccess += valume;
                } else {
                    report.countOfMistakeTopUp++;
                    report.volumeOfTopUpMistake += valume;
                }
            } else {
                report.countOfScoop++;
                if (string.contains("success")) {
                    report.volumeOfScoopSuccess += valume;
                } else {
                    report.countOfMistakeScoop++;
                    report.volumeOfScoopMistake += valume;
                }
            }
        }

        report.print();
    }
}
