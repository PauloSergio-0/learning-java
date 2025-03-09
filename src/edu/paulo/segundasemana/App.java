package edu.paulo.segundasemana;

public class App {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        tv.status(true);
        tv.canalTv(0);
        tv.canalTv(21);
        tv.canalTv(-1);
    }
}
