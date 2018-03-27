import java.util.Scanner;

/**
 Created by Администратор on 27.03.2018.
 Класс для запуска калькулятора. Поддерживает ввод пользователя
 */
public class InterractRunner {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try{
            Calculate2 calc = new Calculate2();
            String exit = "no";
            while (!exit.equals("yes")){
                System.out.println("Enter first arg : ");
                String first = reader.next();
                System.out.println("Enter second arg : ");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result : " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit : yes/no ");
                exit = reader.next();
            }
        }finally {
            reader.close();
        }
    }
}