public class Test2 {
    public static void main(String[] args) {
        String[] argh = { "x", "y", "z" };
        args = argh;
        for (String s : args) {
            System.err.println(s);
        }
    }
}
