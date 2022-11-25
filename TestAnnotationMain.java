import java.lang.annotation.*;

public class TestAnnotationMain {

    // 1. Koi tao mot chu thich can lap lai
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ReAnno {

        String value();
    };

    // 2. Khoi tao mot chu thich long nhau
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ReAnnos {

        ReAnno[] value();
    }

    // 3. Use repeating annotations
    @ReAnnos({
            @ReAnno("Codelearn"),
            @ReAnno("NMD.SE")})
    public interface ReAnnotation {
    }

    public static void main(String[] args) {
        // 4. Retrieving Annotations via the Filters class
        ReAnnos rep = ReAnnotation.class.getAnnotation(ReAnnos.class);
        for (ReAnno re : rep.value()) {
            System.out.println(re.value());
        }
    }
}
