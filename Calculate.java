public class Calculate {

    String arg1 = "";
    String arg2 = "";
    String arg3 = "";

    Long l1;
    Long l2;
    Double d1;
    Double d2;



    public final static String SUM = "sum";
    public final static String MIN = "min";
    public final static String DEL = "del";
    public final static String UMN = "umn";

    public final static String LONG = "long";
    public final static String DOUBLE = "double";


    public Calculate(String arg1, String arg2, String arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public String getArg1() {
        return arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }


    public static Long addition(Long first, Long second) {
        return first + second;
    }

    public static Double addition(Double first, Double second) {
        return first + second;
    }

    public static Long subtraction(Long first, Long second) {
        return first - second;
    }

    public static Double subtraction(Double first, Double second) {
        return first - second;
    }

    public static Long multiplication(Long first, Long second) {
        return first * second;
    }

    public static Double multiplication(Double first, Double second) {
        return first * second;
    }

    public static Long division(Long first, Long second) {
        return first / second;
    }

    public static Double division(Double first, Double second) {
        return first / second;
    }


    public long getResult(String action, long first, long second) {
        long res = 0;
        switch (action) {
            case SUM:
                res = addition(first, second);
                break;
            case MIN:
                res = subtraction(first, second);
                break;
            case DEL:
                res = division(first, second);
                break;
            case UMN:
                res = multiplication(first, second);
                break;
        }
        return res;
    }


    public double getResult(String action, double first, double second) {
        double res = 0;
        switch (action) {
            case SUM:
                res = addition(first, second);
                break;
            case MIN:
                res = subtraction(first, second);
                break;
            case DEL:
                res = division(first, second);
                break;
            case UMN:
                res = multiplication(first, second);
                break;
        }
        return res;
    }


    public String setTypeVariables(String arg) {
        if (arg1.contains(".")) {
                return DOUBLE;
        }
        return LONG;
    }

    public void variableParser(String action, String arg1, String arg2){

        switch (action){
            case DOUBLE:
                d1 = Double.parseDouble(arg1);
                d2 = Double.parseDouble(arg2);
                break;
            case LONG:
                l1 = Long.parseLong(arg1);
                l2 = Long.parseLong(arg2);
                break;
                default:
                    System.out.println("Не верное значение");
        }

    }
    
    public static void main(String arg[]) {
        String arg0 = arg[0];
        String arg1 = arg[1];
        String arg2 = arg[2];

        Calculate calculate = new Calculate(arg0, arg1, arg2);
        calculate.variableParser(calculate.setTypeVariables(arg0), arg0, arg1);

        if (calculate.l1 != null) {
            System.out.println(calculate.getResult(arg2, calculate.l1, calculate.l2));
        } else {
            System.out.println(calculate.getResult(arg2, calculate.d1, calculate.d2));
        }
    }
}