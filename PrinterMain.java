package cn.ysh;

public class PrinterMain {
    public static void main(String[] args) {
        Printer p1 = new Printer(new A4Paper(),new ColorInk());
        Printer p2 = new Printer(new B5Paper(),new BlackWhiteInk());
        p1.print();
        p2.print();
    }
}
