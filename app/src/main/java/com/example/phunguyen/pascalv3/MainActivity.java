package com.example.phunguyen.pascalv3;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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


        //Tạo không gian
        LinearLayout tuaBai = (LinearLayout) findViewById(R.id.noi_dung_chinh);
        LinearLayout.LayoutParams tuaBai1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tuaBai1.setMargins(0, 0, 0, 8);
        LinearLayout.LayoutParams dapAn = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dapAn.setMargins(8, 8, 8, 8);

        //Nhập xuất font
        Typeface.createFromAsset(getAssets(), "fonts/SourceCodePro-Regular.ttf");

        CardView bai1 = (CardView) View.inflate(this, R.layout.bai_hoc, null);
        //Chỉnh sửa nội dung bài 1
        RelativeLayout nenBai1 = (RelativeLayout) bai1.findViewById(R.id.nen);
        TextView tenBai1 = (TextView) bai1.findViewById(R.id.tenbai);

        tenBai1.setText(R.string.bai_1);
        nenBai1.setBackgroundResource(R.drawable.bai1);
        //Nhấn nút bài 1
        Button baiHoc1 = (Button) bai1.findViewById(R.id.timhieu);
        Button baiTap1 = (Button) bai1.findViewById(R.id.vandung);
        //Chuyển sang bài học 1
        baiHoc1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, bai1a.class);
            //Gọi bài học
            startActivity(intent);

        });
        //Chuyển sang bài tập 1
        baiTap1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, bai1b.class);
            //Gọi bài tập
            startActivity(intent);

        });

        //Thêm view bài 1
        tuaBai.addView(bai1, tuaBai1);

        CardView bai2 = (CardView) View.inflate(this, R.layout.bai_hoc, null);
        //Chỉnh sửa nội dung bài 2
        RelativeLayout nenBai2 = (RelativeLayout) bai2.findViewById(R.id.nen);
        TextView tenBai2 = (TextView) bai2.findViewById(R.id.tenbai);

        tenBai2.setText(R.string.bai_2);
        nenBai2.setBackgroundResource(R.drawable.bai1);
        //Nhấn nút bài 2
        Button baiHoc2 = (Button) bai2.findViewById(R.id.timhieu);
        Button baiTap2 = (Button) bai2.findViewById(R.id.vandung);

        //Thêm view bài 2
        tuaBai.addView(bai2, tuaBai1);
        //Chuyển sang bài học 2
        baiHoc2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, bai2a.class);
            //Gọi bài học
            startActivity(intent);
            //assert getSupportActionBar() == null;

        });
        //Chuyển sang bài tập 2
        baiTap2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, bai2b.class);
            //Gọi bài tập
            startActivity(intent);

        });


        CardView bai3 = (CardView) View.inflate(this, R.layout.bai_hoc, null);
        //Chỉnh sửa nội dung bài 3
        RelativeLayout nenBai3 = (RelativeLayout) bai3.findViewById(R.id.nen);
        TextView tenBai3 = (TextView) bai3.findViewById(R.id.tenbai);

        tenBai3.setText(R.string.bai_3);
        nenBai3.setBackgroundResource(R.drawable.bai1);
        //Nhấn nút bài 3
        Button baiHoc3 = (Button) bai3.findViewById(R.id.timhieu);
        Button baiTap3 = (Button) bai3.findViewById(R.id.vandung);

        //Thêm view bài 3
        tuaBai.addView(bai3, tuaBai1);
        //Chuyển sang bài học 3
        baiHoc3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, bai3a.class);
            //Gọi bài học
            startActivity(intent);

        });
        //Chuyển sang bài tập 3
        baiTap3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, bai3b.class);
            //Gọi bài tập
            startActivity(intent);

        });

    }

    /**
     * Thoát ứng dụng
     */
    private void doExit() {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

        alertDialog.setPositiveButton("Đồng ý", (dialog, which) -> finish());

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
