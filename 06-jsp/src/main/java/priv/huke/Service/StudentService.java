package priv.huke.Service;

import priv.huke.vo.Student;

public interface StudentService {
    int addStudent(Student student) throws Exception;

    Student Sel(int id);
}
