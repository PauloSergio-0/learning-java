package edu.paulo.segundasemana;

public class App {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        tv.status(true);
        tv.canalTv(0);
        tv.canalTv(21);
        tv.canalTv(-1);

        tv.status(true);
        tv.volumeTv(21);
        tv.volumeTv(0);
        tv.volumeTv(-1);
    }
}
