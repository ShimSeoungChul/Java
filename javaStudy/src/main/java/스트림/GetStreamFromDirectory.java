package 스트림;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class GetStreamFromDirectory {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/ted.sc/Desktop");
        Stream<Path> stream = Files.list(path);
        stream.forEach(System.out::println);
    }
}
