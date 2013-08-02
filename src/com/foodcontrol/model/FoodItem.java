package com.foodcontrol.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class FoodItem {
	
	@DatabaseField(generatedId=true)
	private int id;
	
	@DatabaseField
	private String name;
	
	@DatabaseField
	private double pref;
	
	@DatabaseField
	private double qty;
	
	@DatabaseField
	private double hcarbon;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPref() {
		return pref;
	}

	public void setPref(double pref) {
		this.pref = pref;
	}

	public double getHcarbon() {
		return hcarbon;
	}

	public void setHcarbon(double hcarbon) {
		this.hcarbon = hcarbon;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}
	
	
}
