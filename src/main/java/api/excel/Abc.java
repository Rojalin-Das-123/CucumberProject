package api.excel;

import api.Abb;

public class Abc implements Abb {
    public static void main(String[] args) {
        Abb ob =(Abb) new Abc();
        ob.start();
        Abb.run();
        System.out.println(Abb.age);
    }
}
