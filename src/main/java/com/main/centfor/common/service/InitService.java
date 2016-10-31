package com.main.centfor.common.service;

import com.main.centfor.system.service.IBaseSuperCMSService;

public interface InitService extends IBaseSuperCMSService {

	boolean saveInit(String siteId, String userCode);

}
