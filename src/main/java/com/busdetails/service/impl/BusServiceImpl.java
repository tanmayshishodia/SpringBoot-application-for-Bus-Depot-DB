package com.busdetails.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.busdetails.dao.BusDao;
import com.busdetails.model.Bus;
import com.busdetails.service.BusService;

@Service
public class BusServiceImpl implements BusService {

	@Autowired
	BusDao busDao;

	@Override
	public void insertBus(Bus bus) {
		busDao.insertBus(bus);
	}
	@Override
	public List<Bus> getAllBuses() {
		return busDao.getAllBuses();
	}
	@Override
	public void deleteBus(Bus bus) {
		// TODO Auto-generated method stub
		busDao.deleteBus(bus);
	}
	@Override
	public void updateBus(Bus bus) {
		// TODO Auto-generated method stub
		busDao.updateBus(bus);
	}
	@Override
	public List<Bus> FindBusById(Bus bus) {
		// TODO Auto-generated method stub
		return busDao.FindBusById(bus);
	}
	@Override
	public List<Bus> FindBusByType1(Bus bus) {
		// TODO Auto-generated method stub
		return busDao.FindBusByType1(bus);
	}
	@Override
	public List<Bus> FindBusByOff(Bus bus) {
		// TODO Auto-generated method stub
		return busDao.FindBusByOff(bus);
	}

}