package nov23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class Student implements Comparable<Student> {

public class Student {

    private int stuId;
    private String stuName;
    private int stuMarks;

//    @Override
//    public int compareTo(Student s) {
//      //  return this.getStuName() - s.getStuName();
//        return this.getStuName().compareTo(s.getStuName());
//    }

    public Student(int stuId, String stuName, int stuMarks) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuMarks = stuMarks;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuMarks() {
        return stuMarks;
    }

    public void setStuMarks(int stuMarks) {
        this.stuMarks = stuMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuMarks=" + stuMarks +
                '}';
    }

}

class StudentMain {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();
        l.add(new Student(23, "amit", 65));
        l.add(new Student(24, "rahul", 50));
        l.add(new Student(20, "alok", 75));

        Collections.sort(l, new IdComparator());
        System.out.println("after sorting the student list: " + l);

        List<Student> l1 = new ArrayList<>(l);
        Collections.sort(l1,new NameComparator());
        System.out.println("after sorting the list with names: " + l1);


    }
}
