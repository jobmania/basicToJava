package CH18_Enum.example;

public class App {
    public static void main(String[] args) {
        Fruits fruits = Fruits.APPLE;
        Fruits fruits2 = Fruits.ORANGE;

        System.out.println(fruits);
        System.out.println(fruits2);
        System.out.println(fruits==fruits2);
    }
}
