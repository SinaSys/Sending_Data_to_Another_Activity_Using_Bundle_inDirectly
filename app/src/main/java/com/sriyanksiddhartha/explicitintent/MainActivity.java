package com.sriyanksiddhartha.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * A demo app of Explicit Intent.
 *  - How to start a new Activity.
 *  - How to share data between the Activities.
 **/
public class MainActivity extends AppCompatActivity {

	private Button submitBtn;
	private EditText nameEditText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		submitBtn = (Button) findViewById(R.id.submitBtn);
		nameEditText = (EditText) findViewById(R.id.nameEditText);

		submitBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				moveToSecondActivity_SecondWay();
			}
		});
	}



	/**
	 * Using Intent reference to store data inside the Bundle so as to pass on to Target Activity.
	 * So, here we are using Bundle Indirectly.
	 */
	private void moveToSecondActivity_SecondWay() {
		Intent intent = new Intent(MainActivity.this, SecondActivity.class);

		intent.putExtra(Constants.KEY_NAME, nameEditText.getText().toString());
		intent.putExtra(Constants.KEY_AGE, 23);

		startActivity(intent);
	}
}
