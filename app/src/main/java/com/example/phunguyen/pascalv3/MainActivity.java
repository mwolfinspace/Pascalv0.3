package com.example.phunguyen.pascalv3;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle("Pascal v0.3.0.1");


        //Tao khong gian
        LinearLayout tuaBai = (LinearLayout) findViewById(R.id.noi_dung_chinh);
        LinearLayout.LayoutParams tuabai = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tuabai.setMargins(0, 0, 0, 8);
        LinearLayout.LayoutParams dapan = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dapan.setMargins(8, 8, 8, 8);

        //Nhap xuat font
        Typeface codeFont = Typeface.createFromAsset(getAssets(), "fonts/SourceCodePro-Regular.ttf");

        /**
         * Dựng khung bài 1
         */
        CardView bai1 = (CardView) View.inflate(this, R.layout.bai_hoc, null);
        //Chinh sua noi dung bai 1
        RelativeLayout nenbai1 = (RelativeLayout) bai1.findViewById(R.id.nen);
        TextView tenbai1 = (TextView) bai1.findViewById(R.id.tenbai);

        tenbai1.setText(R.string.bai_1);
        nenbai1.setBackgroundResource(R.drawable.bai1);
        //Nhan nut bai 1
        Button baihoc1 = (Button) bai1.findViewById(R.id.timhieu);
        Button baitap1 = (Button) bai1.findViewById(R.id.vandung);
        //Chuyen sang bai hoc 1
        baihoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bai1a.class);
                //Goi bai hoc
                startActivity(intent);

            }
        });
        //Chuyen sang bai tap 1
        baitap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bai1b.class);
                //Goi bai tap
                startActivity(intent);

            }
        });

        //Add view bai 1
        tuaBai.addView(bai1, tuabai);

        /**
         * Dựng khung bài 2
         */
        CardView bai2 = (CardView) View.inflate(this, R.layout.bai_hoc, null);
        //Chinh sua noi dung bai 2
        RelativeLayout nenbai2 = (RelativeLayout) bai2.findViewById(R.id.nen);
        TextView tenbai2 = (TextView) bai2.findViewById(R.id.tenbai);

        tenbai2.setText(R.string.bai_2);
        nenbai2.setBackgroundResource(R.drawable.bai1);
        //Nhan nut bai 2
        Button baihoc2 = (Button) bai2.findViewById(R.id.timhieu);
        Button baitap2 = (Button) bai2.findViewById(R.id.vandung);

        //Add view bai 2
        tuaBai.addView(bai2, tuabai);
        //Chuyen sang bai hoc 2
        baihoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bai2a.class);
                //Goi bai hoc
                startActivity(intent);
                assert getSupportActionBar() == null;

            }
        });
        //Chuyen sang bai tap 2
        baitap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bai2b.class);
                //Goi bai tap
                startActivity(intent);

            }
        });


        /**
         * Dựng khung bài 3
         */
        CardView bai3 = (CardView) View.inflate(this, R.layout.bai_hoc, null);
        //Chinh sua noi dung bai 3
        RelativeLayout nenbai3 = (RelativeLayout) bai3.findViewById(R.id.nen);
        TextView tenbai3 = (TextView) bai3.findViewById(R.id.tenbai);

        tenbai3.setText(R.string.bai_3);
        nenbai3.setBackgroundResource(R.drawable.bai1);
        //Nhan nut bai 3
        Button baihoc3 = (Button) bai3.findViewById(R.id.timhieu);
        Button baitap3 = (Button) bai3.findViewById(R.id.vandung);

        //Add view bai 3
        tuaBai.addView(bai3, tuabai);
        //Chuyen sang bai hoc 2
        baihoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bai3a.class);
                //Goi bai hoc
                startActivity(intent);

            }
        });
        //Chuyen sang bai tap 2
        baitap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bai3b.class);
                //Goi bai tap
                startActivity(intent);

            }
        });

    }

    /**
     * Thoát ứng dụng
     */
    private void doExit() {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

        alertDialog.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialog.setNegativeButton("Hủy bỏ", null);

        alertDialog.setMessage("Bạn muốn đóng ứng dụng?");
        alertDialog.setTitle("Pascal v0.3.0.1");
        alertDialog.show();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if(keyCode == KeyEvent.KEYCODE_BACK) {
            doExit();
        }

        return super.onKeyDown(keyCode, event);
    }

}
