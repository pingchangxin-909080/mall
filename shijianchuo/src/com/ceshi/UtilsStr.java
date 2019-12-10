package com.ceshi;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
/**
 * ClassName: UtilsStr
 * @Description: 字符串工具类
 * @author chens
 * @date 2019年10月13日
 */
public class UtilsStr {
	/**
	 * @Description: 获得系统所在服务器日期,返回格式为“yyyy-MM-dd”;
	 * @author chens;
	 * @date 2019年10月13日;
	 */
	public static String getDateYMD() {
		SimpleDateFormat sdatef = new SimpleDateFormat("yyyy-MM-dd");// 时间转换的中文后的格式
		return sdatef.format(new Date());
	}
	/**
	 * @Description: 获得系统所在服务器当前年;   
	 * @author chens;   
	 * @date 2019年10月13日;   
	 */
	public static String getDateY(){
		SimpleDateFormat   simpDF=new SimpleDateFormat("yyyy");
		return simpDF.format(new Date());
	}
	/**
	 * 
	 * @Description: 获得系统所在服务器当前月份;   
	 * @author chens;   
	 * @date 2019年10月13日;   
	 
	 */
	public static String getDateM(){
		SimpleDateFormat   simpDF=new SimpleDateFormat("MM");
		return simpDF.format(new Date());
	}
	/**
	 * 
	 * @Description: 获得系统所在服务器当前日;   
	 * @author chens;   
	 * @date 2019年10月13日;   
	 */
	public static String getDateD(){
		SimpleDateFormat   simpDF=new SimpleDateFormat("dd");
		return simpDF.format(new Date());
	}
	/**
	 * 
	 * @Description: 获得系统所在服务器当前时分秒  hh:mm:ss;   
	 * @author chens;   
	 * @date 2019年10月13日;   
	 */
	public static String getTimeHMS(){
		SimpleDateFormat   simpDF=new SimpleDateFormat("HH:mm:ss");
		return simpDF.format(new Date());
	}
	/**
	 * 
	 * @Description: 获得系统所在服务器当前小时 24时;   
	 * @author chens;   
	 * @date 2019年10月13日;   
	 */
	public static String getTimeH(){
		SimpleDateFormat   simpDF=new SimpleDateFormat("HH");
		return simpDF.format(new Date());
	}
	/**
	 * 
	 * @Description: 获得系统所在服务器当前分钟;   
	 * @author chens;   
	 * @date 2019年10月13日;   
	 */
	public static String getTimeM(){
		SimpleDateFormat   simpDF=new SimpleDateFormat("mm");
		return simpDF.format(new Date());
	}
	/**
	 * 
	 * @Description: 获得系统所在服务器当前秒;   
	 * @author chens;   
	 * @date 2019年10月13日;   
	 */
	public static String getTimeS(){
		SimpleDateFormat   simpDF=new SimpleDateFormat("ss");
		return simpDF.format(new Date());
	}
	/**
	 * @Description: 获得系统所在服务器日期时间,返回格式为“yyyy-MM-dd HH:mm:ss”;
	 * @author chens;
	 * @date 2019年10月13日;
	 */
	public static String getDateTime() {
		SimpleDateFormat sdatef = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 时间转换的中文后的格式
		return sdatef.format(new Date());
	}
	
