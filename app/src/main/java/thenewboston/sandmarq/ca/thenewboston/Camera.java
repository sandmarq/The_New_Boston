package thenewboston.sandmarq.ca.thenewboston;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by SANDRINE.MARQUIS on 2014-12-11.
 */
public class Camera extends Activity implements View.OnClickListener {

    ImageButton ib;
    Button b;
    ImageView iv;
    Intent i;
    final static int camaraData = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);
        initialize();

    }

    private void initialize() {
        iv = (ImageView) findViewById(R.id.ivReturnedPic);
        ib = (ImageButton) findViewById(R.id.ibTakePic);
        b = (Button) findViewById(R.id.bSetWallpaper);
        b.setOnClickListener(this);
        ib.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bSetWallpaper:

                break;
            case R.id.ibTakePic:
                i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i, camaraData);
                break;
        }

    }
}
