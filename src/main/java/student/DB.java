package student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Groovy on 24-Jan-16.
 */
public class DB {
    public static HashMap<Integer, Student> students;
    private static DB instance = new DB();

    private DB(){}

    public static DB getInstance(){
        return instance;
    }

    public HashMap<Integer, Student> getStudents(){
        return students = new HashMap<Integer, Student>();
    }
}
