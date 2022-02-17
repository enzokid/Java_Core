public class Operator {

    public static void main(String[] args) {

        int a = 6;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.printf("%s %s \n", "(sum1)=", a+b);
        System.out.printf("%s %s \n", "(sum2)=", c+d);

        int sum1= a+ b;
        int sum2= c+ d;
        boolean result = sum1 > sum2;
        System.out.printf("%s %s \n", "(sum1>sum2)", result);

        sum1 += 1;
        System.out.printf("%s %s \n", "(sum1)++ =", sum1);

        sum2 -= 2;
        System.out.printf("%s %s \n", "(sum2)-2 =", sum2);

        boolean result2 = sum1 > sum2;
        System.out.printf("%s %s \n", "(sum1>sum2)", result);

        int x= sum1%2;
        int x2= sum2%2;

        boolean value= x==0;
        boolean value2= x2==0;

        System.out.printf("%s %s \n", "(compare %2)", value||value2);


    }
}
