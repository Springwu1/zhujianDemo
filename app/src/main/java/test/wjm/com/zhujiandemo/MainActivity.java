package test.wjm.com.zhujiandemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import wjm.yewumodule2.Module2Activity;
import wjm.yewumoudle1.Moude1MainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick1(View view){
        startActivity(new Intent(this, Moude1MainActivity.class));
    }

    public void onclick2(View view){
        startActivity(new Intent(this, Module2Activity.class));
    }
}
