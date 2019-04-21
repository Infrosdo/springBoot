package priv.huke.Service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import priv.huke.Service.StudentService;
import priv.huke.dao.StudentDao;
import priv.huke.vo.Student;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

//    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addStudent(Student student) throws Exception {
        int result = studentDao.insertStudent(student);
//        int i = 3 / 0;
//        if (true) {
//            throw new Exception("异常!");
//        }
//        result = dao.addStudent(student);
        return result;
    }

    @Override
    public Student Sel(int id) {
        return studentDao.Sel(id);
    }
}
