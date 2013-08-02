package com.foodcontrol.db;

import java.sql.SQLException;
import java.util.List;

import android.content.Context;

import com.foodcontrol.model.FoodItem;


public class DatabaseManager {

	static private DatabaseManager instance;

	static public void init(Context ctx) {
		if (null==instance) {
			instance = new DatabaseManager(ctx);
		}
	}

	static public DatabaseManager getInstance() {
		return instance;
	}

	private DatabaseHelper helper;
	private DatabaseManager(Context ctx) {
		helper = new DatabaseHelper(ctx);
	}

	private DatabaseHelper getHelper() {
		return helper;
	}

	public List<FoodItem> getAllFoodItem() {
		List<FoodItem> wishLists = null;
		try {
			wishLists = getHelper().getFoodItemDao().queryForAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return wishLists;
	}

	public void addFoodItem(FoodItem l) {
		try {
			getHelper().getFoodItemDao().create(l);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public FoodItem getFoodItemById(int id) {
		FoodItem wishList = null;
		try {
			wishList = getHelper().getFoodItemDao().queryForId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return wishList;
	}
	

	public void deleteFoodItem(FoodItem f) {
		try {
			getHelper().getFoodItemDao().delete(f);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void refreshFoodItemList(FoodItem f) {
		try {
			getHelper().getFoodItemDao().refresh(f);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateFoodItem(FoodItem f) {
		try {
			getHelper().getFoodItemDao().update(f);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}