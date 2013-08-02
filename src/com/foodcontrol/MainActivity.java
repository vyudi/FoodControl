package com.foodcontrol;

import com.foodcontrol.db.DatabaseManager;
import com.foodcontrol.model.FoodItem;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        DatabaseManager.init(this);
        
        Button btnAddFoodItem = (Button) this.findViewById(R.id.btnAddFoodItem);
        
        btnAddFoodItem.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
					createItemFood("aa", 1, 1, 1);
					Toast.makeText(v.getContext(), "Put your message here", Toast.LENGTH_SHORT).show();
				};
			});
    }
    
    private void createItemFood(String name, double p, double qty, double hcarbon){
    	FoodItem f = new FoodItem();
    	f.setName(name);
    	f.setPref(p);
    	f.setQty(qty);
    	f.setHcarbon(hcarbon);
    	DatabaseManager.getInstance().addFoodItem(f);
    }
}