package com.tang.framework.theme;

/**
 * Created by @author Alan on 2019-10-12.
 */
public enum Theme {

    /**
     * 白天
     */
    DAY(0),

    /**
     * 黑夜
     */
    NIGHT(1);

    private int theme;

    Theme(int theme) {
        this.theme = theme;
    }

    public int getTheme() {
        return theme;
    }
}
