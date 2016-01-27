package collegePerson;

import student.Student;

import java.util.List;

public interface CollegePersonDao {
    public List<CollegePerson> getAllPersons();
    public CollegePerson getCollegePerson(int rollNo);
    public void updateCollegePerson(CollegePerson collegePerson);
    public void deleteCollegePerson(CollegePerson collegePerson);
}
