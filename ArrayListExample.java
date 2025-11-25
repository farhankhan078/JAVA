import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Farhan");
        names.add("Aman");
        names.add("Riya");
        names.add("Sana");

        System.out.println("ArrayList Elements:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}