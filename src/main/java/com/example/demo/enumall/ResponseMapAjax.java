package com.example.demo.enumall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回图表类型的JSON
 * @author dell
 *
 */
public class ResponseMapAjax  extends HashMap<String, Object>{
	private static final long serialVersionUID = 1L;
	public ResponseMapAjax() {
	
	}
	public ResponseMapAjax(String title,Object xAxis,Object yAxis,Map<String,Object> series) {
		put("chartType",ChartType.spline);
		put("title",title);
		put("xAxis",xAxis);
		put("yAxis",yAxis);
		put("series",series);
	}
	
}
