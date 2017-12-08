/**
 * 
 */
/**
 * @author edatkins2
 *
 */
package Emcapsulation;

public class Building {
	
	private String units;
	private String floors;
	private String windows;
	private int topheight; 
	
	public String getUnits() {
		return units;
	}
	public String getFloors() {
		return floors;
	}
	public String getWindows() {
		return windows;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public void setFloors(String floors) {
		this.floors = floors;
	}
	public void setWindows(String windows) {
		this.windows = windows;
	}
	public void setTopHeight(int topheight) {
		if(topheight < 400) {
			this.topheight = topheight; }
		}
		public int getTopHeight() {
			return topheight;
		}
	}
