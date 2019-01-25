package g.danytux.sheet;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

public class ruqyah_video extends AppCompatActivity {
    VideoView videoView;
    ListView listView;
    ArrayList <String> videoku;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruqyah_video);
        videoView =(VideoView)findViewById(R.id.video_view);
        listView =(ListView)findViewById(R.id.list_view);
        videoku = new ArrayList<>();
        videoku.add("Sholawat mahdi");
        videoku.add("Penjelasan Ruqyah");
        videoku.add("Do'a Sebelum ruqyah");
        videoku.add("Teknik Ruqyah mandiri");
        videoku.add("Mars JRA");

        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,videoku);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
                switch (position){
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.sholawat5));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.video2));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.video1));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.rmandiri4));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.mars3));
                        break;
                        default:
                        break;
                }
                videoView.setMediaController(new MediaController(ruqyah_video.this));
                videoView.requestFocus();
                videoView.start();

            }
        });
    }
}
