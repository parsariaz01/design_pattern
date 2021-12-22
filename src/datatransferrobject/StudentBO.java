/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatransferrobject;

/**
 *
 * @author parsa
 */
import java.util.ArrayList;
import java.util.List;

public class StudentBO {
	
   //list is working as a database
   List<StudentPOJO> students;

   public StudentBO(){
      students = new ArrayList<StudentPOJO>();
      StudentPOJO student1 = new StudentPOJO("parsa",0);
      StudentPOJO student2 = new StudentPOJO("abc",1);
      students.add(student1);
      students.add(student2);		
   }
   public void deleteStudent(StudentPOJO student) {
      students.remove(student.getRollNo());
      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
   }

   
   //retrive list of students from the database
   public List<StudentPOJO> getAllStudents() {
      return students;
   }

   public StudentPOJO getStudent(int rollNo) {
      return students.get(rollNo);
   }

   public void updateStudent(StudentPOJO student) {
      students.get(student.getRollNo()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getRollNo() +", updated in the database");
   }
}