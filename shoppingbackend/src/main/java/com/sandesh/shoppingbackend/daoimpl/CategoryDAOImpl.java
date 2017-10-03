package com.sandesh.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sandesh.shoppingbackend.dao.CategoryDAO;
import com.sandesh.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<Category> list() {
		String selectQuery = "FROM Category WHERE active = :active";
		return sessionFactory.getCurrentSession()
				.createQuery(selectQuery, Category.class)
					.setParameter("active", true)
						.getResultList();
	}

	@Override
	public Category get(Integer id) {
		return sessionFactory.getCurrentSession().get(Category.class, id);
	}

	@Override
	public boolean add(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch(Exception ex) {
			System.out.println(ex);
			return false;
		}
	}

	@Override
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch(Exception ex) {
			System.out.println(ex);
			return false;
		}
	}

	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch(Exception ex) {
			System.out.println(ex);
			return false;
		}
	}

}
