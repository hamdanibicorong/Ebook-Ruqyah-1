package g.danytux.sheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BtnhoyaliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btnhoyali);

//        Button btn14 = (Button)findViewById(R.id.btn_isyaroh14);
//        btn14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(BtnhoyaliActivity.this,menutup_alamgaib.class);
//                startActivity(i);
//            }
//        });
//
//        Button btn13 = (Button)findViewById(R.id.btn_isyaroh13);
//        btn13.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(BtnhoyaliActivity.this,memutuskan_jin.class);
//                startActivity(i);
//            }
//        });
//        Button btn12 = (Button)findViewById(R.id.btn_isyaroh12);
//        btn12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(BtnhoyaliActivity.this,memberi_senjata.class);
//                startActivity(i);
//            }
//        });
//
//        Button btn11 = (Button)findViewById(R.id.btn_isyaroh11);
//        btn11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(BtnhoyaliActivity.this,pasukan_langit.class);
//                startActivity(i);
//            }
//        });
//
//        Button btn10 = (Button)findViewById(R.id.btn_isyaroh10);
//        btn10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(BtnhoyaliActivity.this,surga_neraka.class);
//                startActivity(i);
//            }
//        });
//
//
//        Button btn9 = (Button)findViewById(R.id.btn_isyaroh9);
//        btn9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(BtnhoyaliActivity.this,metode_foto.class);
//                startActivity(i);
//            }
//        });
//
//
//        Button btn8 = (Button)findViewById(R.id.btn_isyaroh8);
//        btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(BtnhoyaliActivity.this,netralisir_buhul.class);
//                startActivity(i);
//            }
//        });
//
//
//        Button btn7 = (Button)findViewById(R.id.btn_isyaroh7);
//        btn7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(BtnhoyaliActivity.this,media_tasbih.class);
//                startActivity(i);
//            }
//        });
//
//        Button btn6 = (Button)findViewById(R.id.btn_isyaroh6);
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(BtnhoyaliActivity.this,ruqyah_medialampu.class);
//                startActivity(i);
//            }
//        });
//
//        Button btn5 = (Button)findViewById(R.id.btn_isyaroh5);
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(BtnhoyaliActivity.this,pukulan_telunjuk.class);
//                startActivity(i);
//            }
//        });
//
//        Button btn4 = (Button)findViewById(R.id.btn_isyaroh4);
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(BtnhoyaliActivity.this,mengikat_jin.class);
//                startActivity(i);
//            }
//        });

//        Button btn3 = (Button)findViewById(R.id.btn_isyaroh3);
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(BtnhoyaliActivity.this,TeknikhoyaliActivity.class);
//                startActivity(i);
//            }
//        });
        Button btn2 = (Button)findViewById(R.id.btn_isyaroh2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(BtnhoyaliActivity.this,isyaroh_telunjuk.class);
                startActivity(i);
            }
        });
        Button btn1 = (Button)findViewById(R.id.btn_isyaroh1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(BtnhoyaliActivity.this,TeknikhoyaliActivity.class);
                startActivity(i);
            }
        });
    }
}
