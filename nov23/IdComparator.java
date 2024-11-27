package nov23;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {
        return s1.getStuId()- s2.getStuId();
    }
}
