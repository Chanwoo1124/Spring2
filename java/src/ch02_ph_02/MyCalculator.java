package ch02_ph_02;

public class MyCalculator {
    public void calAdd(int i, int i1, ICalculator iCalculator) {
         int value = iCalculator.doOperation(i,i1);
        System.out.println(value);
    }
}
