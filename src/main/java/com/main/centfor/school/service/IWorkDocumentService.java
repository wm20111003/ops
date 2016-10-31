package com.main.centfor.school.service;

import com.main.centfor.school.entity.WorkDocument;
import com.main.centfor.system.service.IBaseSuperCMSService;;
/**
 * TODO 在此加入类描述
 * @copyright {@link 9iu.org}
 * @author centfor<Auto generate>
 * @version  2015-04-29 16:06:13
 * @see com.main.centfor.school.service.WorkDocument
 */
public interface IWorkDocumentService extends IBaseSuperCMSService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	WorkDocument findWorkDocumentById(Object id) throws Exception;
	
	
	
}
