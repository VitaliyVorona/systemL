package trainee;

import collegePerson.CollegePerson;
import collegePerson.CollegePersonDao;
import db.DB;
import student.Student;

import java.util.List;
import java.util.Map;

public class TraineeDaoImpl implements CollegePersonDao{
    List<CollegePerson> trainees;

    @Override
    public List<CollegePerson> getAllPersons() {
        for (Map.Entry entry : DB.getInstance().getTrainees().entrySet()){
            trainees.add((CollegePerson)entry.getValue());
        }
        return trainees;
    }

    @Override
    public Trainee getCollegePerson(int rollNo) {
        return DB.getInstance().getTrainees().get(rollNo);
    }

    @Override
    public void updateCollegePerson(CollegePerson collegePerson) {

    }

    @Override
    public void deleteCollegePerson(CollegePerson collegePerson) {

    }
}
