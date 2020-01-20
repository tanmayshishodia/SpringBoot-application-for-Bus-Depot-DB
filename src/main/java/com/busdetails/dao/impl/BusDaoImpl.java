package com.busdetails.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.busdetails.dao.BusDao;
import com.busdetails.model.Bus;

@Repository
public class BusDaoImpl extends JdbcDaoSupport implements BusDao{
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	@Override
	public void insertBus(Bus bus) {
		String sql = "INSERT INTO bus " +
				"(busID, busName, modelName, route, startTime, endTime, offDay, driverNum, parkAddr, busType) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
		getJdbcTemplate().update(sql, new Object[]{
				bus.getBusID(), bus.getBusName(),bus.getModelName(),bus.getRoute(),bus.getStartTime(),bus.getEndTime(),bus.getOffDay(),bus.getDriverNum(),bus.getParkAddr(),bus.getBusType()
		});
	}

	
	@Override
	public List<Bus> getAllBuses(){
		String sql = "SELECT * FROM bus";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Bus> result = new ArrayList<Bus>();
		for(Map<String, Object> row:rows){
			Bus bus = new Bus();
			bus.setBusID((String)row.get("busID"));
			bus.setBusName((String)row.get("busName"));
			bus.setModelName((String)row.get("modelName"));
			bus.setRoute((String)row.get("route"));
			bus.setStartTime((String)row.get("startTime"));
			bus.setEndTime((String)row.get("endTime"));
			bus.setOffDay((String)row.get("offDay"));
			bus.setDriverNum((String)row.get("driverNum"));
			bus.setParkAddr((String)row.get("parkAddr"));
			bus.setBusType((String)row.get("busType"));
			
			result.add(bus);
		}
		
		return result;
	}

	@Override
	public void deleteBus(Bus bus) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM bus Where busID = ?" ;
		getJdbcTemplate().update(sql, new Object[]{
				bus.getBusID()
		});
		
	}

	@Override
	public void updateBus(Bus bus) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update("update bus " + " set route = ?, startTime = ? , endTime = ?" + " where busID = ?",
				new Object[] {bus.getRoute(),bus.getStartTime(),bus.getEndTime(),bus.getBusID()});
		
	}

	@Override
	public List<Bus> FindBusById(Bus bus){
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList("select * from bus where busID=?", new Object[]{bus.getBusID()});
		
		List<Bus> result = new ArrayList<Bus>();
		for(Map<String, Object> row:rows){
			Bus bus1 = new Bus();
			bus1.setBusID((String)row.get("busID"));
			bus1.setBusName((String)row.get("busName"));
			bus1.setModelName((String)row.get("modelName"));
			bus1.setRoute((String)row.get("route"));
			bus1.setStartTime((String)row.get("startTime"));
			bus1.setEndTime((String)row.get("endTime"));
			bus1.setOffDay((String)row.get("offDay"));
			bus1.setDriverNum((String)row.get("driverNum"));
			bus1.setParkAddr((String)row.get("parkAddr"));
			bus1.setBusType((String)row.get("busType"));
			result.add(bus1);
		}
		
		return result;
	}
	
	@Override
	public List<Bus> FindBusByType1(Bus bus){
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList("select * from bus where busType=?", new Object[]{bus.getBusType()});
		
		List<Bus> result = new ArrayList<Bus>();
		for(Map<String, Object> row:rows){
			Bus bus1 = new Bus();
			bus1.setBusID((String)row.get("busID"));
			bus1.setBusName((String)row.get("busName"));
			bus1.setModelName((String)row.get("modelName"));
			bus1.setRoute((String)row.get("route"));
			bus1.setStartTime((String)row.get("startTime"));
			bus1.setEndTime((String)row.get("endTime"));
			bus1.setOffDay((String)row.get("offDay"));
			bus1.setDriverNum((String)row.get("driverNum"));
			bus1.setParkAddr((String)row.get("parkAddr"));
			bus1.setBusType((String)row.get("busType"));
			result.add(bus1);
		}
		
		return result;
	}
	@Override
	public List<Bus> FindBusByOff(Bus bus){
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList("select * from bus where offDay=?", new Object[]{bus.getOffDay()});
		
		List<Bus> result = new ArrayList<Bus>();
		for(Map<String, Object> row:rows){
			Bus bus1 = new Bus();
			bus1.setBusID((String)row.get("busID"));
			bus1.setBusName((String)row.get("busName"));
			bus1.setModelName((String)row.get("modelName"));
			bus1.setRoute((String)row.get("route"));
			bus1.setStartTime((String)row.get("startTime"));
			bus1.setEndTime((String)row.get("endTime"));
			bus1.setOffDay((String)row.get("offDay"));
			bus1.setDriverNum((String)row.get("driverNum"));
			bus1.setParkAddr((String)row.get("parkAddr"));
			bus1.setBusType((String)row.get("busType"));
			result.add(bus1);
		}
		
		return result;
	}
}