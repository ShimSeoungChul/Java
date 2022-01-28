package 옵셔널;

import javax.swing.text.html.Option;
import java.util.Optional;

public class createOptionalObj {
    public static void main(String[] args){
        Optional<String> emptyString = Optional.empty();
        String common = null;
        Optional<String> nullableString = Optional.ofNullable(common);
        common="common";
        Optional<String> commonString = Optional.of(common);
    }
}
