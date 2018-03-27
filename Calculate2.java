/**
 * Created by ������������� on 27.03.2018.
 */
/**
 ����� ��������� �����������
 */

public class Calculate2 {
    /**
     ��������� ����������
     */
    private int result;
    /**
     ��������� ���������.
    @param params ��������� ������������.
     */
    public void add(int ... params){
        for (Integer param: params) {
            this.result += param;
        }
    }

    /**
     �������� ���������.
     @param params ��������� ���������.
     */
    public void substraction(int ... params){
        for (Integer param: params) {
            this.result -= param;
        }
    }

    /**
     ����� ���������.
     @param params ��������� �������.
     */
    public void division(int ... params){
        for (Integer param: params) {
            this.result /= param;
        }
    }

    /**
     �������� ���������.
     @param params ��������� ���������.
     */
    public void multiply(int ... params){
        for (Integer param: params) {
            this.result *= param;
        }
    }

    /**
     �������� ���������.
     @return ��������� ����������
     */
    public int getResult(){
        return this.result;
    }

    /**
    �������� ��������� ����������
     */
    public void cleanResult(){
        this.result = 0;
    }
}
