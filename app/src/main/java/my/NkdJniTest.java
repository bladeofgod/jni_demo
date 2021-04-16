package my;

public class NkdJniTest {

    static {
        System.loadLibrary("NdkJniTest");
    }

    public native String myTest();

}
