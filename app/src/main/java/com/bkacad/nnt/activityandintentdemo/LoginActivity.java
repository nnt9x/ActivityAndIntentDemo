package com.bkacad.nnt.activityandintentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText edtAccount, edtPassword;
    private Button btnLogin;

    /*
    Fake sự kiện đăng nhập: validate input -> không rỗng -> chuyển sang trang main coi như
    đăng nhập thành công.

     */

    private void initView(){
        edtAccount = findViewById(R.id.edt_login_account);
        edtPassword = findViewById(R.id.edt_login_password);
        btnLogin = findViewById(R.id.btn_login);
    }

    private boolean validateInput(){
        // True: dữ liệu hợp liệu, False: không hợp lệ
        String account = edtAccount.getText().toString();
        if(account.isEmpty()){
            edtAccount.setError("Enter account!");
            return false;
        }
        String password = edtPassword.getText().toString();
        if(password.isEmpty()){
            edtPassword.setError("Enter password");
            return false;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        // Khai báo sự kiện khi click vào button Login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validate dữ liệu
                if(validateInput()){
                    // Chuyển hướng sang Main Activity
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    i.putExtra("key","From Login Activity");
                    startActivity(i);
                }
            }
        });
    }
}