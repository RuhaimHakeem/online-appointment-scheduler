package com.ruhaim.appointment.model;

import java.sql.Date;
import java.sql.Time;

public class AvailabilityTime extends Consultant {
	
	private Date date;
	private Time time;
	private int consultantId;
	
	public AvailabilityTime() {
		// TODO Auto-generated constructor stub
	}


	public AvailabilityTime(Date date, Time time, int consultantId) {
		this.date = date;
		this.time = time;
		this.consultantId = consultantId;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}


	public int getConsultantId() {
		return consultantId;
	}


	public void setConsultantId(int consultantId) {
		this.consultantId = consultantId;
	}

}
