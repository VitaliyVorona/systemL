package student;

import collegePerson.CollegePerson;
import collegePerson.CollegePersonDao;
import db.DB;

import java.util.List;
import java.util.Map;

/**
 * Created by Groovy on 24-Jan-16.
 */
public class StudentDaoImpl implements CollegePersonDao{
    List<CollegePerson> students;

    @Override
    public List<CollegePerson> getAllPersons() {
        for (Map.Entry entry : DB.getInstance().getStudents().entrySet()){
            students.add((CollegePerson)entry.getValue());
        }
        return students;
    }

    @Override
    public Student getCollegePerson(int rollNo) {
        return DB.getInstance().getStudents().get(rollNo);
    }


    @Override
    public void updateCollegePerson(CollegePerson student) {

    }

    @Override
    public void deleteCollegePerson(CollegePerson student) {

    }

}
