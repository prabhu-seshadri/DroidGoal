package com.goal;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.TextView;

public class DroidGoal extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
    }

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		
		return super.onKeyDown(keyCode, event);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		TextView welcome=(TextView)findViewById(R.id.welcome_box);
        welcome.setText("He He MVC Hello World");        
		super.onStart();
	}
    
    
}