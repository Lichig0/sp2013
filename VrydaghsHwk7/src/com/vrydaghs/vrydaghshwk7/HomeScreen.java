package com.vrydaghs.vrydaghshwk7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends Activity {
	
	int MANAGE_ASSIGNMENTS_REQUEST_CODE = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		
	final Button assignmentsbutton = (Button)findViewById(R.id.manageassignments);
	
	assignmentsbutton.setOnClickListener(new Button.OnClickListener(){
		public void onClick(View v){
			try{
				startActivityForResult(new Intent(v.getContext(), ManageAssignments.class), MANAGE_ASSIGNMENTS_REQUEST_CODE);
			} catch(Exception e){
			}
		}
	} );
}
}