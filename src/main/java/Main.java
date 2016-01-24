import student.DB;
import student.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Groovy on 21-Jan-16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        DB db = DB.getInstance();
        HashMap studList = db.getStudents();
        HashMap studList2 = db.getStudents();
        System.out.println(studList);
        System.out.println(studList2);


    }

}
