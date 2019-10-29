public class Test {
    public static void main(String[] args) {
        String a1 = "";
        int a2 = 3;
        Object result = a1 + a2;
        Class typeClass = result.getClass();
        System.out.println(result);
        System.out.println(typeClass.getName());
    }
}