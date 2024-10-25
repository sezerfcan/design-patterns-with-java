package org.cansezer;


import org.cansezer.gui.factory.Dialog;
import org.cansezer.gui.factory.HtmlDialog;
import org.cansezer.gui.factory.WindowsDialog;
import org.cansezer.logistic.*;

import java.util.Random;

public class Main {

    private static Dialog dialog;
    private static Logistic logistic;

    public static void main(String[] args) {
        logisticApp();
        guiApp();
    }


    private static void logisticApp() {
        configureLogistic();
        runBusinessLogicLogistic();
    }

    private static void runBusinessLogicLogistic() {
        String plan = logistic.planDelivery();
        System.out.println(plan);
    }

    private static void configureLogistic() {
        Random random = new Random();
        if (random.nextBoolean()) {
            logistic = new RoadLogistic();
        } else {
            logistic = new SeaLogistic();
        }
    }


    private static void guiApp() {
        configureGui();
        runBusinessLogicGui();
    }


    private static void configureGui() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }


    private static void runBusinessLogicGui() {
        dialog.renderWindow();
    }

}