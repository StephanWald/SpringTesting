package org.example;

import org.dwcj.App;
import org.dwcj.controls.label.Label;
import org.dwcj.controls.panels.AppPanel;
import org.dwcj.exceptions.DwcException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application extends App {

    public static void main(String[] args) {
    }

    @Override
    public void run() throws DwcException {

        AppPanel panel = new AppPanel();
        Label label = new Label("locating service...");
        panel.add(label);

        MyClient client = new MyClient();
        String myServiceOutput = client.getGreeting();
        Label label2 = new Label(myServiceOutput);
        panel.add(label2);


    }
}
