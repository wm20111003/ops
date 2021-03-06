package com.main.centfor.school.directive;

import static freemarker.template.ObjectWrapper.DEFAULT_WRAPPER;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.main.centfor.cms.directive.abs.AbstractChannelDirective;
import com.main.centfor.cms.directive.util.DirectiveUtils;
import com.main.centfor.frame.util.Finder;
import com.main.centfor.frame.util.Page;
import com.main.centfor.frame.util.ReturnDatas;
import com.main.centfor.school.entity.WorkDocument;
import com.main.centfor.school.service.IWorkDocumentService;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 栏目明细页标签
 */
@Component("documentListDirective")
public class DocumentListDirective extends AbstractChannelDirective {
	@Resource
	IWorkDocumentService workDocumentService;

	/**
	 * 模板名称
	 */
	public static final String TPL_NAME = "sp_document_list";

	@SuppressWarnings("unchecked")
	public void execute(Environment env,
			@SuppressWarnings("rawtypes") Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {

		String siteId = DirectiveUtils.getString("siteId", params);
		Integer pageIndex = DirectiveUtils.getInt("pageIndex", params);
		Integer pageSize = DirectiveUtils.getInt("pageSize", params);

		List<WorkDocument> list = null;
		Page page = new Page();
		try {
			// 控制分页
			if (pageIndex != null && pageIndex != 0) {
				page.setPageIndex(pageIndex);
			}
			if (pageSize != null && pageSize != 0) {
				page.setPageSize(pageSize);
			}
			page.setOrder("createDate");
			page.setSort("desc");

			WorkDocument qb = new WorkDocument();
				qb.setBak(siteId);
			list = workDocumentService.findListDataByFinder(null, page, WorkDocument.class, qb);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setPage(page);
		returnObject.setData(list);
		Map<String, TemplateModel> paramWrap = new HashMap<String, TemplateModel>(
				params);
		paramWrap.put("document_list", DEFAULT_WRAPPER.wrap(returnObject));

		Map<String, TemplateModel> origMap = DirectiveUtils
				.addParamsToVariable(env, paramWrap);

		// 根据type 可以辨别类型 例如 手机 app 引入不同的css js 等
		// InvokeType type = DirectiveUtils.getInvokeType(params);

		body.render(env.getOut());

		DirectiveUtils.removeParamsFromVariable(env, paramWrap, origMap);

	}
}
