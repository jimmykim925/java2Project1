/*	Jimmy Kim
 *  Java 2 Project 1
 * 	Term: 1304
 */

package com.example.java2project1;

import android.os.Bundle;
import android.os.Debug;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class JavaProject1MainActivity extends Activity {
	// set up two buttons
	Button bSecond, bThird;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// set layout for main page
		setContentView(R.layout.activity_java_project1_main);
		
		// set up buttons
		bSecond = (Button)findViewById(R.id.bSecond);
		bThird = (Button)findViewById(R.id.bThird);
		// button listener
		bSecond.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// Explicit Intent sending string to activity
				Intent intent = new Intent("com.example.java2project1.SECONDACTIVITY");
				intent.putExtra("One", "Apple");
				startActivity(intent);
				
			}
		});
		
		bThird.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// Explicit Intent sending string to activity
				Intent intent = new Intent("com.example.java2project1.THIRDACTIVITY");
				intent.putExtra("Two", "Google");
				startActivity(intent);
				
			}
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.java_project1_main, menu);
		return true;
	}

}
