package com.example.market_online;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	

  Button btnActTwo;
  final int how_to_use = 1;
  TextView Author;

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Author = (TextView) findViewById(R.id.Author);
	  
    //  необходимо создавать контекстное меню
    registerForContextMenu(Author);
    

    btnActTwo = (Button) findViewById(R.id.btnActTwo);
    btnActTwo.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
    case R.id.btnActTwo:
    	Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
      // TODO Call second activity
      break;
    default:
      break;
    }
  }
  @Override
  public void onCreateContextMenu(ContextMenu menu, View v,
      ContextMenuInfo menuInfo) {
    // TODO Auto-generated method stub
    switch (v.getId()) {
    case R.id.Author:
      menu.add(0, how_to_use, 0, "Masha_Sytnyk");
      
      break;
    
    }
  }

  @Override
  public boolean onContextItemSelected(MenuItem item) {
    // TODO Auto-generated method stub
    switch (item.getItemId()) {
    
    case how_to_use:
    	Author.setTextColor(Color.RED);
    	Author.setText("Author is Masha Sytnyk");
      break;
    
    
    
    }
    return super.onContextItemSelected(item);
  }
}
