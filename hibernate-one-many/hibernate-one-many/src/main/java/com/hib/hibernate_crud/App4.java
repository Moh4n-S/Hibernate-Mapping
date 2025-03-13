//delete 
package com.hib.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.StudentDetail;
import com.qn.entity.courses;
import com.qn.entity.student;

public class App4 
{
    public static void main( String[] args)
    {
        SessionFactory factory=new Configuration().
        							configure("hibernate.cfg.xml").
        							addAnnotatedClass(student.class).
        							addAnnotatedClass(StudentDetail.class).
        							addAnnotatedClass(courses.class).
        							buildSessionFactory();
        Session session=factory.getCurrentSession();
        session.beginTransaction();
        
        
       courses c=session.get(courses.class,10);
        session.delete(c);
        session.getTransaction().commit();
        }
}
