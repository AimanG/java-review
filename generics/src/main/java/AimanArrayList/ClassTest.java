package AimanArrayList;

public class ClassTest {
    public static void main(String[] args) {


        ClassA joe = new ClassA("Joe");
        ClassB pat = new ClassB("Pat");
        ClassC beckham = new ClassC("Beckham");

//        Class american = new Class("American");

        Class<ClassA> american = new Class<>("American");
//        Class<String> brokenClass = new Class<>("this won't work");


        american.addStudent(joe);
//        american.addStudent(pat);
//        american.addStudent(beckham);

        System.out.println(american.numClassmates());
    }
}
