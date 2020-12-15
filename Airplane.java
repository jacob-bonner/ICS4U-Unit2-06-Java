/*
* This class creates an airplane.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-15
*/

public class Airplane {
  // Initializing fields
  private int speed;

  /**
   * Setting field values with a constructor.
   */
  public Airplane() {
    this.speed = 0;
  }

  /**
   * This method gets the speed of the airplane.
   */
  public int getSpeed() {
    return this.speed;
  }

  /**
   * This method sets the speed of the airplane.
   */
  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
