import java.math.BigInteger;

public class Task1 {
    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                System.out.println("Ничего невведено");
            } else if (args.length == 1) {
                System.out.println("Неуказана система исчисления");
            } else if (args.length == 2) {
                System.out.println(itoBase(Integer.parseInt(args[0]), args[1]));
            } else if (args.length == 3) {
                System.out.println(itoBase(args[0], args[1], args[2]));
            } else {
                System.out.println("Максимум три параметра");
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректно введено число или система исчисления");
        }
    }

    public static String itoBase(Integer nb, String base) {
        return Integer.toString(nb, base.length());
    }

    public static String itoBase(String nb, String baseSrc, String baseDst) {
        String numberOfbaseSrc = new BigInteger(nb, baseSrc.length()).toString();
        return new BigInteger(numberOfbaseSrc).toString(baseDst.length());
    }
}
