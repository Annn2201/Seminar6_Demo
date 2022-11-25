public class Deprecated {
    static void m() {
        System.out.println("Hi chao cau");
    }

    @java.lang.Deprecated
    static void n() {
        System.out.println("Cai nay cu r");
    }

    public static void main(String[] args) {
        Deprecated a = new Deprecated();
        a.m();
        a.n();
    }
}
