import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "All OK\n".repeat(2));
        list.stream().filter(x -> x.length() > 1).forEach(System.out::println);
    }
}
