import java.util.Scanner;

/**
 * @author Anton U.
 * Калькулятор + определение самого длинного слова
 */
public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Calc - 1, Array - 2");
        int choise = in.nextInt();
        //Инициализируем сканер
        switch (choise) {
            case 1 :
                boolean cycle;
                //Инициализируем переменную цикла повторений
                do {
                    //Начало цикла калькулятора
                    System.out.println("First Digit");
                    float first = in.nextFloat();
                    //Ввод первого после подсказки
                    System.out.println("Second Digit");
                    float second = in.nextFloat();
                    //Ввод второго после подсказки
                    System.out.println("Operation: + - * /");
                    String oper = in.next();
                    //Ввод действия
                    //in.nextLine() работает некорректно, 10х Stackoverflow
                    if (oper.equals("+")) {
                        float result = first + second;
                        System.out.println("Addition ");
                        System.out.printf("%+.4f", result);
                        //Считаем сумму
                    }
                    if (oper.equals("-")) {
                        float result = first - second;
                        System.out.println("Difference ");
                        System.out.printf("%+.4f", result);
                        //Считаем разность
                    }
                    if (oper.equals("*")) {
                        float result = first * second;
                        System.out.print("Multiplication ");
                        System.out.printf("%+.4f", result);
                        //Считаем умножение
                    }
                    if (oper.equals("/")) {
                        float result = first / second;
                        System.out.print("Division ");
                        System.out.printf("%.4f", result);
                        //Считаем деление
                    }
                    System.out.println();
                    System.out.println("For Continue press y, for Exit any key");
                    String answer = in.next();
                    //Запрос продолжения
                    cycle = (answer.equals("y"));
                } while (cycle);
                System.out.println("Bye!");
                break;
            case 2 :
            //Большее слово в массиве
                System.out.println("How many words?");
                int len = in.nextInt();
                //Запрос длины массива
                String[] words = new String[len];
                for (int i = 0; i<len; i++ ){
                    System.out.println("Type Word "+(i+1));
                    words[i] = in.next();
                    //Заполнение массива
                }
                String maxWord = words [0];
                for (int i = 1; i<len; i++ ){
                    int len1 = maxWord.length();
                    int len2 = words[i].length();
                    //сравнение length напрямую не сработало, или я что-то сделал не так)
                    // добавил буферные переменные
                    if (len1 < len2){
                        maxWord = words[i];
                    //Логика
                    }
                }
                System.out.println("Biggest Word is "+maxWord);
                break;
        }
    }
}
////