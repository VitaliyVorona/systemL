package db;

import student.Student;
import trainee.Trainee;

import java.util.HashMap;

/**
 * Created by Groovy on 24-Jan-16.
 */
public class DB {
    public static HashMap<Integer, Student> students;
    public static HashMap<Integer, Trainee> trainees;

    private static DB instance = new DB();

    private DB() {
    }

    public static DB getInstance() {
        return instance;
    }

    public HashMap<Integer, Student> getStudents() {
        if (students == null) {
            students = new HashMap<Integer, Student>();
        }
        return students;
    }

    public HashMap<Integer, Trainee> getTrainees() {
        if (trainees == null) {
            trainees = new HashMap<Integer, Trainee>();
        }
        return trainees;
    }
}
