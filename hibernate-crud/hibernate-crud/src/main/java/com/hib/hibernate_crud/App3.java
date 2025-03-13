//update
package com.hib.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.student;

public class App3 
{
    public static void main( String[] args)
    {
        SessionFactory factory=new Configuration().
        							configure("hibernate.cfg.xml").
        							addAnnotatedClass(student.class).
        							buildSessionFactory();
        Session session=factory.getCurrentSession();
        session.beginTransaction();

        student s=(student)session.get(student.class,1);
        s.setLastName("ramesh tendaulkar");
        session.update(s);
        session.getTransaction().commit();
        }
}
