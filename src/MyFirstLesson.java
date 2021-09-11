import java.util.Arrays;

public class MyFirstLesson {
    public static void main(String[] args) {
        int firstVariable;
        firstVariable = 50;
        System.out.println(firstVariable);
        int secondVariable = 100;
        System.out.println(secondVariable);
        int a = 5;
        a -= 3;
        System.out.println(a);
        int month = 9;
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("It is winter");
                break;
            default:
                System.out.println("It is not winter");
                int week =11;
                switch (week) {
                    case 1:
                        System.out.println("monday");
                        break;
                    case 2:
                        System.out.println("tuesday");
                        break;
                    case 3:
                        System.out.println("wednesday");
                        break;
                    case 4:
                        System.out.println("thursday");
                        break;
                    case 5:
                        System.out.println("friday");
                        break;
                    case 6:
                        System.out.println("saturday");
                        break;
                    case 7:
                        System.out.println("sunday");
                        break;
                    default:
                        System.out.println("It is wrong");
                }
        }

        }

    }