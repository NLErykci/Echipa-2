package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class test {
    public DcMotor stanga=null;
    public DcMotor dreapta=null;
    public Servo mijloc=null;
    private HardwareMap map=null;
    public void init(){
        stanga=map.get(DcMotor.class,"st");
        dreapta=map.get(DcMotor.class,"dr");
        mijloc=map.get(Servo.class,"mj");
        stanga.setPower(0);
        dreapta.setPower(0);
        mijloc.setPosition(0.5);
        stanga.setDirection(DcMotorSimple.Direction.FORWARD);
        dreapta.setDirection(DcMotorSimple.Direction.REVERSE);

    }
}
