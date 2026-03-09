package ch02_ph_02;

public class CalAdd implements ICalculator {
    @Override
    public int doOperation(int i, int i1) {
        int i2 = i + i1;
        return i2;
    }
}
