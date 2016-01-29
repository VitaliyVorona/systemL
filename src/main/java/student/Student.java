package student;

import collegePerson.CollegePerson;
import db.DB;

/**
 * Created by Groovy on 24-Jan-16.
 */
public class Student extends CollegePerson{
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public Student(){}

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void addToDb(Student student){
        DB.getInstance().getStudents().put(student.getId(), student);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String surname;

}
