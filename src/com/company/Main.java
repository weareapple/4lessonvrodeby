package com.company;

public class Main {

    public static void main(String[] args) {
        Runner runer1 = new Runner("Runner1");
        Runner runer2 = new Runner("Runner2");
        Runner runer3 = new Runner("Runner3");
        Runner runer4 = new Runner("Runner4");
        Runner runer5 = new Runner("Runner5");

        runer1.setRunners(runer5,runer2);
        runer2.setRunners(runer1,runer3);
        runer3.setRunners(runer2,runer4);
        runer4.setRunners(runer3,runer5);
        runer5.setRunners(runer4,runer1);

        runer1.start();
    }

}
