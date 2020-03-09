package HomeWork9;

import fmi.informatics.functional.IGravity;

	public class Rock2 implements IGravity {

		public void drop(double height) {
			double heightMeters = Math.abs(height);
			double timeToHitGround = Math.sqrt(2 * heightMeters / acceleration()); 
			System.out.format("It took %f seconds for the rock to hit the ground", timeToHitGround);
		}

		@Override
		public double sqrt(double d) {
			// TODO Auto-generated method stub
			return 0;
		}
}


