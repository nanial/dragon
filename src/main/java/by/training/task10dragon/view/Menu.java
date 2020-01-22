package by.training.task10dragon.view;

import by.training.task10dragon.controller.Controller;


public class Menu implements View {
    @Override
    public void userService() {

        Controller controller = new Controller();
        System.out.println(controller.executeTask(" CERTAIN"));
        System.out.println();
        System.out.println(controller.executeTask("expensive "));
        System.out.println();
        System.out.println(controller.executeTask("show "));
    }
}
