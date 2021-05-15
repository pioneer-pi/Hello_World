package normal_code.P14IOStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Path_ {
    public static void main(String[] args) throws IOException {
        Path BASE_PATH = Path.of("D:/test/a");
        BASE_PATH = BASE_PATH.resolve("b");
        System.out.println(BASE_PATH);
    }
}
