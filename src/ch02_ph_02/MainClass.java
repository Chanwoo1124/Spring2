package ch02_ph_02;




public class MainClass {
    public static void main(String[] args) {

        MyCalculator calculator = new MyCalculator();
        CalAdd calAdd = new CalAdd();
        CalSub calSub = new CalSub();
        CalMul calMul = new CalMul();
        CalDiv calDiv = new CalDiv();



        calculator.calAdd(10,5,calAdd);
        calculator.calAdd(10,5,calSub);
        calculator.calAdd(10,5,calMul);
        calculator.calAdd(10,5,calDiv);

    }
}
