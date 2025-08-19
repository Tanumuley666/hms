package optional;

import java.util.Optional;

public class OptionalNullableEx {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optionalStr = Optional.ofNullable(str);
        System.out.println(optionalStr.isPresent());
    }
}
