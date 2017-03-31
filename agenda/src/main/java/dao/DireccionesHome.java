package dao;
// Generated 30-mar-2017 15:52:53 by Hibernate Tools 4.3.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import control.Direcciones;

/**
 * Home object for domain model class Direcciones.
 * @see control.Direcciones
 * @author Hibernate Tools
 */
@Stateless
public class DireccionesHome {

	private static final Log log = LogFactory.getLog(DireccionesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Direcciones transientInstance) {
		log.debug("persisting Direcciones instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Direcciones persistentInstance) {
		log.debug("removing Direcciones instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Direcciones merge(Direcciones detachedInstance) {
		log.debug("merging Direcciones instance");
		try {
			Direcciones result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Direcciones findById(Integer id) {
		log.debug("getting Direcciones instance with id: " + id);
		try {
			Direcciones instance = entityManager.find(Direcciones.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
