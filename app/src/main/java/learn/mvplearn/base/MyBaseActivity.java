package learn.mvplearn.base;

import android.os.Bundle;
import android.view.View;

import com.example.wxq.wxqutilslibrary.activity.BaseActivity;

import learn.mvplearn.R;

/**
 * Created by Administrator on 2017/3/8 0008.
 */

public class MyBaseActivity extends BaseActivity{




    @Override
    public void widgetClick(View view) {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
