package com.tang.framework.theme;

/**
 * Created by @author Alan on 2019-10-12.
 */
public final class ThemeUtils {

    private ThemeUtils() {
    }

    /**
     * 是否黑夜
     *
     * @return boolean
     */
    public static boolean isNight() {
//        return AppApplication.getSMineApplication().getMRuntimeData().getTheme() == Theme.NIGHT.getTheme();
        return false;
    }

    /**
     * 修改主题
     */
    public static void changeTheme() {
//        if (isNight()) {
//            MineApplication.getSMineApplication().getMRuntimeData().setTheme(Theme.DAY.getTheme());
//        } else {
//            MineApplication.getSMineApplication().getMRuntimeData().setTheme(Theme.NIGHT.getTheme());
//        }
    }

}
