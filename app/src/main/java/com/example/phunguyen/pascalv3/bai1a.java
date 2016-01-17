package com.example.phunguyen.pascalv3;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class bai1a extends AppCompatActivity {

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
        getSupportActionBar().setTitle(R.string.bai_1);




        //Thay hinh nen tren dau
        ImageView hinhcover = (ImageView) findViewById(R.id.hinhcover);
        hinhcover.setImageResource(R.drawable.bai1);

        //Nhap xuat font
        Typeface codeFont = Typeface.createFromAsset(getAssets(), "fonts/SourceCodePro-Regular.ttf");

        //Noi dung bai hoc 1
        //Tao khong gian
        LinearLayout noidungbai1 = (LinearLayout) findViewById(R.id.noidungbai);
        LinearLayout.LayoutParams tuabai = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tuabai.setMargins(0, 0, 0, 8);
        LinearLayout.LayoutParams noidung = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        noidung.setMargins(8, 0, 8, 8);

        //Them thu noi dung chu
        CardView khungbai1 = (CardView) View.inflate(this, R.layout.khung_chua_bai, null);
        TextView noidung1 = (TextView) khungbai1.findViewById(R.id.noidung);
        TextView tieude1 = (TextView) khungbai1.findViewById(R.id.tieude);
        tieude1.setText(R.string.datdiem);
        noidung1.setText(R.string.bai1_gioithieu);
        //Add noi dung vao khung
        noidungbai1.addView(khungbai1, tuabai);



        //Noi dung phan code
        //Them thu noi dung code
        CardView khungbai2 = (CardView) View.inflate(this, R.layout.khung_chua_bai, null);
        TextView noidung2 = (TextView) khungbai2.findViewById(R.id.noidung);
        TextView tieude2 = (TextView) khungbai2.findViewById(R.id.tieude);
        LinearLayout khungchuabai2 = (LinearLayout) khungbai2.findViewById(R.id.khungchuabai);

        TextView noidung2b = new TextView(this);
        noidung2b.setText(R.string.trongdoif);
        noidung2b.setTextSize(20);
        noidung2b.setLayoutParams(noidung);
        khungchuabai2.addView(noidung2b);

        tieude2.setText(R.string.ifthen);
        noidung2.setText(R.string.ifthenma);
        noidung2.setTypeface(codeFont);
        noidungbai1.addView(khungbai2, tuabai);




        //Noi dung phan giai thich
        CardView khungbai3 = (CardView) View.inflate(this, R.layout.khung_chua_bai, null);
        TextView tieude3 = (TextView) khungbai3.findViewById(R.id.tieude);
        //TextView noidung3 = (TextView) khungbai3.findViewById(R.id.noidung);
        //tieude3.setText(R.string.trongdo);



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
