package com.main.centfor.school.service.impl;

import java.io.File;
import java.util.List;
import org.springframework.stereotype.Service;
import com.main.centfor.school.entity.WorkDocument;
import com.main.centfor.school.service.IWorkDocumentService;
import com.main.centfor.frame.entity.IBaseEntity;
import com.main.centfor.frame.util.Finder;
import com.main.centfor.frame.util.Page;
import com.main.centfor.system.service.BaseSuperCMSServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link 9iu.org}
 * @author centfor<Auto generate>
 * @version  2015-04-29 16:06:13
 * @see com.main.centfor.school.service.impl.WorkDocument
 */
@Service("workDocumentService")
public class WorkDocumentServiceImpl extends BaseSuperCMSServiceImpl implements IWorkDocumentService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      WorkDocument workDocument=(WorkDocument) entity;
	       return super.save(workDocument).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      WorkDocument workDocument=(WorkDocument) entity;
		 return super.saveorupdate(workDocument).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 WorkDocument workDocument=(WorkDocument) entity;
	return super.update(workDocument);
    }
    @Override
	public WorkDocument findWorkDocumentById(Object id) throws Exception{
	 return super.findById(id,WorkDocument.class);
	}
	
/**
 * 列表查询,每个service都会重载,要把sql语句封装到service中,Finder只是最后的方案
 * @param finder
 * @param page
 * @param clazz
 * @param o
 * @return
 * @throws Exception
 */
        @Override
    public <T> List<T> findListDataByFinder(Finder finder, Page page, Class<T> clazz,
			Object o) throws Exception{
			 return super.findListDataByFinder(finder,page,clazz,o);
			}
	/**
	 * 根据查询列表的宏,导出Excel
	 * @param finder 为空则只查询 clazz表
	 * @param ftlurl 类表的模版宏
	 * @param page 分页对象
	 * @param clazz 要查询的对象
	 * @param o  querybean
	 * @return
	 * @throws Exception
	 */
		@Override
	public <T> File findDataExportExcel(Finder finder,String ftlurl, Page page,
			Class<T> clazz, Object o)
			throws Exception {
			 return super.findDataExportExcel(finder,ftlurl,page,clazz,o);
		}

}
