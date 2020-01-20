package com.busdetails.dao;


import java.util.List;

import com.busdetails.model.Bus;

public interface BusDao {
	void insertBus(Bus bus);
	List<Bus> getAllBuses();
	void deleteBus(Bus bus);
	void updateBus(Bus bus);
	List<Bus> FindBusById(Bus bus);
	List<Bus> FindBusByType1(Bus bus);
	List<Bus> FindBusByOff(Bus bus);
}