package com.example.mypegasus.learncomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MulChoose extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

	private CheckBox cb1, cb2, cb3, cb4;
	private TextView tvResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mul_choose);

		tvResult = (TextView) findViewById(R.id.tv_result);

		cb1 = (CheckBox) findViewById(R.id.cb1);
		cb2 = (CheckBox) findViewById(R.id.cb2);
		cb3 = (CheckBox) findViewById(R.id.cb3);
		cb4 = (CheckBox) findViewById(R.id.cb4);

		cb1.setOnCheckedChangeListener(this);
		cb2.setOnCheckedChangeListener(this);
		cb3.setOnCheckedChangeListener(this);
		cb4.setOnCheckedChangeListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_mul_choose, menu);
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

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

		System.out.println(buttonView.getText());
		System.out.println(isChecked);

		String result = "你喜欢";
		if(cb1.isChecked()) {
			result += cb1.getText() + ",";
		}
		if(cb2.isChecked()) {
			result += cb2.getText() + ",";
		}
		if(cb3.isChecked()) {
			result += cb3.getText() + ",";
		}
		if(cb4.isChecked()) {
			result += cb4.getText();
		}
		tvResult.setText(result);
	}
}
