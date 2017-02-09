/*
	my app just changes the color of the background to what ever
	is clicked
	also when you click the click me button it says you clicked this.

*/




package com.example.rjuan.firstassignment;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonsIcon extends AppCompatActivity {
    View view;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_icon);

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.colorPrimaryDark);

        setMessageButton();

      // Toolbar myTool = (Toolbar)findViewById(R.id.myTool);

      //  setSupportActionBar(myTool);

      //  getSupportActionBar().setTitle("Colors");
      //  getSupportActionBar().setIcon(getDrawable(R.drawable.star));
    }


      /*
    @setMessageButton

     */

    public void setMessageButton() {
        //get reference to button
        Button messageBut = (Button) findViewById(R.id.messageBut);

        //set the click listener to run

        messageBut.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.i("DemoButtonapp", "You clicked a button!");
                Toast.makeText(ButtonsIcon.this, "You clicked it!", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void goRed(View v){
        view.setBackgroundResource(R.color.red);
    }

    public void goGreen(View v){
        view.setBackgroundResource(R.color.green);
    }

    public void goYellow(View v){
        view.setBackgroundResource(R.color.yellow);
    }

}
