//create
package com.hib.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.StudentDetail;
import com.qn.entity.courses;
import com.qn.entity.student;

public class App 
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

        student s=session.get(student.class,4);
        courses c1=new courses("mysql",s);
        courses c2=new courses("java",s);
        
        courses c3=new courses("python",s);
        s.addCourse(c1);
        s.addCourse(c2);
        s.addCourse(c3);
        session.save(c1);
        session.save(c2);
        session.save(c3);
        session.getTransaction().commit();
        }
}
