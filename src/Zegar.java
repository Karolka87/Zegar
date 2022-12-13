public class Zegar {
    public static void main(String[] args) {

        ZegarTester z = new ZegarTester();

        z.setCzas("1245");
        String dta = z.getCzas();
        System.out.println("Czas: " + dta);
    }
}

    class ZegarTester {
        String czas;

        void setCzas(String c) {
            czas = c;
        }

        String getCzas() {
            return czas;
        }
    }

