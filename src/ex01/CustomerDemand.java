package ex01;

public interface CustomerDemand extends Realtor {
	CustomerDemand general = new GeneraltoC(1200,"abc",100);
	CustomerDemand singlehouse = new SingleHousetoC(100,4);
	CustomerDemand townhouse = new TownhousetoC(50);
	CustomerDemand condominium = new CondominiumtoC(3,true);
	CustomerDemand(HouseType house,){
		
	}
	
	
	
	
	
}
