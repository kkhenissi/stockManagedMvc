package com.khenissi.com.services;

import java.util.List;

import com.khenissi.com.entities.MvtStk;



public interface IMvtStkService {
	
	public MvtStk save(MvtStk entity);
	
	public MvtStk update(MvtStk entity);

	public List<MvtStk> selectAll();

	public List<MvtStk> selectAll(String sortField, String sort);

	public MvtStk getById(Long id);

	public void remove(Long id);

	public MvtStk findOne(String paramName, Object paramValue);

	public MvtStk findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
