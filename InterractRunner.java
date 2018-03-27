import java.util.Scanner;

/**
 * Created by Администратор on 27.03.2018.
 * Класс для запуска калькулятора. Поддерживает ввод пользователя
 */
public class InterractRunner {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String first = "";
        String second = "";
        try {
            Calculate2 calc = new Calculate2();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter name of action(sum, mult, div or sub)");
                String action = reader.next();

                while (!action.equals("sum") || !action.equals("mult") || action.equals("div") || !action.equals("sub")) {
                    System.out.println("Incorrect name of action. \nEnter name of action");

                     action = reader.next();
                }
                System.out.println("Enter first arg : ");
                System.out.println("Do you wan't to use last result for first argument? yes/no");
                String answerFirst = reader.next();
                if (answerFirst.equals("yes")){
                    first = String.valueOf(calc.getResult());
                    calc.cleanResult();
                } else{
                    System.out.println("Enter first arg : ");
                    first = reader.next();
                }

                System.out.println("Enter second arg : ");
                System.out.println("Do you wan't to use last result for second argument? yes/no");
                String answerSecond = reader.next();

                if (answerSecond.equals("yes")){
                    second = String.valueOf(calc.getResult());
                    calc.cleanResult();
                }else{
                    System.out.println("Enter second arg : ");
                    second = reader.next();
                }

                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result : " + calc.getResult());

                System.out.println("Do you wan't to clean last result? yes/no");

                String clean = reader.next();
                if (clean.equals("yes")) {

                    calc.cleanResult();
                }
                System.out.println("Exit : yes/no ");
                exit = reader.next();
            }
        } finally {
            System.out.println("Thank you");
            reader.close();
        }
    }
}
