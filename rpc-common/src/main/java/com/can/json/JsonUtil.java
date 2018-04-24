package com.can.json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Description: JSON工具类
 *
 * @Author LCN
 * @Date 2018-04-12 上午 11:22
 */

public class JsonUtil {

    private static JsonUtil mJosnUtil  = null;
    private ObjectMapper    mapper     = null;

    public static JsonUtil getInstance() {

        if(mJosnUtil == null){
            synchronized (JsonUtil.class) {
                if(mJosnUtil == null){
                    mJosnUtil = new JsonUtil();
                    mJosnUtil.mapper = new ObjectMapper();
                }
            }
        }
        return mJosnUtil;
    }

    public String writeJson(Object entity){
        String str = "";
        try {
            str = mapper.disableDefaultTyping().writeValueAsString(entity);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public <T> T readJson(String jsonStr, Class<T> T){
        T obj = null;
        try {
            obj = mapper.readValue(jsonStr, T);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }

}
