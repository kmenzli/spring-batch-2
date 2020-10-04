package org.training.spring;

import org.springframework.batch.item.ItemReader;
import org.training.spring.model.StudentDTO;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomReader implements ItemReader<StudentDTO> {


    private int nextStudentIndex;
    private List<StudentDTO> studentData;

    public CustomReader() {
        initialize();
    }

    public StudentDTO read() throws Exception {
        StudentDTO nextStudent = null;

        if (nextStudentIndex < studentData.size()) {
            nextStudent = studentData.get(nextStudentIndex);
            nextStudentIndex++;
        }

        return nextStudent;
    }


    private void initialize() {
        StudentDTO tony = new StudentDTO();
        tony.setEmailAddress("tony.tester@gmail.com");
        tony.setName("Tony Tester");
        tony.setPurchasedPackage("master");

        StudentDTO nick = new StudentDTO();
        nick.setEmailAddress("nick.newbie@gmail.com");
        nick.setName("Nick Newbie");
        nick.setPurchasedPackage("starter");

        StudentDTO ian = new StudentDTO();
        ian.setEmailAddress("ian.intermediate@gmail.com");
        ian.setName("Ian Intermediate");
        ian.setPurchasedPackage("intermediate");

        StudentDTO s4 = new StudentDTO();
        ian.setEmailAddress("s4@gmail.com");
        ian.setName("S4");
        ian.setPurchasedPackage("S5");

        StudentDTO s5 = new StudentDTO();
        ian.setEmailAddress("s5@gmail.com");
        ian.setName("S5");
        ian.setPurchasedPackage("S5");

        studentData = Collections.unmodifiableList(Arrays.asList(tony, nick, ian));
        nextStudentIndex = 0;
    }
}
