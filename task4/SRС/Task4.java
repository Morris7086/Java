public class task4 {

    public static void main(String[] args) {
        String result;

        if (args[0].equals(args[1]) || args[1].contains("*")) {
            result = "OK";
        } else {
            result = "KO";
        }

        System.out.println(result);
    }
}
