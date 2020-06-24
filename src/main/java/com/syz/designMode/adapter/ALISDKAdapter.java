package com.syz.designMode.adapter;
/**
 *@description ali sdk适配器 他要去做什么？毫无疑问 他要去实现CloudSDk，就是要去实现这标准嘛。有了这个标准之后
 *@date 2020/6/24 11:59
 *@author syz
 */
public class ALISDKAdapter implements CloudSDK{


    //有了这个标准之后 我们就要去构造AliSDK
    private ALiSDK aLiSDK;

    public ALISDKAdapter(ALiSDK aLiSDK) {
        this.aLiSDK = aLiSDK;
    }

    @Override
    public void putObject(String fileName) {
        aLiSDK.uploadFile(fileName);//然后这里我们就做到了适配。 这就我们就把ali上传文件的方法适配成了putObject方法。因为我们适配就要是配成标准的规范，而这个CloudSDK就是我们的规范
    }
}
