package g.danytux.sheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class not_hoyali extends AppCompatActivity {


    WebView webview;
    String url = "file:///android_asset/index6.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_not_hoyali);


        webview = (WebView)findViewById(R.id.webView1);

        webview.loadUrl(url);



    }

}