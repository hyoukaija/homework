package ex01;

public class GeneraltoC implements CustomerDemand{
	int price;
	String address;
	double acreage;
	GeneraltoC(int price,String address,double acreage){
		this .acreage = acreage;
		this .price = price;
		this .address = address;
	}
}
