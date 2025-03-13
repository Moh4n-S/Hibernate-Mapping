//read
package com.hib.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.StudentDetail;
import com.qn.entity.student;

public class App2 
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
       // session.get(null, args)

        student s=session.get(student.class,2);
        System.out.println(s);
        StudentDetail sd=session.get(StudentDetail.class,2);
        System.out.println(s);
        session.getTransaction().commit();
        }
}
