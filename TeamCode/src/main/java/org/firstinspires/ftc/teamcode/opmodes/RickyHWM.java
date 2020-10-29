package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class RickyHWM {
    public RickyHWM;
    {

    }
    public DcMotor leftmotor=null;
    public DcMotor rightmotor=null;
    public Servo  middle=null;
    public HardwareMap HWMricardo=null;

    public void init();
    {
        leftmotor=HWMricardo.get(DcMotor.class,"Mleft");
        rightmotor=HWMricardo.get(DcMotor.class,"Mright");
        middle=HWMricardo.get(Servo.class,"servo");
        leftmotor.setPower(0);
        rightmotor.setPower(0);
        middle.setPosition(0);
        leftmotor.setDirection(DcMotorSimple.Direction.FORWARD);
        rightmotor.setDirection(DcMotorSimple.Direction.REVERSE);
        leftmotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightmotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
    public void Stop()
    {
        leftmotor.setPower(0);
        rightmotor.setPower(0);
    }
    

}
