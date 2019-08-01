package wjm.yewumodule2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import wjm.commonlibrary.Userbean;

@Route(path = "/ModuleB/Module2Activity")
public class Module2Activity extends AppCompatActivity {

    @Autowired(name = "key2")
    public String argment1;
    @Autowired(name = "key1")
    public long argment2;
    @Autowired(name = "key3")
    public Userbean mUserbean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymodule2_main);

        ARouter.getInstance().inject(this);
        Log.d("param", argment1 + "  " + argment2 + "   "+ mUserbean.toString());
    }
}
