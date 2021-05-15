package normal_code.Builder_Pattern;

public class HttpClient {
    private String host;
    private String port;

    private boolean mainThread;
    private String cacheDir;
    private Interceptor interceptor;
    private HttpClient(Builder builder){
        this.host = builder.host;
        this.port = builder.port;
        this.mainThread = builder.mainThread;
        this.cacheDir = builder.cacheDir;
        this.interceptor = builder.interceptor;
    }

    public static class Builder {
        //必选项
        private String host;
        private String port;
        //可选项
        private boolean mainThread;
        private String cacheDir;
        private Interceptor interceptor;
        public Builder(String host,String port){
            this.host = host;
            this.port = port;
        }
        public Builder mainThread(boolean mainThread){
            this.mainThread = mainThread;
            return this;
        }
        public Builder cacheDir(String dir){
            this.cacheDir = dir;
            return this;
        }
        public Builder intercepotr(Interceptor interceptor){
            this.interceptor = interceptor;
            return this;
        }
        public HttpClient build(){
            return new HttpClient(this);
        }
    }
}
