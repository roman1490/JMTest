import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Что нужно посчитать?");
            String inputString = sc.nextLine().trim();
            String[] input = inputString.split("\\s+");

            String act = input[1];

            //Проверка арифметического знака
            if (isActionCorrect(act)) {
                //Проверка являются ли цифры Римскими
                if (isAllArabianNumbers(input[0], input[2])) {
                    int a = RomanNumbers.romanToArabian(input[0]);
                    int b = RomanNumbers.romanToArabian(input[2]);
                    //проварка диапазона
                    if (isNumbersCorrect(a, b)) {
                        System.out.println(RomanNumbers.arabianToRoman(Calculator.calc(a, b, act)));
                    } else {
                        System.out.println("Недопустимое число. Возможные числа от I до X");
                        break;
                    }

                } else { //для арабских цифр
                    int a, b;

                    try {
                        a = Integer.parseInt(input[0]);
                        b = Integer.parseInt(input[2]);
                    } catch (NumberFormatException e) {
//                        e.printStackTrace();
                        System.out.println("Что-то пошло не так. В следующий раз используй либо римские, либо арабские цифры в диапазоне от 1 до 10." +
                                " Я умею складывать, вычитать, умножать и делить.");
                        break;
                    }

                    if (isNumbersCorrect(a, b)) {
                        System.out.println(Calculator.calc(a, b, act));
                    } else {
                        System.out.println("Недопустимое число. Возможные числа от 1 до 10");
                        break;
                    }
                }
            } else {
                System.out.println("Недопустимый знак действия. Используй + - * /");
                break;
            }
        }
    }

    static boolean isNumbersCorrect(int a, int b) {
        return (a > 0 && a <= 10) && (b > 0 && b <= 10);
    }

    static boolean isActionCorrect(String act) {
        return act.equals("+") || act.equals("-") || act.equals("*") || act.equals("/");
    }

    static boolean isAllArabianNumbers(String str1, String str2) {
        return RomanNumbers.arabianNumbers.contains(str1) && RomanNumbers.arabianNumbers.contains(str2);
    }
}
