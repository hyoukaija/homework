package ex01;

public class CondominiumtoC implements CustomerDemand{
	int rooms;
	boolean barrier_free;
	CondominiumtoC(int rooms,boolean barrier_free){
		this .rooms = rooms;
		this .barrier_free = barrier_free;
	}
}
