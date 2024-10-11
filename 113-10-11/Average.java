

public class Average {
    public static void main(String[] args) {
        long sum = 0;
        for(var arg : args) {
            sum += Long.parseLong(arg);
        }
        System.out.println("平均：" + (double) sum / args.length);
    }
}
