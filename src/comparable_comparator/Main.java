package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Kien",30,"HN");
        Student student1=new Student("Hoang",30,"HN");
        Student student2=new Student("Nam",25,"DN");
        Student student3=new Student("Anh",18,"HT");
        Student student4=new Student("Tùnh",24,"GB");

        List<Student> list=new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for (Student st:list) {
            System.out.println(st.toString());
        }
//        System.out.println("****so sánh theo tuổi*****");
        AgeComparator ageComparator=new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("**********so sánh theo tuổi************");
        for (Student st:list) {
            System.out.println(st.toString());
        }
    }
}
