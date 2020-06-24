package com.syz.designMode.adapter;

public class CloudController {
    CloudService cloudService;

    public void storeFiletoCloud() {
        cloudService.uploadFile("syz.zip");
    }

}
