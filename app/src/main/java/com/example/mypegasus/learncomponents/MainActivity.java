package com.example.mypegasus.learncomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

	private Spinner s;
	private String[] dataSource = new String[]{"jiekexueyuan", "iwen", "ice"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		s = (Spinner) findViewById(R.id.spinner);


		s.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataSource));

		s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

				System.out.println(Integer.toHexString(parent.getId()));
				System.out.println(Integer.toHexString(view.getId()));
				System.out.println("用户选择的是" + dataSource[position]);
				System.out.println(id);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				System.out.println("nothing selected");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}