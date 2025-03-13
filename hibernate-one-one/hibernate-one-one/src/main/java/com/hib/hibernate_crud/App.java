//create
package com.hib.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.StudentDetail;
import com.qn.entity.student;

public class App 
{         
    public static void main( String[] args)
    {
        SessionFactory factory=new Configuration().
        							configure("hibernate.cfg.xml").
        							addAnnotatedClass(student.class).
        							addAnnotatedClass(StudentDetail.class).
        							buildSessionFactory();
        Session session=factory.getCurrentSession();
        session.beginTransaction();

        student s=new student("virat","kholi","virat@gmail.com");
        StudentDetail sd=new StudentDetail("computer","singing");
        s.setSd(sd);
        session.save(s);
        session.getTransaction().commit();
        }
}
