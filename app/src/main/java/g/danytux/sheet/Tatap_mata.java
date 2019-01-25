package g.danytux.sheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Tatap_mata extends AppCompatActivity {


    WebView webview;
    String url = "file:///android_asset/index5.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_tatap_mata);


        webview = (WebView)findViewById(R.id.webView1);

        webview.loadUrl(url);



    }

}