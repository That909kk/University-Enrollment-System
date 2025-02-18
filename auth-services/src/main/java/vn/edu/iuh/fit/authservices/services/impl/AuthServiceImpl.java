package vn.edu.iuh.fit.authservices.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.authservices.models.Student;
import vn.edu.iuh.fit.authservices.repositories.StudentRepository;
import vn.edu.iuh.fit.authservices.services.AuthService;


import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {
    private final StudentRepository studentRepository;

    @Autowired
    public AuthServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //    public AuthResponse register(Student student) {
//        //do validation if user already exists
//        student.setPassword(BCrypt.hashpw(student.getPassword(), BCrypt.gensalt()));
//
//        Student studentVO = studentClient.registerUser(student);
//        Assert.notNull(studentVO, "Failed to register user. Please try again later");
//
//        String accessToken = jwt.generate(student, "ACCESS");
//        String refreshToken = jwt.generate(student, "REFRESH");
//
//        return new AuthResponse(accessToken, refreshToken);
//    }
    @Override
    public Optional<Student> getStudentById(String id) {
        return studentRepository.findById(id);
    }
}
