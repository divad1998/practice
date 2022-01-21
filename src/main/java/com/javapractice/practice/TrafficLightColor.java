package com.javapractice.practice;

public enum TrafficLightColor {
    RED(12000), YELLOW(2000), GREEN(10000);

    private long delay;

    TrafficLightColor(long delayHolder) {
        delay = delayHolder;
    }

    public long getDelay() {
        return delay;
    }
}

class TrafficLightSimulator implements Runnable {

    private TrafficLightColor tlc;
    private boolean stop = false;
    private boolean changed = false;

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
    }

    //isn't called
//    TrafficLightSimulator() {
//        tlc = TrafficLightColor.RED;
//    }

    //start up light
    @Override
    public void run() {
        while(!stop) {
            try {
                if (tlc.ordinal() == 1) {
                    Thread.sleep(tlc.getDelay()); //warning that thread might be sleeping continuously as it is in a loop
                }
                else if (tlc.ordinal() == 2) {
                    Thread.sleep(tlc.getDelay());
                }
                else {
                    Thread.sleep(tlc.getDelay());
                }
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            changeColor();
        }
    }

    //change color
    synchronized void changeColor() {
        if (tlc.ordinal() == 0) {
            tlc = TrafficLightColor.YELLOW;
        }
        else if (tlc.ordinal() == 1) {
            tlc = TrafficLightColor.GREEN;
        }
        else {
            tlc = TrafficLightColor.RED;
        }
        changed = true;
        notify(); // signal that light has changed
    }

    synchronized void waitForChange() {
        try {
            while(!changed)
                wait();
            changed = false;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    synchronized void cancel() {
        stop = true;
    }
}

class TrafficLightDemo {

    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.RED);
        Thread thread = new Thread(t1);
        thread.start();

        for (int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }

        t1.cancel();
    }
}
