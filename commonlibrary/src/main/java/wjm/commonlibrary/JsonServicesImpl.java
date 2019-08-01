package wjm.commonlibrary;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * <pre>
 *     author : wujiangming
 *     e-mail : jiangmingwu@ecarx.com.cn
 *     time   : 2019-08-01
 *     desc   : 如果需要传递自定义对象，需要实现 SerializationService,并使用@Route注解标注(方便用户自行选择序列化方式)
 *     version: 1.0
 * </pre>
 */
@Route(path = "/service/json")
public class JsonServicesImpl implements SerializationService {

    private Gson mGson;

    @Override
    public <T> T json2Object(String input, Class<T> clazz) {
        checkJson();
        return mGson.fromJson(input, clazz);
    }

    @Override
    public String object2Json(Object instance) {
        checkJson();
        return mGson.toJson(instance);
    }

    @Override
    public <T> T parseObject(String input, Type clazz) {
        checkJson();
        return mGson.fromJson(input, clazz);
    }


    @Override
    public void init(Context context) {
        mGson = new Gson();
    }

    public void checkJson() {
        if (mGson == null) {
            mGson = new Gson();
        }
    }
}
