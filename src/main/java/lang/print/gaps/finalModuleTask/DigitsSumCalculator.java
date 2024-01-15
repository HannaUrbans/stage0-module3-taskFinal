package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {
int a=number/1000;
int b=(number-a*1000)/100;
int c=(number-a*1000-b*100)/10;
int d=number-a*1000-b*100-c*10;
        int result = a+b+c+d;
        System.out.println(result);}
public static void main (String[]args){
      int number=5432;
  calculateSum(number);
    }
}
//ou will be given a four-digit number your task will be to
//find the sum of all digits in the given number.