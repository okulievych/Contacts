package com.okulievych;

import com.okulievych.activity.AllContacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class main extends Activity {
	
	private Button allContactsButton;
	private Button exitButton;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        this.initializeComponents();
        this.exitButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				exit();
				
			}
		});
        
        this.allContactsButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showAllContacts(v);
				
			}
		});
    }
    
    private void initializeComponents(){
    	this.allContactsButton = (Button)this.findViewById(R.id.allContacts);
    	this.exitButton = (Button)this.findViewById(R.id.exit);
    }
    
    private void exit(){
    	this.finish();
    }
    
    private void showAllContacts(View v){
    	Intent myIntent = new Intent(v.getContext(), AllContacts.class);
        startActivityForResult(myIntent, 0);
    }
}