package homeWork_3_Exception;

import homeWork_3_Exception.Presenter.Presenter;
import homeWork_3_Exception.View.ConsoleView;
import homeWork_3_Exception.View.View;

public class homeWork_3 {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}
