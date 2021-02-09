public class Report {

    int countOfTopUp = 0;
    int countOfMistakeTopUp = 0;
    int volumeOfTopUpSuccess = 0;
    int volumeOfTopUpMistake = 0;

    int countOfScoop = 0;
    int countOfMistakeScoop = 0;
    int volumeOfScoopSuccess = 0;
    int volumeOfScoopMistake = 0;

    public void print () {
        System.out.println("Попыток налить воду - " + countOfTopUp);
        System.out.println("Неудачных попыток налить - " + countOfMistakeTopUp*100/countOfTopUp + "%");
        System.out.println("Количество налитой воды - " + volumeOfTopUpSuccess + "l");
        System.out.println("Количество не налитой воды - " + volumeOfTopUpMistake + "l");
        System.out.println();
        System.out.println("Попыток черпать воду - " + countOfScoop);
        System.out.println("Неудачных попыток черпать - " + countOfMistakeScoop*100/countOfScoop + "%");
        System.out.println("Количество исчерпаной воды - " + volumeOfScoopSuccess + "l");
        System.out.println("Количество не исчерпаной воды - " + volumeOfScoopMistake + "l");
    }

}
