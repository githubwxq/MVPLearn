package learn.mvplearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.wxq.wxqutilslibrary.activity.BaseActivity;

import learn.mvplearn.base.MyBaseActivity;

public class MainActivity extends BaseActivity {
    TextView tv_goto;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitleHeadVisiable(false);
        tv_goto= (TextView) findViewById(R.id.tv_goto);
        tv_goto.setOnClickListener(this);
    }

    @Override
    public void widgetClick(View view) {

        switch (view.getId()) {
            case R.id.tv_goto:
                showToast("跳转");
                MainActivity.this.startActivity(new Intent(MainActivity.this, MyBaseActivity.class));
                break;
        }
    }
}
