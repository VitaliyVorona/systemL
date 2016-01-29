package controller;


import collegePerson.CollegePerson;
import collegePerson.CollegePersonDao;
import course.Course;
import db.CourseCounter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private List<CollegePersonDao> collegePersonDaoActions = new ArrayList<CollegePersonDao>();
    private List<CollegePerson> collegePersonsActions = new ArrayList<CollegePerson>();

    public void getDaoAction(CollegePersonDao personDao) {
        collegePersonDaoActions.add(personDao);
    }

    public void getPersonAction(CollegePerson collegePerson) {
        collegePersonsActions.add(collegePerson);
    }

    public void runDaoAction(CollegePersonDao personDao) {

    }

    public void makeCourse(){
        int id;
        String name;
        String description;
        String startDate;
        String endDate;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Course name:     ");
        name = scanner.nextLine();
        System.out.print("Course description:     ");
        description = scanner.nextLine();
        System.out.print("Course startDate:     ");
        startDate = scanner.nextLine();
        System.out.print("Course endDate:     ");
        endDate = scanner.nextLine();
        Course course = new Course(name, description, startDate, endDate);
    }
}
