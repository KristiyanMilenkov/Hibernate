import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //Create a new student
//        Student student = new Student();
//        student.setName("Simona");
//        session.save(student);

        //Get student by id
        //Student student = session.get(Student.class, 1);
        //System.out.printf("%d: %s",student.getId(), student.getName());

        //Update name student
        //student.setName("Boris Milenkov");

        //Custom Query
        //List<Student> students = session.createQuery("FROM Student ", Student.class).list();
        //for (Student current : students) {
        //    System.out.println(current);
        //}


        session.getTransaction().commit();
        session.close();


    }
}
