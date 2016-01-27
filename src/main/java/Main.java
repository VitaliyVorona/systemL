import db.DB;
import student.Student;

import java.util.HashMap;

/**
 * Created by Groovy on 21-Jan-16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        DB db = DB.getInstance();
        HashMap studList = db.getStudents();

        Student eko = new Student(0, "Eko" , "Baza");
        Student beko = new Student(1, "Okko" , "Okko");
        Student veko = new Student(2, "Klo" , "Kloko");

        DB.getInstance().getStudents().put(eko.getId(), eko);
        DB.getInstance().getStudents().put(beko.getId(), beko);
        DB.getInstance().getStudents().put(veko.getId(), veko);

        Student s = (Student)studList.get(0);
        Student b = (Student)studList.get(1);
        Student d = (Student)studList.get(2);
        System.out.println(s.getId() + " " + s.getName() + " " + s.getSurname());
        System.out.println(b.getId() + " " + b.getName() + " " + b.getSurname());
        System.out.println(d.getId() + " " + d.getName() + " " + d.getSurname());
    }

}
