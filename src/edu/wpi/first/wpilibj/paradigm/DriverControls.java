/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.paradigm;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author Programming
 */
public class DriverControls {

    private Joystick joystick = new Joystick(1); //Created and initialized the joystick controller
    private Joystick xBox = new Joystick(2); //Created and initialized the xbox controller
    final double DEADZONE_Y = 0.05;
    final double DEADZONE_X = 0.15;
    //boolean shiftUp;

//    public DriverControls() {
//        this.shiftUp = true;
//    }

    public double joystickX() {
        return deadzoneFilterX(this.joystick.getX()); //return the value of the x-axis of the joystick controller
    }

    public double joystickY() {
        return deadzoneFilterY(this.joystick.getY()); //return the value of the y-axis of the joystick controller
    }

    public double joystickZ() {
        return deadzoneFilterX(this.joystick.getZ()); //return the value of the z-axis of the joystick controller
    }

    /**
     * returns a value 0 if the joystick value is within the dead zone (if the
     * joystick is outside of the dead zone it returns the joystick value)
     *
     * @param joyStickValue
     * @return
     */
    private double deadzoneFilterY(double joyStickValue) {
        if (Math.abs(joyStickValue) <= DEADZONE_Y) {
            return 0;
        }
        return joyStickValue;

    }
        private double deadzoneFilterX(double joyStickValue) {
        if (Math.abs(joyStickValue) <= DEADZONE_X) {
            return 0;
        }
        return joyStickValue;

    }

    public boolean joystickTriggerPressed() {
        return this.joystick.getTrigger();  //return the value of the joystick trigger

    }

    public boolean joystickTriggerPressedAgain() {
        return this.joystick.getTrigger();  //return the value of the joystick trigger

    }

    public boolean shiftLow() {
        return this.joystick.getRawButton(3);
    }

    public boolean shiftHigh() {
        return this.joystick.getRawButton(4);
    }

   
}
