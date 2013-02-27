package com.example.market_online;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ActivityTwo extends Activity {
	final String LOG_TAG = "myLogs";
	  ListView list;
	  

	String[] names = { "Иван", "Марья", "Петр", "Антон", "Даша", "Борис",
		      "Костя", "Игорь", "Анна", "Денис", "Андрей" };

		  /** Called when the activity is first created. */
		  public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.two);

		    list = (ListView) findViewById(R.id.list);

		    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
		        this, R.array.names, android.R.layout.simple_list_item_1);
		    list.setAdapter(adapter);

		    list.setOnClickListener(new OnItemClickListener() {
		      public void onItemClick(AdapterView<?> parent, View view,
		          int position, long id) {
		        Log.d(LOG_TAG, "itemClick: position = " + position + ", id = "
		            + id);
		      }
		    });

		    list.setOnItemSelectedListener(new OnItemSelectedListener() {
		      public void onItemSelected(AdapterView<?> parent, View view,
		          int position, long id) {
		        Log.d(LOG_TAG, "itemSelect: position = " + position + ", id = "
		            + id);
		      }

		      public void onNothingSelected(AdapterView<?> parent) {
		        Log.d(LOG_TAG, "itemSelect: nothing");
		      }
		    });

		    list.setOnClickListener(new OnScrollListener() {
		      public void onScrollStateChanged(AbsListView view, int scrollState) {
		        Log.d(LOG_TAG, "scrollState = " + scrollState);
		      }

		     public void onScroll(AbsListView view, int firstVisibleItem,
		          int visibleItemCount, int totalItemCount) {
		        Log.d(LOG_TAG, "scroll: firstVisibleItem = " + firstVisibleItem
		            + ", visibleItemCount" + visibleItemCount
		            + ", totalItemCount" + totalItemCount);
		      }
		    });

		  }
		}

		    