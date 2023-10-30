package CS111_23;

public class FloorPlanTest {

	public static void main(String[] args) {
			FloorPlan floor = new FloorPlan(5, 6, 0, 0);
			floor.reportBotPosition();
			GridShow.show(floor.getPlan());
			floor.moveTo(3, 4);
			floor.moveTo(5, 4); 
			floor.reportBotPosition();
			GridShow.show(floor.getPlan());
			}
}
