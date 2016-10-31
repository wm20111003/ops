package com.main.centfor.school.directive.util;

import freemarker.template.TemplateModelException;

/**
 * 缺少必须参数异常
 */
@SuppressWarnings("serial")
public class ParamsRequiredException extends TemplateModelException {
	public ParamsRequiredException(String paramName) {
		super("The required \"" + paramName + "\" paramter is missing.");
	}
}
