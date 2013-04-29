package com.vrydaghs.vrydaghshwk7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManageAssignments extends Activity {
	int SAVE_JOB_LIST_REQUEST_CODE = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.manage_assignments);
		//savesettingsbutton
		
		final Button savebutton = (Button)findViewById(R.id.savesettingsbutton);
		savebutton.setOnClickListener(new Button.OnClickListener() {
		public void onClick(View v){
			try{
				startActivityForResult(new Intent(v.getContext(), SaveJobList.class), SAVE_JOB_LIST_REQUEST_CODE);
			}
			catch (Exception e){
			}
		}
	});
	}
}
