package com.intel.realsense.librealsense;

public enum Extension {
    UNKNOWN(0),
    DEBUG(1),
    INFO(2),
    MOTION(3),
    OPTIONS(4),
    VIDEO(5),
    ROI(6),
    DEPTH_SENSOR(7),
    VIDEO_FRAME(8),
    MOTION_FRAME(9),
    COMPOSITE_FRAME(10),
    POINTS(11),
    DEPTH_FRAME(12),
    ADVANCED_MODE(13),
    RECORD(14),
    VIDEO_PROFILE(15),
    PLAYBACK(16),
    DEPTH_STEREO_SENSOR(17),
    DISPARITY_FRAME(18),
    MOTION_PROFILE(19),
    POSE_FRAME(20),
    POSE_PROFILE(21),
    TM2(22),
    SOFTWARE_DEVICE(23),
    SOFTWARE_SENSOR(24);

    private final int mValue;

    private Extension(int value) { mValue = value; }
    public int value() { return mValue; }
}
