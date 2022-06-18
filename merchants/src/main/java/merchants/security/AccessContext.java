package merchants.security;

/**
 * Use local thread to store a token of each thread.
 */
public class AccessContext {
    private static final ThreadLocal<String> token = new ThreadLocal<String>();

    public static String getToken() {
        return token.get();
    }
    public static void setToken(String tokenValue){
        token.set(tokenValue);
    }
    public static void clear(){
        token.remove();
    }
}
