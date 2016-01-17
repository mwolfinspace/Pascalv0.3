package com.example.phunguyen.pascalv3;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Tạo bởi phunguyen lúc 1/15/16.
 */
public class bai3a extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);

        //Khoi tao va thiet lap toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Nut tren thanh
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Tieu de
        getSupportActionBar().setTitle(R.string.bai_3);



        //Thay hinh nen tren dau 3
        ImageView hinhcover = (ImageView) findViewById(R.id.hinhcover);
        hinhcover.setImageResource(R.drawable.bai1);

        //Nhap xuat font
        Typeface codeFont = Typeface.createFromAsset(getAssets(), "fonts/SourceCodePro-Regular.ttf");

        //Noi dung bai hoc 3
        //Tao khong gian
        LinearLayout noidungbai1 = (LinearLayout) findViewById(R.id.noidungbai);
        LinearLayout.LayoutParams tuabai = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tuabai.setMargins(0, 0, 0, 8);


        //Them thu noi dung chu
        CardView khungbai1 = (CardView) View.inflate(this, R.layout.khung_chua_bai, null);
        TextView noidung1 = (TextView) khungbai1.findViewById(R.id.noidung);
        noidung1.setText(R.string.large_text);
        //Add noi dung vao khung
        noidungbai1.addView(khungbai1, tuabai);


        //Noi dung phan code
        //Them thu noi dung code
        CardView khungbai2 = (CardView) View.inflate(this, R.layout.khung_chua_bai, null);
        TextView noidung2 = (TextView) khungbai2.findViewById(R.id.noidung);
        noidung2.setText(R.string.testcode);
        noidung2.setTypeface(codeFont);
        noidungbai1.addView(khungbai2, tuabai);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    //Quan ly nut Back
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intent = new Intent(this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
