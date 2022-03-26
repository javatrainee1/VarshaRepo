/*
 * package com.example.studentmanagement;
 * 
 * import org.junit.jupiter.api.Assertions; import org.junit.jupiter.api.Test;
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * import com.example.studentmanagement.entity.Student; import
 * com.example.studentmanagement.repository.StudentRepository;
 * 
 * @SpringBootTest class StudentmanagementApplicationTests {
 * 
 * 
 * 
 * @Autowired StudentRepository studentRepository;
 * 
 * @Test void saveStudentTest(){ Student student = new
 * Student("Varsha","Khamkar","varshakhamkar@gmail.com");
 * studentRepository.save(student);
 * 
 * boolean actualResult = studentRepository.existsById((long)1);
 * Assertions.assertTrue(actualResult); }
 * 
 * @Test void updateStudentTest(){ Student student = new
 * Student("Pooja","Gupta","poojagupta@gmail.com");
 * studentRepository.save(student);
 * 
 * boolean actualResult = studentRepository.existsById((long)1);
 * Assertions.assertTrue(actualResult); }
 * 
 * @Test void deleteStudentTest(){ Student student = new
 * Student("Megha","Patil","meghapatil@gmail.com");
 * studentRepository.delete(student);
 * 
 * boolean actualResult = studentRepository.existsById((long)1);
 * Assertions.assertTrue(actualResult); } }
 * 
 */