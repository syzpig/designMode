package com.syz.designMode.adapter;
/**
 *@description 上传文件的service
 *@date 2020/6/24 10:43
 *@author syz
 */
public class CloudService {
    //AWSSDK awssdk; 这个不需要去指定具体的类

    //1以后我就具体关注这个，具体后面你们怎么变化，当前CloudService是不用关系的，你在你自己的规范中怎么操作，他不关心。那么这里职责区分清楚，那么我们再去实现CloudService
    CloudSDK cloudSDK;


    //2这里我们构造需要构造一个CloudService.但是这个需要一个CloudSDK的传递。但是这个传递也不应该由客户端来决定。我只需要告诉你cloudSDK的策略。我要去根据策略去创建。所以这里我们可以
    // 去构造一个工厂。
    public CloudService(String cloudStrategy) {  //public CloudService(CloudSDK cloudSDK)
        this.cloudSDK = CloudFactory.create(cloudStrategy);//这个要去解耦了我们调用端或者controller，我不需要去耦合你这个对象。我只需要高告诉你需要干什么。我只知道我要做什么事，
        // 所以CloudController他只知道他要上传文件而已，所以他上传他只关心调用cloudService.然后cloudService具体用哪一个sdk他不关心，他只需要告诉你他用哪一个sdk就行了。如果我们自Controller去创建一个SDK
        // 给cloudService的话，这样职能就划分不清晰了。
    }

    //创建完之后直接使用cloudSDK上传，这样后续有改变的话，我们就不需要有大 的改变了。
    public void  uploadFile(String name){
        cloudSDK.putObject(name);
    }
}
