package com.example.student.resourcemanagement;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by student on 3/30/2017.
 */

public class Login extends AppCompatActivity {
    private EditText username,password;
private Button btnlogin;
    private String PREFS_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        //SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);

        btnlogin=(Button)findViewById(R.id.btnlogin);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText username = (EditText) findViewById(R.id.login);
                EditText password = (EditText) findViewById(R.id.pass);


                if(username.getText().toString().equals("katyal@gmail.com") && password.getText().toString().equals("katyal")) {
                    //make SharedPreferences object
                    SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putString("logged", "logged");
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Successfull Login", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Login.this, FirstPage.class);
                    startActivity(intent);
                    username.setText("");
                    password.setText("");
                }
                    else

                        {
                            Toast.makeText(getApplicationContext(), "Incorrect LoginId Password ", Toast.LENGTH_SHORT).show();
                        }


                    //Intent intent = new Intent(Login.this,FirstPage.class);
                //startActivity(intent);
            }
        });

       }
}