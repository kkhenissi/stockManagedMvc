package com.khenissi.com.dao.impl;

import java.util.List;

import javax.persistence.Query;

import com.khenissi.com.dao.ICategoryDao;
import com.khenissi.com.entities.Article;
import com.khenissi.com.entities.Category;

@SuppressWarnings("unchecked")
public class CategoryDaoImpl extends GenericDaoImpl<Category> implements ICategoryDao {

	@Override
	public List<Article> selectAllArticlesByCategory(Long idCategory) {
		Query query = em.createQuery("select a from " + Article.class.getSimpleName() + " a where a.category.idCategory = :x");
		query.setParameter("x", idCategory);
		return query.getResultList();
	}

}
