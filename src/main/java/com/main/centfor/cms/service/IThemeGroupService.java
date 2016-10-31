package com.main.centfor.cms.service;

import java.util.List;

import com.main.centfor.cms.entity.CmsReThemeGroup;
import com.main.centfor.cms.entity.CmsTheme;
import com.main.centfor.cms.entity.CmsThemeGroup;
import com.main.centfor.frame.util.Page;
import com.main.centfor.system.service.IBaseSuperCMSService;

/**
 * TODO 在此加入类描述
 * @copyright {@link 9iu.org}
 * @author bbz<Auto generate>
 * @version  2013-07-06 16:03:00
 * @see com.main.centfor.bbz.service.User
 */
public interface IThemeGroupService extends IBaseSuperCMSService {
      /**
       * 保存或修改主题组
       * @param en
       * @param re
       * @throws Exception
       */
      void saveOrUpdateThemeGroup(CmsThemeGroup en,List<CmsReThemeGroup> listre)throws Exception;
	 /**
	  * 删除主题组和主题的关联
	  * @param themeId
	  * @throws Exception
	  */
      void deleteThemeRe(String groupId)throws Exception;
      /**
       * 根据条件查询RE
       * @param qb
       * @return
       * @throws Exception
       */
      List<CmsReThemeGroup> findReTheme(CmsReThemeGroup qb,Page page)throws Exception;
      /**
       * 查询主题组中的主体
       * @param groupId
       * @return
       * @throws Exception
       */
      List<CmsTheme> findListThemeByGroup(String groupId,String modelType)throws Exception;
}
