package com.khenissi.com.dao;

import java.util.List;

import com.khenissi.com.entities.Article;
import com.khenissi.com.entities.Category;



public interface ICategoryDao extends IGenericDao<Category> {
	
	public List<Article> selectAllArticlesByCategory(Long idCategory);

}
