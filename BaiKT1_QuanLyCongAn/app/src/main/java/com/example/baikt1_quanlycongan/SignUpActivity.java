package com.example.baikt1_quanlycongan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {


    Button signup;
    TextView login;
    EditText edtUser,edtEmail,edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signup = findViewById(R.id.btsignup);
        login = findViewById(R.id.loginnow);
        edtEmail= findViewById(R.id.edtemail);
        edtPass = findViewById(R.id.edtpass);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}