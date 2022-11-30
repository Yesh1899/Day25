package com.infinite.oneToMany;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class QuestionDAO {

	SessionFactory sessionFactory;
	Session session;
	 
		public List<Question>  showQuestions(){
			sessionFactory = SessionHelper.getConnection();
			session = sessionFactory.openSession();
			Criteria cr=session.createCriteria(Question.class);
			Projection projection = Projections.property("qname");
			cr.setProjection(projection);
			List<Question>quesList=cr.list();
			return quesList;
		}
	
	public String addQuestion(Question question) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(question);
		transaction.commit();
		return "Question Added Successsfully...";
	}
	public String AddingAnswer(Adding adding) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(adding);
		transaction.commit();
		session.close();
		return "Answered..";
	}
}