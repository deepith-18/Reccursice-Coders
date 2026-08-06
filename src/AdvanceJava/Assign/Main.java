package AdvanceJava.Assign;

public class Main {

    public static void main(String[] args) {

        UIFactory factory;

        String os = "Windows";

        if (os.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();

        button.paint();
        checkBox.check();

    }
}
