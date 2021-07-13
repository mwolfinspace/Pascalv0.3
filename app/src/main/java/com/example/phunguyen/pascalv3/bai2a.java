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

public class bai2a extends AppCompatActivity {

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
        getSupportActionBar().setTitle(R.string.bai_2);



        //Thay hình nền trên đầu 2
        ImageView hinhCover = (ImageView) findViewById(R.id.hinhCover);
        hinhCover.setImageResource(R.drawable.bai1);

        //Nhập xuất font
        Typeface codeFont = Typeface.createFromAsset(getAssets(), "fonts/SourceCodePro-Regular.ttf");

        //Nội dung bài học 2
        //Tạo không gian
        LinearLayout noiDungBai2 = (LinearLayout) findViewById(R.id.noidungbai);
        LinearLayout.LayoutParams tuaBai = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tuaBai.setMargins(0, 0, 0, 8);
        //Them thu noi dung chu
        CardView khungBai2 = (CardView) View.inflate(this, R.layout.khung_chua_bai, null);
        TextView noiDung2 = (TextView) khungBai2.findViewById(R.id.noidung);
        noiDung2.setText(R.string.large_text);
        //Thêm nội dung vào khung
        noiDungBai2.addView(khungBai2, tuaBai);



        //Nội dung phần code
        //Thêm thử nội dung code
        CardView khungBai2A = (CardView) View.inflate(this, R.layout.khung_chua_bai, null);
        TextView noiDung2A = (TextView) khungBai2A.findViewById(R.id.noidung);
        noiDung2A.setText(R.string.testcode);
        noiDung2A.setTypeface(codeFont);
        noiDungBai2.addView(khungBai2A, tuaBai);

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
