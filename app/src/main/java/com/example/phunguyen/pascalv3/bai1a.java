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

public class bai1a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);

        //Khởi tạo và thiết lập Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Nút trên thanh
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Tiêu đề
        getSupportActionBar().setTitle(R.string.bai_1);



        //Nút trên thanh
        ImageView hinh_cover = (ImageView) findViewById(R.id.hinhCover);
        hinh_cover.setImageResource(R.drawable.bai1);

        //Nhập xuất Font
        Typeface codeFont = Typeface.createFromAsset(getAssets(), "fonts/SourceCodePro-Regular.ttf");

        //Nội dung bài học 1
        //Tạo không gian
        LinearLayout noiDungBai1 = (LinearLayout) findViewById(R.id.noidungbai);
        LinearLayout.LayoutParams tuaBai = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tuaBai.setMargins(0, 0, 0, 8);
        LinearLayout.LayoutParams noiDung = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        noiDung.setMargins(8, 0, 8, 8);

        //Them thu noi dung chu
        CardView khungBai1 = (CardView) View.inflate(this, R.layout.khung_chua_bai, null);
        TextView noiDung1 = (TextView) khungBai1.findViewById(R.id.noidung);
        TextView tieuDe1 = (TextView) khungBai1.findViewById(R.id.tieude);
        tieuDe1.setText(R.string.datdiem);
        noiDung1.setText(R.string.bai1_gioithieu);
        //Thêm nội dung vào khung
        noiDungBai1.addView(khungBai1, tuaBai);



        //Nội dung phần code
        //Thêm thử nội dung code
        CardView khungBai2 = (CardView) View.inflate(this, R.layout.khung_chua_bai, null);
        TextView noiDung2 = (TextView) khungBai2.findViewById(R.id.noidung);
        TextView tieuDe2 = (TextView) khungBai2.findViewById(R.id.tieude);
        LinearLayout khungChuaBai2 = (LinearLayout) khungBai2.findViewById(R.id.khungchuabai);

        TextView noiDung2B = new TextView(this);
        noiDung2B.setText(R.string.trongdoif);
        noiDung2B.setTextSize(20);
        noiDung2B.setLayoutParams(noiDung);
        khungChuaBai2.addView(noiDung2B);

        tieuDe2.setText(R.string.ifthen);
        noiDung2.setText(R.string.ifthenma);
        noiDung2.setTypeface(codeFont);
        noiDungBai1.addView(khungBai2, tuaBai);




        //Nội dung phần giải thích
        CardView khungBai3 = (CardView) View.inflate(this, R.layout.khung_chua_bai, null);
        khungBai3.findViewById(R.id.tieude);
        //TextView noiDung3 = (TextView) khungBai3.findViewById(R.id.noiDung);
        //tieuDe3.setText(R.string.trongDo);



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
        if (item.getItemId() == android.R.id.home) {// app icon in action bar clicked; go home
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
