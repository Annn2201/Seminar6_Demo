public class UsingAnno {
    @MyCustomAno
    private int AGE = 20;

    @MyCustomAno
    public int getAGE () {
        return AGE;
    }

    public static void main(String[] args) {
        UsingAnno use = new UsingAnno();
        System.out.println(use.getAGE());
    }
}
