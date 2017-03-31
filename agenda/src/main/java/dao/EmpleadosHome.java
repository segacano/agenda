package dao;
// Generated 30-mar-2017 15:52:53 by Hibernate Tools 4.3.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import control.Empleados;

/**
 * Home object for domain model class Empleados.
 * @see control.Empleados
 * @author Hibernate Tools
 */
@Stateless
public class EmpleadosHome {

	private static final Log log = LogFactory.getLog(EmpleadosHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Empleados transientInstance) {
		log.debug("persisting Empleados instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Empleados persistentInstance) {
		log.debug("removing Empleados instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Empleados merge(Empleados detachedInstance) {
		log.debug("merging Empleados instance");
		try {
			Empleados result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Empleados findById(Integer id) {
		log.debug("getting Empleados instance with id: " + id);
		try {
			Empleados instance = entityManager.find(Empleados.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
