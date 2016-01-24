package student;

import java.util.List;

/**
 * Created by Groovy on 24-Jan-16.
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
