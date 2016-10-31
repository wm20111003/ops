package com.main.centfor.school.service;

import com.main.centfor.school.entity.WorkExperiment;
import com.main.centfor.system.service.IBaseSuperCMSService;;
/**
 * TODO 在此加入类描述
 * @copyright {@link 9iu.org}
 * @author centfor<Auto generate>
 * @version  2015-05-04 20:42:51
 * @see com.main.centfor.school.service.WorkExperiment
 */
public interface IWorkExperimentService extends IBaseSuperCMSService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	WorkExperiment findWorkExperimentById(Object id) throws Exception;
	
	
	
}
