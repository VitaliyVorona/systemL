package db;


public class CourseCounter {

    private static CourseCounter courseCounter;

    public static int counter = 0;

    private CourseCounter(){}

    public static CourseCounter getInstance(){
        if (courseCounter == null){courseCounter = new CourseCounter();}
        return courseCounter;
    }


    public int setCounter(){
        return counter++;
    }

    public int getCounter(){
        return counter;
    }

}
