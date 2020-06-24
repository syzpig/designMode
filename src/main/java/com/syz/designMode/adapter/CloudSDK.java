package com.syz.designMode.adapter;
/**
 *@description 抽像出的上传文件的SDK
 *@date 2020/6/24 11:06
 *@author syz
 */
public interface CloudSDK {
    public void putObject(String fileName);//为什么是这个方法，是因为可以兼容以前的代码
}
