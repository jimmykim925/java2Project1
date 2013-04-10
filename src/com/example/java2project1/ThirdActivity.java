package com.example.java2project1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThirdActivity extends Activity{
	// buttons and string for url
	Button back;
	Button yahoo;
	String url;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// set layout
		setContentView(R.layout.third);
		
		// Get passed value for intent
		Intent i = getIntent();
		String val = i.getStringExtra("Two");
		
		if (val.contentEquals("Google")){
			// set url for yahoo finance for particular company 
			url = "http://finance.yahoo.com/q?s=goog&ql=1";
		}
	
		// back button
		back = (Button)findViewById(R.id.bBack);
		
		// set listener for back button
		back.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			// intent to finish activity and go back to original activity
			Intent resultIntent = new Intent();
			setResult(Activity.RESULT_OK, resultIntent);
			finish();
		}
	});
	
		// yahoo finance button
		yahoo = (Button)findViewById(R.id.bDetails);
		// set listener for yahoo button
		yahoo.setOnClickListener(new OnClickListener() {
	
		@Override
		public void onClick(View v) {
			
			// Implicit intent to load web browser with assigned url
			Intent web = new Intent(Intent.ACTION_VIEW);
			web.setData(Uri.parse(url));
			startActivity(web);
		}
	});
	
	}
}
