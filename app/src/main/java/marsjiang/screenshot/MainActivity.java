package marsjiang.screenshot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.btn_save);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //ScreenCut.shoot(MainActivity.this);
                ScreenShot screenShot = new ScreenShot(MainActivity.this);
                screenShot.shoot(MainActivity.this);
            }
        });
    }

}
