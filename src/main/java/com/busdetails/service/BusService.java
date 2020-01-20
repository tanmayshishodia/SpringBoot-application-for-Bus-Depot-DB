package com.busdetails.service;

import java.util.List;

import com.busdetails.model.Bus;

public interface BusService {
	void insertBus(Bus bus);
	List<Bus> getAllBuses();
	void deleteBus(Bus bus);
	void updateBus(Bus bus);
	List<Bus> FindBusById(Bus bus);
	List<Bus> FindBusByType1(Bus bus);
	List<Bus> FindBusByOff(Bus bus);
}
