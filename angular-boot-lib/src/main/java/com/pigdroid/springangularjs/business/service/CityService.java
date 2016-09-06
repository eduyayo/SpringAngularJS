package com.pigdroid.springangularjs.business.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pigdroid.springangularjs.business.entity.CityEntity;
import com.pigdroid.springangularjs.business.service.criteria.CitySearchCriteria;

public interface CityService extends CrudService<CityEntity>  {

	public Page<CityEntity> findCities(CitySearchCriteria criteria, Pageable pageable);
	public Long countCities(CitySearchCriteria criteria);
	public CityEntity getCity(CitySearchCriteria criteria);

}