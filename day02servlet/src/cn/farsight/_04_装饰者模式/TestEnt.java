package cn.farsight._04_装饰者模式;

public class TestEnt {
	public static void main(String[] args) {
		/*
		 * KongFu1 kf = new KongFu1(); kf.bit(); kf.bit1();
		 * 
		 * KongFu2 kF2 = new KongFu2(); kF2.bit(); kF2.bit1(); kF2.bit2();
		 */
		/**
		 * 	装饰者模式：
		 * 	代理模式：
		 * 1.使用多态统一数据类型
		 * 2.代理对象更改构造方法，传入的对象类型统一为People
		 * 3.使用钩子方法，父类调用子类的方法
		 */
		/*
		 * People chenglong = new KongFu(); People newChenglong = new
		 * ProxyKongFu(chenglong);
		 * 
		 * newChenglong.bit();
		 */
		
		People chenglong = new KongFu();
		
		People newChenglong = new ProxyKongFu(chenglong);
		
		
		
		
		
		
	}
}
