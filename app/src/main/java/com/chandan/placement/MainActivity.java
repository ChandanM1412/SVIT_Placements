package com.chandan.placement;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView title;
    Button adminbtn,topbtn,studentbtn,aboutbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    public void AdminClicked(View view) {
       Intent intent1 = new Intent(MainActivity.this,AdminLogin.class);
        startActivity(intent1);
    }

    public void TpoClicked(View view) {
       Intent i7 = new Intent(MainActivity.this,TPOLogin.class);
       startActivity(i7);
    }

    public void StudentClicked(View view) {
      Intent i8 = new Intent(MainActivity.this,StudentLogin.class);
       startActivity(i8);
    }
    public void AboutClicked(View view) {
        Intent i9 = new Intent(MainActivity.this,About.class);
        startActivity(i9);
    }

     @Override
    public void onBackPressed() {
        //super.onBackPressed();

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Warning!")
                .setMessage("Are you sure want to exit?")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.yes, new DialogInterface
                        .OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setCancelable(false)
                .show();
    }

}
