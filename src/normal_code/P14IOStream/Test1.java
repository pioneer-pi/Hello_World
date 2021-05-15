package normal_code.P14IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class Test1 {
    public void IO() {
        try (FileInputStream in = new FileInputStream("sad");
             FileOutputStream out = new FileOutputStream("asdasd")) {
            int c;
            in.transferTo(out);
            while ((c = in.read()) != -1) {
                System.out.println(c);
                out.write(c);
            }
            in.close();
            out.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void main(String[] args) {
    }
}
