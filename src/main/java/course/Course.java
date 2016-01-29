package course;


import student.Student;
import trainee.Trainee;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private volatile static int nextId;
    private int id;
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    public Trainee trainee;
    List<Student> studentsList;
    List<Trainee> traineesList;

    public Course( String name, String description, String startDate, String endDate) {
        id = nextId++;
        this.name = name;
        this.description = description;
    }

    public void setId(int id) { this.id = id;}

    public int getId() { return id; }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() { return description; }

    public void setStartDate(String startDate) { this.startDate = startDate; }

    public void setEndDate(String endDate) { this.endDate = endDate; }

    public List getStudents() {
        if (null == studentsList) {
            studentsList = new ArrayList<Student>();
        }
        return studentsList;
    }

    public void addStudents(Student... students) {
        getStudents();
        for (Student s : students) {
            studentsList.add(s);
        }
    }

    public List getTrainees() {
        if (null== traineesList){
            traineesList = new ArrayList<Trainee>();
        }
        return traineesList;
    }

    public void addTrainees(Trainee... trainees){
        getTrainees();
        for (Trainee t : trainees){
            traineesList.add(t);
        }
    }


}
