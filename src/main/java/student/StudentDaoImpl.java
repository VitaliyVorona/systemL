package student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Groovy on 24-Jan-16.
 */
public class StudentDaoImpl implements StudentDao{
    List<Student> students = new ArrayList<Student>();


    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudent(int rollNo) {
        return null;
    }


    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(Student student) {

    }

}
