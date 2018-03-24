public class Calculate{

    public static void main(String arg[]){

        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        String action = arg[2];
        int res = 0;
        
            switch (action){
                case "sum":
                    res = first+second;
                    break;
                case "min":
                    res = first-second;
                    break;
                case "del":
                    res = first/second;
                    break;
                case "umn":
                    res = first*second;
                    break;
        }
        System.out.println("result = " + res);
    }
}