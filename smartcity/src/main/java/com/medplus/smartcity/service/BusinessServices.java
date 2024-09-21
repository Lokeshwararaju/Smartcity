package com.medplus.smartcity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medplus.smartcity.beans.Business;

@Service
public interface BusinessServices {
	
	int addBusiness(Business business);
	int updateBusiness(Business business);
	int deleteBusiness(int bussinessId);
	List<Business> searchBusiness(String keyword);
	List<Business> viewBussiness();
	
}
