import com.es2.singleton.Registry;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Registry registry = Registry.getInstance();
        registry.setPath("Hello World!");
        System.out.println(registry.getPath());
    }
}