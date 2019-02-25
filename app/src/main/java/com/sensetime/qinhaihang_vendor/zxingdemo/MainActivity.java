package com.sensetime.qinhaihang_vendor.zxingdemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_qrcode;
    private EditText et_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_qrcode = findViewById(R.id.iv_qrcode);
        et_input = findViewById(R.id.et_input);
    }

    public void creatQrCode(View view) {
        String value = et_input.getText().toString().trim();
        Bitmap qrCodeBitmap = QRCodeUtils.createQRCodeBitmap(value, 200, 200);
        iv_qrcode.setImageBitmap(qrCodeBitmap);
    }
}
