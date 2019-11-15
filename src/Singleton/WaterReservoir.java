package Singleton;

public class WaterReservoir {
	
	public static WaterReservoir waterReservoir=new WaterReservoir();
	private static double totalwater=50,minlavel=10;
	private WaterReservoir() {
		
	}
	public static double getTotalwater() {
		return totalwater;
	}
	public static void setTotalwater(double totalwater) {
		WaterReservoir.totalwater = totalwater;
	}
	public static double getMinlavel() {
		return minlavel;
	}
	public static void setMinlavel(double minlavel) {
		WaterReservoir.minlavel = minlavel;
	}
	public static WaterReservoir getInstance() {
		
		return waterReservoir;
	}
	
	
}
