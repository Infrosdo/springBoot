package priv.huke.dao;

import org.springframework.stereotype.Repository;
import priv.huke.vo.Student;

@Repository
public interface StudentDao {
    int insertStudent(Student student);

    Student Sel(int id);
}
