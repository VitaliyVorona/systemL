package course;


import student.Student;
import trainee.Trainee;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String name;
    private String description;
    public Trainee trainee;
    List<Integer> studentsId;
    List<Integer> traineesId;

    public Course(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) {
        this.description = description;
    }

    public List getStudents() {
        if (null == studentsId) {
            studentsId = new ArrayList<Integer>();
        }
        return studentsId;
    }

    public void addStudents(Student... students) {
        getStudents();
        for (Student s : students) {
            studentsId.add(s.getId());
        }
    }

    public List getTrainees() {
        if (null== traineesId){
            traineesId = new ArrayList<Integer>();
        }
        return traineesId;
    }

    public void addTrainees(Trainee... trainees){
        getTrainees();
        for (Trainee t : trainees){
            traineesId.add(t.getId());
        }
    }


}
