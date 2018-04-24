package com.can.provider;

import com.can.request.DemoRequest;
import com.can.response.Response;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-24 下午 04:22
 */
public interface DemoProvider {

    Response<String> repeat(DemoRequest request);

}
