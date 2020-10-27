package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class TeleOpMap {

    public DcMotor LeftFrontMotor = null;
    public DcMotor LeftBackMotor = null;
    public DcMotor RightFrontMotor = null;
    public DcMotor RightBackMotor = null;

    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();
    public TeleOpMap() {

    }
    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;

        LeftFrontMotor = hwMap.get(DcMotor.class, "LeftFrontMotor");
        LeftBackMotor = hwMap.get(DcMotor.class, "LeftBackMotor");
        RightFrontMotor = hwMap.get(DcMotor.class, "RightFrontMotor");
        RightBackMotor = hwMap.get(DcMotor.class, "RightBackMotor");

        LeftFrontMotor.setDirection(DcMotor.Direction.FORWARD);
        LeftBackMotor.setDirection(DcMotor.Direction.FORWARD);
        RightFrontMotor.setDirection(DcMotor.Direction.REVERSE);
        RightBackMotor.setDirection(DcMotor.Direction.REVERSE);

        LeftFrontMotor.setPower(0);
        LeftBackMotor.setPower(0);
        RightFrontMotor.setPower(0);
        RightBackMotor.setPower(0);

        LeftFrontMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        LeftBackMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        RightFrontMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        RightBackMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

    }


}
