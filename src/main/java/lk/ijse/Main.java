package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.embed.FullName;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        FullName fullName = new FullName("Oshi", "Vimarsha");
        Student student = new Student();
        student.setId(1);
        student.setFullName(fullName);
        student.setAddress("Kalutara");

        Transaction transaction = session.beginTransaction();
      //  delete, get, another table, note
      //  session.save(student);
      //  session.update(student);
      //  session.delete(student);

        Student st = session.get(Student.class,1);
        if (st!=null){
            System.out.println(student.getId());
            System.out.println(student.getAddress());
            System.out.println(student.getFullName().getFirstName());
            System.out.println(student.getFullName().getSecondName());
        }

        transaction.commit();
        session.close();


    }
}
