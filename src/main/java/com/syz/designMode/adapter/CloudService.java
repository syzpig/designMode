package com.syz.designMode.adapter;
/**
 *@description 上传文件的service
 *@date 2020/6/24 10:43
 *@author syz
 */
public class CloudService {
    AWSSDK awssdk;
    public void  uploadFile(String name){
        awssdk.putObject(name);
    }
}
