package com.syz.designMode.adapter;

public class CloudController {
    CloudService cloudService;

    public CloudController(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    public void storeFiletoCloud() {
        cloudService.uploadFile("syz.zip");
    }

}
