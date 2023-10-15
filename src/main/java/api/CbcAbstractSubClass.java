package api;

public class CbcAbstractSubClass extends BbcAbstarct{
    public static void main(String[] args) {
        BbcAbstarct obj = new CbcAbstractSubClass();
        obj.run();
        obj.test();
    }

    @Override
    public void test() {
        System.out.println("test");
    }
}
