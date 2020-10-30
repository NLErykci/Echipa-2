package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RteleOp extends OpMode {
    public RickyHWM Robot=new RickyHWM();
    @Override
    public void init() {
        Robot.HWMricardo=hardwareMap;
        Robot.init();
    }

    @Override
    public void loop() {
        double powerforward=gamepad1.right_trigger;
        double powerbackward=gamepad1.left_trigger;
        boolean powerleft=gamepad1.left_bumper;
        boolean powerright=gamepad1.right_bumper;
        if(powerforward==1) {
            Robot.rightmotor.setPower(1);
            Robot.leftmotor.setPower(1);
        }else {
            if (powerbackward==1) {
                Robot.rightmotor.setPower(-1);
                Robot.leftmotor.setPower(-1);
            } else {
                if (powerleft==true) {
                    Robot.leftmotor.setPower(-1);
                    Robot.rightmotor.setPower(1);
                } else {
                    if (powerright==true) {
                        Robot.rightmotor.setPower(-1);
                        Robot.rightmotor.setPower(1);
                    } else {
                        Robot.rightmotor.setPower(0);
                        Robot.leftmotor.setPower(0);
                    }
                }
                
            }
            
        }
        double powerservo=gamepad1.left_stick_x;
        if (powerservo==1) {
            Robot.middle.setPosition(1);
        } else {
            if (powerservo==-1) {
                Robot.middle.setPosition(0);
            }
        }
        
    }
}
