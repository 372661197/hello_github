package cn.farsight._04_装饰者模式;


public class ProxyKongFu extends People {
	People kongFu ;
	
	public ProxyKongFu(People chenglong) {
		this.kongFu = chenglong;
	}
	
	public void bit() {
		System.out.println("增加功能");
		kongFu.bit();
		System.out.println("增加功能");
	}
}
