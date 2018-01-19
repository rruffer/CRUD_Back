/*package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public final class JpaUtil {
	
	private static final String PERSISTENCE_UNIT = "Produto";
	private static ThreadLocal<EntityManager> threadEntityManager = new ThreadLocal<EntityManager>();
	private static EntityManagerFactory entityManagerFactory;

	public JpaUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public static EntityManager getEntityManager() {
		if(entityManagerFactory == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
		}
		
		EntityManager entityManager = threadEntityManager.get();
		
		if(entityManager == null || !entityManager.isOpen()) {
			entityManager = entityManagerFactory.createEntityManager();
			threadEntityManager.set(entityManager);
		}
		
		return entityManager;
	}
	
	public static EntityManager closeEntityManager() {
		
		EntityManager entityManager = threadEntityManager.get();

		if(entityManager != null) {
			EntityTransaction transaction = entityManager.getTransaction();
			
			if(transaction.isActive()) {
				transaction.commit();
			}
			
			entityManager.close();
			threadEntityManager.set(null);
			
		}
		
		return entityManager;
	}
	
	public static void closeEntityManagerFactory() {
		closeEntityManager();
		entityManagerFactory.close();
	}
	
}
*/