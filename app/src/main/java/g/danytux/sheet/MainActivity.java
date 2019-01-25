package g.danytux.sheet;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonAddItem;
    Button btn2;
    Button kuis;
    Button nohoyali;
    Button noting;
//    private AdView mAdView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
////     Ads
//        mAdView = (AdView) findViewById(R.id.adVie);
//        AdRequest adRequest = new AdRequest.Builder()
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                .addTestDevice("ca-app-pub-2403117616094697/1710191826") // Check the LogCat to get your test device ID
//                .build();
//        mAdView.loadAd(adRequest);
//
//
//        //AdsListener
//        mAdView.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                Toast.makeText(getApplicationContext(), "Masuk pak eko!", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onAdClosed() {
//                Toast.makeText(getApplicationContext(), "Mantap pak eko!", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onAdFailedToLoad(int errorCode) {
//                Toast.makeText(getApplicationContext(), "Ad failed to load! error code: " + errorCode, Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onAdLeftApplication() {
//                Toast.makeText(getApplicationContext(), "Ad left application!", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onAdOpened() {
//                Toast.makeText(getApplicationContext(), "Ad is opened!", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        if (mAdView != null) {
//            mAdView.resume();
//        }
//    }
//
//    @Override
//    public void onPause() {
//        if (mAdView != null) {
//            mAdView.pause();
//        }
//        super.onPause();
//    }
//
//    @Override
//    public void onDestroy() {
//        if (mAdView != null) {
//            mAdView.destroy();
//        }
//        super.onDestroy();




   //        pengenalan r
        Button p = (Button)findViewById(R.id.btn_pengenalan1);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,pengenalan.class);
                startActivity(i);
            }
        });


    //video ruqyah
        Button vruqyah =(Button)findViewById(R.id.btn_vruqyah);
        vruqyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent (MainActivity.this,ruqyah_video.class);
                startActivity(i);
            }
        });



        //webview
        Button yt = (Button)findViewById(R.id.btn_youtube) ;
        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 =new Intent(MainActivity.this,youtube.class);
                startActivity(intent1);
            }
        });
    //webview
        Button webview = (Button)findViewById(R.id.btn_webview) ;
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 =new Intent(MainActivity.this,Webview.class);
                startActivity(intent1);
            }
        });
        //notingruqyah
//        noting = (Button)findViewById(R.id.btn_noting_ruqyah) ;
//        noting.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent1 =new Intent(MainActivity.this,noting_ruqyah.class);
//                startActivity(intent1);
//            }
//        });
//        //nohoyali
//        nohoyali = (Button)findViewById(R.id.btn_nohoyali) ;
//        nohoyali.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent1 =new Intent(MainActivity.this,not_hoyali.class);
//                startActivity(intent1);
//            }
//        });
//        btnkuis
        kuis = (Button)findViewById(R.id.btn_adabruqyah) ;
        kuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 =new Intent(MainActivity.this,BtnhoyaliActivity.class);
                startActivity(intent1);
            }
        });
        //Btn2 belajar

        btn2 = (Button)findViewById(R.id.btn_teknikruqyah);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,BelajarActivity.class);
                startActivity(i);
            }
        });
        buttonAddItem = (Button)findViewById(R.id.btn_add_item);
        buttonAddItem.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if(v==buttonAddItem){

            Intent intent = new Intent(getApplicationContext(),AddItem.class);
            startActivity(intent);
        }

    }
}
