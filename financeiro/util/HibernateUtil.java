package financeiro.util;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;


public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildeSessionFactory();

	private static SessionFactory buildeSessionFactory() {
		try{
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		}catch(Throwable e){
			System.out.println("Criação inicial do objeto SessionFactory falho. Erro: " + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
