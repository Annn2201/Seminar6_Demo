import java.lang.annotation.*;

@Retention(value = RetentionPolicy.SOURCE)

@Target({ElementType.METHOD, ElementType.FIELD})

public @interface MyCustomAno {

}
