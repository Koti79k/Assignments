package Students.Service;

import java.util.HashMap;
import java.util.List;

import Students.Entity.Student;

public interface StudentService {
	public String addStudentDetails(String name);
	public String addMarksToStudents(String studentId, int semId, String subject, int marks);
	public Student getStudentById(String studentId);
	public List<Student> getAllStudentsDetails();
	public String deleteStudentById(String id);
	public String averagePercentageOfStudent(int sem);
	public HashMap<String, Double> top2StudentComparedToAllSemesters();
}
