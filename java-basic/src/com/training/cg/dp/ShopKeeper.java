package com.training.cg.dp;

public class ShopKeeper {
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop googlePixel;
	public ShopKeeper() {
		iphone =(MobileShop) new Iphone();
		samsung = (MobileShop) new Samsung();
		googlePixel = (MobileShop) new GooglePixel();
	
	}
	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}
	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}
	public void googlePixelSale() {
		googlePixel.modelNo();
		googlePixel.price();
	}

}
