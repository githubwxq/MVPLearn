package learn.mvplearn.app;

import android.content.Intent;
import android.os.Bundle;

import com.example.wxq.wxqutilslibrary.application.BaseApplication;

/**
 * Created by Administrator on 2017/3/8 0008.
 */

public class MvpLearnApplication extends BaseApplication {

    @Override
    protected void initResourceAndother() {

    }

    @Override
    public void dealWithException(Throwable throwable) {
//        Intent intent2 = new Intent();
//        Bundle bundle = new Bundle();
//        System.out.println("CommonTools.outputError(ex)====="+CommonTools.outputError(ex));
//        bundle.putString("error", CommonTools.outputError(ex));
//        intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        intent2.putExtras(bundle);
//        intent2.setClass(this, LoginActivity.class);
//        startActivity(intent2);
    }
}
