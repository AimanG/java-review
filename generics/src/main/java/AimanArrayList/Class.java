package AimanArrayList;
import lombok.Getter;
import java.util.ArrayList;
public class Class<C extends Student>{

    @Getter
    private final String name;
    private final ArrayList<C> classmates = new ArrayList<>();

    public Class(String name) {
        this.name = name;
    }

    public boolean addStudent(C student){
        if (classmates.contains(student)){
            System.out.println(student.getName() + " is already on this class");
            return false;
        }else {
            classmates.add(student);
            System.out.println(student.getName() + " picked for class " + this.name);
            return true;
        }
    }
    public int numClassmates(){
        return this.classmates.size();
    }
}
