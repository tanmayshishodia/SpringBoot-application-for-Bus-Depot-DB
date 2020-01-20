package com.busdetails.model;

public class Bus {
	private String busID;
	private String busName;
	private String modelName;
	private String route;
	private String startTime;
	private String endTime;
	private String offDay;
	private String driverNum;
	private String parkAddr;
	private String busType;
	private String sql;
	
	 
	
	public String getBusID() {
		return busID;
	}
	public void setBusID(String ID) {
		busID = ID;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String name) {
		busName = name;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String name) {
		modelName = name;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String r) {
		route = r;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String st) {
		startTime = st;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String et) {
		endTime = et;
	}
	public String getOffDay() {
		return offDay;
	}
	public void setOffDay(String day) {
		offDay = day;
	}
	public String getDriverNum() {
		return driverNum;
	}
	public void setDriverNum(String dn) {
		driverNum = dn;
	}
	public String getParkAddr() {
		return parkAddr;
	}
	public void setParkAddr(String addr) {
		parkAddr = addr;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String type) {
		busType = type;
	}
	
	/*@Override
	public String toString() {
		return "Bus [BusID=" + busID + ", Bus Name=" + busName + ",Model Name="+modelName+ "Route=" + route +"]";
	}*/
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}

}
