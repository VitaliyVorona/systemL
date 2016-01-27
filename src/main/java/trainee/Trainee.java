package trainee;

import collegePerson.CollegePerson;
import course.Course;
import db.DB;

import java.util.List;

public class Trainee extends CollegePerson{
    private int id;
    private String name;
    private String surname;
    List<Integer> courseIds;

    public Trainee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void addToDb(Trainee trainee){
        DB.getInstance().getTrainees().put(trainee.getId(), trainee);
    }



    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
