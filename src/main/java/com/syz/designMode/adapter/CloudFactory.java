package com.syz.designMode.adapter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *@description 这里构建我们具体的sdk 这里构建的话没有必要写的太复杂，如果需要灵活性的话，可以放入配置文件中顶一个prorites.然后我们可以默认好一个sdk供用户使用
 * 然后用户还可以在配置文件自定义，然后在工厂类中去加载用户定义好的配置 所以这里我们简单点，我们定义一个静态成员变量map
 *@date 2020/6/24 12:06
 *@author syz
 */
public class CloudFactory {

    static Map<String,CloudSDK> map=new ConcurrentHashMap<>();
    //然后在静态块中构建map
    static {
        map.put("aliSDK",new ALISDKAdapter(new ALiSDK()));
        map.put("awsSDK",new AWSAdapter(new AWSSDK()));
    }


    public static CloudSDK create(String cloudStrategy){
        return map.get(cloudStrategy);
    }
}
