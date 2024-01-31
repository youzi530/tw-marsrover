package com.example.twmarsrover;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rover {
    @Getter
    @Setter
    //降落地点（x, y）
    class landingPlace {
        private String x;
        private String y;
    }

    @Getter
    @Setter
    // 朝向（N, S, E, W）信息
    class OrientationInfo {
        private String N;
        private String E;
        private String S;
        private String W;
    }
}
