package cn.farsight._04_装饰者模式;
/**
 * 装饰者模式：
 *  ①增强方法的功能,
 * 	②不改变源码的情况下
 *代理模式
 *	①增强方法的功能,
 * 	②不改变源码的情况下
 *  ③对象类型必须一致
 * @author hp
 *
 */
public class KongFu extends People {
	
	
	public void bit() {
		System.out.println("长拳");
	}
	
}
