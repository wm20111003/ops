package com.main.centfor.system.service;

import java.io.File;
import java.util.List;

import com.main.centfor.frame.util.Finder;
import com.main.centfor.frame.util.Page;
import com.main.centfor.system.entity.Fwlog;
/**
 * TODO 在此加入类描述
 * @copyright {@link bbz}
 * @author 9iu.org<Auto generate>
 * @version  2013-07-29 11:36:44
 * @see com.main.centfor.bbz.service.Fwlog
 */
public interface IFwlogService extends IBaseSuperCMSService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Fwlog findFwlogById(Object id) throws Exception;
	
	
	
}
