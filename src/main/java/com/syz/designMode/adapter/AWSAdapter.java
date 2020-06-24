package com.syz.designMode.adapter;

public class AWSAdapter implements CloudSDK {

    private AWSSDK awssdk;

    public AWSAdapter(AWSSDK awssdk) {
        this.awssdk = awssdk;
    }

    @Override
    public void putObject(String fileName) {
        awssdk.putObject(fileName);
    }
}
