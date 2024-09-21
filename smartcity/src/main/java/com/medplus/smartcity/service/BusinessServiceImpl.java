package com.medplus.smartcity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.medplus.smartcity.beans.Business;
import com.medplus.smartcity.dao.BusinessDaoimpl;

public class BusinessServiceImpl implements BusinessServices{
	
	@Autowired
	BusinessDaoimpl bdao;

	@Override
	public int addBusiness(Business business) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBusiness(Business business) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBusiness(int bussinessId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Business> searchBusiness(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Business> viewBussiness() {
		// TODO Auto-generated method stub
		return null;
	}


}
