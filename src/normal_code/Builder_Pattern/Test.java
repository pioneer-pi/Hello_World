package normal_code.Builder_Pattern;

public class Test {
    HttpClient client = new HttpClient.Builder("www.whyman.site","8089")
            .mainThread(true)
            .cacheDir("d:/")
            .build();
}
