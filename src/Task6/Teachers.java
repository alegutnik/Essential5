package Task6;

import java.util.ArrayList;

public class Teachers {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Петров");
        teachers.add("Гала");
        teachers.add("Семенівна");
        teachers.add("Ігор Григорич");

        int bestTeacher = teachers.indexOf("Петров");
        int worstTeacher = teachers.indexOf("Семенівна");

        System.out.println("Індекс найкращого вчителя: " + bestTeacher);
        System.out.println("Індекс найгіршого вчителя: " + worstTeacher);


    }
}
