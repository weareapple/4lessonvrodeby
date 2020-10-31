package com.company;

public class Runner extends Thread {

    private Runner before;
    private Runner after;

    Runner(String name) {
        super(name);
    }

    public void setRunners(Runner before, Runner after) {
        this.after = after;
        this.before = before;

    }

    @Override
    public void run() {
        System.out.printf("%s берет палочку\n", getName());

        if (getName().equals("Runner5")) {
            System.out.printf("%s Бежит к финишу\n", getName());
            System.out.println(getName() + " бежит к " + before.getName());
        } else {
            System.out.println(getName() + " бежит к " + after.getName());
            try {
                after.start();
                after.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (!getName().equals("Runner5")) {
            System.out.println(getName() + " берет палочку ");
            if (!getName().equals("Runner1"))
                System.out.println(getName() + " бежит к " + before.getName());

            else
                System.out.println("забег окончен");

        }
    }
}

