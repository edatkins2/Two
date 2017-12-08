package Emcapsulation;

public class TestEmcapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Building building1 = new Building();
		building1.setUnits("10");
		building1.setFloors("5");
		building1.setWindows("50");
		building1.setTopHeight(100); 
		
		System.out.println("Building1 Details: " + 
		"\n" + building1.getUnits() + "\n" + building1.getFloors() +
		"\n" + building1.getWindows() + "\n" + building1.getTopHeight());
		
		Building building2 = new Building();
		building2.setUnits("30");
		building2.setFloors("15");
		building2.setWindows("150");
		building2.setTopHeight(300); 
		
		System.out.println("Building2 Details: " + 
		"\n" + building2.getUnits() + "\n" + building2.getFloors() +
		"\n" + building2.getWindows() + "\n" + building2.getTopHeight());
			
		Building building3 = new Building();
		building3.setUnits("30");
		building3.setFloors("15");
		building3.setWindows("150");
		building3.setTopHeight(300); 
				
		System.out.println("Building3 Details: " + 
		"\n" + building3.getUnits() + "\n" + building3.getFloors() +
		"\n" + building3.getWindows() + "\n" + building3.getTopHeight());
	
		Building building4 = new Building();
		building4.setUnits("50");
		building4.setFloors("25");
		building4.setWindows("250");
		building4.setTopHeight(500); 
				
		System.out.println("Building4 Details: " +
		"\n" + building4.getUnits() + "\n" + building4.getFloors() +
		"\n" + building4.getWindows() + "\n" + building4.getTopHeight());
	}

}
