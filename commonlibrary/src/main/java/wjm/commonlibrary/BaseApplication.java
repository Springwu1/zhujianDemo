package wjm.commonlibrary;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;


/**
 * <pre>
 *     author : wujiangming
 *     e-mail : jiangmingwu@ecarx.com.cn
 *     time   : 2019-07-31
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class BaseApplication extends Application {

    private static BaseApplication instance = null;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initARouter();
    }

    public void initARouter(){
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

    public static BaseApplication getInstance(){
        return instance;
    }
}