	/**
	 * 
	 * @Description: 时间差;   
	 * @param @param qianTime  前一时间戳
	 * @param @param houTime   后一时间戳
	 * @return long  时间差，毫秒数
	 * @author chens;   
	 * @date 2019年10月13日;   
	 */
	public static long getTimeDifference(long qianTime,long houTime){
		return houTime-qianTime;
	}
	/**
	 * @Description: 判断是否是空的，当不为空的时，返回"true";   
	 * @param @param str  判断字符串
	 * @author chens;   
	 * @date 2019年10月13日;   
	 */
	public static boolean isNotEmpty(String str){
		boolean isNotEmpty=false;
		if(str!=null&&!"".equals(str)){
			isNotEmpty=true; 
		}
		return isNotEmpty;
	}
	/**
	 * @Description: 判断是否是空的，当为空的时返回"true";  ;   
	 * @author chens;   
	 * @date 2019年10月13日;   
	 */
	public static boolean isEmpty(String str){
		boolean isEmpty=false;
		if(str==null||"".equals(str)){
			isEmpty=true;
		}
		return isEmpty;
	}
	/**
	 * @Description: 判断是否是空的,去掉两头的空格，当为空的时返回"true";  ;   
	 * @author chens;   
	 * @date 2019年10月13日;   
	 */
	public static boolean isEmptyQuKongGe(String str){
		boolean isEmpty=false;
			if(str==null||"".equals(str.trim())){
				isEmpty=true;
			}
		return isEmpty;
	}
	/**
	 * 
	 * @Description: 集合中是否包含某个字符串，包含返回“true”,否则“false”;   
	 * @param @param element 字符串
	 * @param @param containers 集合
	 * @author chens;   
	 * @date 2019年10月13日;   
	 */
	public static boolean isContain(String element, List<String> containers) {
        if (containers!=null&&containers.size()>0&&containers.contains(element)) {
            return true;
        }
        return false;
    } 
	/**
	 * 
	 * @Description: 数组中是否包含某个字符串，包含返回“true”,否则“false”;   
	 * @param @param element 字符串
	 * @param @param containers 数组
	 * @author chens;   
	 * @date 2019年10月13日;   
	 */
	public static boolean isContainShuzu(String element, String [] containers) {
		//把数组转化为集合，然后通过contains函数判断
        if (containers!=null&&containers.length>0&&Arrays.asList(containers).contains(element)) {
            return true;
        }
        /*
         * 下面方式也可以把数组转为集合
         List<String> resultList = new ArrayList<>(array.length);
         Collections.addAll(resultList,shuZu); 
         jdk9,增加了如下的方法
         List<String> resultList = List.of(shuZu);
         */
        return false;
    }
	/**
	 * 
	 * @Description: 调用字符串方法时的一个判断;   
	 * @param @param object 传入字段
	 * @author chens;   
	 * @date 2019年10月14日;   
	 */
	public static String toString(Object object){
		return object!=null?object.toString():"";
	}
	/**
	 * 
	 * @Description: 类型转换，其他类型转化为字符串，如果需要转换的参数为“null”、""时，给出默认值;   
	 * @param @param obj  转换参数
	 * @param @param defaultValue 默认值
	 * @author chens;   
	 * @date 2019年10月23日;   
	 */
	public static String utilValueOfString(Object obj,String defaultValue){
		return obj!=null?String.valueOf(obj):defaultValue;
	}
	/**
	 * 
	 * @Description: 类型转换，其他类型转化为double，如果需要转换的参数为“null”、“”时，给出默认值; ;   
	 * @param @param obj
	 * @param @param defaultValue
	 * @author chens;   
	 * @date 2019年10月23日;   
	 */
	public static Double utilValueOfDouble(Object obj,Double defaultValue){
		String utilValueOfString = utilValueOfString(obj,"");
		if(!"".equals(utilValueOfString)){
			defaultValue=Double.parseDouble(utilValueOfString);
		}
		return defaultValue;
	}
	/**
	 * @Description: 类型转换，其他类型转化为long，如果需要转换的参数为“null”、“”时，给出默认值;   
	 * @param @param obj
	 * @param @param defaultValue
	 * @author chens;   
	 * @date 2019年10月23日;   
	 */
	public static Long utilValueOfLong(Object obj,Long defaultValue){
		String utilValueOfString = utilValueOfString(obj,"");
		if(!"".equals(utilValueOfString)){
			defaultValue=Long.parseLong(utilValueOfString);
		}
		return defaultValue;
	}
	/**
	 * @Description: 类型转换，其他类型转化为int，如果需要转换的参数为“null”、“”时，给出默认值;  
	 * @param @param obj
	 * @param @param defaultValue
	 * @author chens;   
	 * @date 2019年10月23日;   
	 */
	public static int utilValueOfInt(Object obj,int defaultValue){
		String utilValueOfString = utilValueOfString(obj,"");
		if(!"".equals(utilValueOfString)){
			defaultValue=Integer.parseInt(utilValueOfString);
		}
		return defaultValue;
	}
}
