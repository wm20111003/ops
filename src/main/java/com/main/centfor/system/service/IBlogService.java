package com.main.centfor.system.service;

import java.io.File;
import java.util.List;

import com.main.centfor.frame.util.Finder;
import com.main.centfor.frame.util.Page;
import com.main.centfor.system.entity.Blog;
/**
 * TODO 在此加入类描述
 * @copyright {@link 9iu.org}
 * @author bbz<Auto generate>
 * @version  2013-09-07 09:37:01
 * @see com.main.centfor.bbz.service.Blog
 */
public interface IBlogService extends IBaseSuperCMSService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Blog findBlogById(Object id) throws Exception;
	
	
	
}
