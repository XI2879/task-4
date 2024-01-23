package Task_4;

import java.util.HashMap;
import java.util.Map;

public class Students {
    public static void main(String[] args) {
        Map<String,Character> map = new HashMap<>();
        addStudent("naga",'c',map);
        addStudent("ram",'a',map);
        addStudent("nag",'b',map);
        System.out.println(map);
        removeStudent("naga",'c',map);
        System.out.println(map);
        displayStudent("nag",map);
    }

    public static void addStudent(String name, char grade,Map<String,Character> map) {

        map.put(name,grade);
    }
    public static void removeStudent(String name, char grade,Map<String,Character> map) {
        map.remove(name,grade);
    }
    public static void displayStudent(String name,Map<String,Character> map) {
        System.out.println(map.get(name));
    }
}
