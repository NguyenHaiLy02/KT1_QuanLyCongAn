package com.example.baikt1_quanlycongan;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username,pass;
    CheckBox luumk;
    Button login,signup;
    SharedPreferences sharedPreferences;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedPreferences = getSharedPreferences("dataLogin",MODE_PRIVATE);
        Anhxa();
        username.setText(sharedPreferences.getString("taikhoan",""));
        pass.setText(sharedPreferences.getString("matkhau",""));
        luumk.setChecked(sharedPreferences.getBoolean("checked",false));
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = username.getText().toString().trim();
                String password = pass.getText().toString().trim();
                if(uname.equals("haily")&& password.equals("1234")){
                    Toast.makeText(LoginActivity.this,"Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                    if(luumk.isChecked()){
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("taikhoan",uname);
                        editor.putString("matkhau",password);
                        editor.putBoolean("checked",true);
                        editor.commit();
                    }
                }else
                    Toast.makeText(LoginActivity.this, "Lỗi đăng nhập", Toast.LENGTH_SHORT).show();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    private void Anhxa() {
        username = (EditText) findViewById(R.id.edtemail);
        pass = (EditText) findViewById(R.id.edtpass);
        luumk = (CheckBox) findViewById(R.id.tvluu);
        login = (Button) findViewById(R.id.btlogin);
        signup = (Button) findViewById(R.id.btsignup);
    }
}