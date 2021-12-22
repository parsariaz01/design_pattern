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
public class TransferObjectPatternDemo {
   public static void main(String[] args) {
      StudentBO studentBusinessObject = new StudentBO();

      //print all students
      for (StudentPOJO student : studentBusinessObject.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
      }

    

                                        //changes
      
      //we use to update studento name parsa record in database
        System.out.println("\n");
      StudentPOJO student = studentBusinessObject.getAllStudents().get(0);
      student.setName("parsa riaz");
      studentBusinessObject.updateStudent(student);
   
      //get the student
      student = studentBusinessObject.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]\n");
     
    //getting student record from  database using only rollno 
     
      
      
     //deleting record from databse
     student.setRollNo(1);
     studentBusinessObject.deleteStudent(student);
    
     //get all studentlist
     studentBusinessObject.getAllStudents();
       System.out.println("\nStudent: [ Name : " + student.getName() + " ]\n"); 
   }
}