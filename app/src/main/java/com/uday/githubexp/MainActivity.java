package com.uday.githubexp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView tv = (TextView)findViewById(R.id.tv);

    tv.setText("Hello");
    tv.setText("Hello");
    tv.setText("Hello");
    tv.setText("Hello");


/*
    TextView tv2 = (TextView)findViewById(R.id.tv);
    TextView tv3 = (TextView)findViewById(R.id.tv);

*/



  }
}
