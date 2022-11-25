public class ExampleNMD extends superExampleNMD {
    @Override
    public void methodOverride() {
        System.out.println("SubClass Nguyen Minh Duc");
    }

    public static void main(String[] args) {
        ExampleNMD ex = new ExampleNMD();
        ex.methodOverride();
    }
}
