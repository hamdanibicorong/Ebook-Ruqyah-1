package g.danytux.sheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class menutup_alamgaib extends AppCompatActivity {


    WebView webview;
    String url = "file:///android_asset/index18.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_menutup_alamgaib);


        webview = (WebView)findViewById(R.id.webView1);

        webview.loadUrl(url);



    }

}