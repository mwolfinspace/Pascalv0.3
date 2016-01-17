package com.example.phunguyen.pascalv3;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Tạo bởi phunguyen lúc 1/14/16.
 */
public class bai1b extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Thanh toolbar
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle(R.string.bai_1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //Hien thi noi dung cau hoi

        //Tao khong gian
        LinearLayout tuaBai = (LinearLayout) findViewById(R.id.noi_dung_chinh);
        LinearLayout.LayoutParams tuabai = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tuabai.setMargins(0, 0, 0, 8);
        LinearLayout.LayoutParams dapan = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dapan.setMargins(8, 8, 8, 8);

        //Goi mau cau hoi trac nghiem
        LinearLayout khungcauhoi1 = (LinearLayout) View.inflate(this, R.layout.khung_cau_hoi, null);
        //Thay doi noi dung cau hoi
        final ImageView nhanxet = (ImageView) khungcauhoi1.findViewById(R.id.check);
        tuaBai.addView(khungcauhoi1,tuabai);
        //Tao dap an
        final int dab1[] = {0};
        final String[] dapanCau1 = {getString(R.string.testans1), getString(R.string.testans2), getString(R.string.testans3)};
        for (int i = 0; i < dapanCau1.length; i++) {
            final LinearLayout pa = new LinearLayout(this);
            TextView textView = new TextView(this);
            pa.setBackgroundColor(Color.parseColor("#dddddd"));
            textView.setText(dapanCau1[i]);
            textView.setTextSize(18);
            pa.setId(i);
            pa.addView(textView, dapan);
            khungcauhoi1.addView(pa);

            //Check dap an
            pa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (dab1[0] == pa.getId()) {
                        pa.setBackgroundColor(Color.parseColor("#00ff7f"));
                        nhanxet.setImageResource(R.mipmap.right);
                    } else {
                        pa.setBackgroundColor(Color.parseColor("#ff6666"));
                        nhanxet.setImageResource(R.mipmap.wrong);
                    }
                }
            });
        }



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
