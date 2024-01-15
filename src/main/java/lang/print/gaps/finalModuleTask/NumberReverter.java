package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void revert(int number) {
        int a=number/100;
        int b=(number-a*100)/10;
        int c=(number-(a*100+b*10));
        int result = c*100+b*10+a;
    System.out.println(result);
    }
        public static void main (String[]args){
            int number=123;
            revert (number);
    }
}
