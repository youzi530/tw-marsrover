package com.example.twmarsrover.command;

import com.example.twmarsrover.constant.MoveDirection;

public class MoveCommand implements Command{

    private MoveDirection moveDirection; //移动方向
    private int moveStep;  //移动步数
}
