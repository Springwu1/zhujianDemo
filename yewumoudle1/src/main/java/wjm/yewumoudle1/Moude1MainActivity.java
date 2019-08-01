package wjm.yewumoudle1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import wjm.commonlibrary.Userbean;

@Route(path = "/ModuleA/Moude1MainActivity")
public class Moude1MainActivity extends AppCompatActivity {
    TextView mSrcTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymodule1_main);
//        mSrcTv = findViewById(R.id.tv_src);
    }

    public void onclick(View view){
        // 1. Simple jump within application (Jump via URL in 'Advanced usage')
//        ARouter.getInstance().build("/ModuleB/Module2Activity").navigation();

        // 2. Jump with parameters
        ARouter.getInstance().build("/ModuleB/Module2Activity")
                .withLong("key1", 666L)
                .withString("key2", "888")

                .withObject("key3", new Userbean("Jack", 23))
                .navigation();
    }



}
