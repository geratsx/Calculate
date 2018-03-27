/**
 * Created by Администратор on 27.03.2018.
 */
/**
 Класс реализует калькулятор
 */

public class Calculate2 {
    /**
     Результат вычисления
     */
    private int result;
    /**
     Суммируем аргументы.
    @param params Аргументы суммирования.
     */
    public void add(int ... params){
        for (Integer param: params) {
            this.result += param;
        }
    }

    /**
     Вычитаем аргументы.
     @param params Аргументы вычитания.
     */
    public void substraction(int ... params){
        for (Integer param: params) {
            this.result -= param;
        }
    }

    /**
     Делим аргументы.
     @param params Аргументы деления.
     */
    public void division(int ... params){
        for (Integer param: params) {
            this.result /= param;
        }
    }

    /**
     Умножаем аргументы.
     @param params Аргументы умножения.
     */
    public void multiply(int ... params){
        for (Integer param: params) {
            this.result *= param;
        }
    }

    /**
     Получить результат.
     @return результат вычисления
     */
    public int getResult(){
        return this.result;
    }

    /**
    Очистить результат вычисления
     */
    public void cleanResult(){
        this.result = 0;
    }
}
