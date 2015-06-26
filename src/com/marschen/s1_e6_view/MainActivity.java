package com.marschen.s1_e6_view;

import android.app.Activity;
import android.content.DialogInterface;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView textView;
	private Button button;
	int count = 0;
	String name = "haiyun";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fist_layout);
        textView = (TextView)findViewById(R.id.textView);
        textView.setText("HI haiyun");
        button = (Button)findViewById(R.id.button);
        ButtonListener buttonListener = new ButtonListener();
        button.setOnClickListener(buttonListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public class ButtonListener implements OnClickListener {			
		@Override
		public void onClick(View arg0) {
			count++;
			textView.setText(""+count);
			
		}

	
		
    	
    }
    
}
