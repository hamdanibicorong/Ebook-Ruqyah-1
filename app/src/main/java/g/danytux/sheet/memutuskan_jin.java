package g.danytux.sheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class memutuskan_jin extends AppCompatActivity {


    WebView webview;
    String url = "file:///android_asset/index17.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_memutuskan_jin);


        webview = (WebView)findViewById(R.id.webView1);

        webview.loadUrl(url);



    }

}