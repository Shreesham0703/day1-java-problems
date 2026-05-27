import java.sql.SQLOutput;

class java {
    public static void main(String[] args) {
        int day = 6;
        switch (day) {
            case 1:
                System.out.printf("sunday");
                break;
            case 2:
                System.out.printf("Monday");
                break;
            case 3:
                System.out.printf("Ths");
                break;
            case 4:
                System.out.printf("wensday");
                break;
            case 5:
                System.out.printf("thrsday");
                break;
            case 6:
                System.out.printf("Friday");
                break;
            default:
                System.out.printf("not a valid day");
                break;

        }
    }
}