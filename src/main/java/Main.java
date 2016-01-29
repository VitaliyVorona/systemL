import controller.Controller;
import db.CourseCounter;
import db.DB;
import student.Student;

import java.util.HashMap;

/**
 * Created by Groovy on 21-Jan-16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Controller controller = new Controller();
        controller.makeCourse();
        controller.makeCourse();
    }

}
