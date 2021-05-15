package experiment.Experiment7;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class Number_two {
    public static void main(String[] args) {
        Bridge bridge = new Bridge();
            for (int i = 0; i < 10; i++) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        bridge.run();
                    }
                }).start();
            }
    }
}