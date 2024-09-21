package com.medplus.smartcity.dao;

import java.util.List;

import com.medplus.smartcity.beans.Business;

public interface BusinessDao {
	int addBussiness(Business business);
	List<Business> getBusiness();
	List<Business> searchBusiness(String keyword);
	int updateBusiness(Business business);
	Business getBusinessbyId(int id);
}
