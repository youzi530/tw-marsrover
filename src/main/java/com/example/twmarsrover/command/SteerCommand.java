package com.example.twmarsrover.command;

import com.example.twmarsrover.constant.SteerDirection;

public class SteerCommand implements Command{

    private SteerDirection steerDirection; //转向方向
    private String degree; //转向度数
}
