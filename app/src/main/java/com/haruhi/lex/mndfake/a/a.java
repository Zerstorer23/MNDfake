package com.haruhi.lex.mndfake.a;

import android.content.Context;
import android.content.res.Resources;
import com.haruhi.lex.mndfake.R;
import com.haruhi.lex.mndfake.mnt.MntData;
import com.haruhi.lex.mndfake.mnt.c;
import com.haruhi.lex.mndfake.mnt.d;
import com.haruhi.lex.mndfake.mnt.k;

public class a {
    public static final Integer[] a = {Integer.valueOf(R.drawable.img_common_guide_new), Integer.valueOf(R.drawable.img_common_guide_new), Integer.valueOf(R.drawable.img_common_guide_new)};
    public static final Integer[] b = {Integer.valueOf(R.drawable.img_common_guide_new), Integer.valueOf(R.drawable.img_common_guide_1), Integer.valueOf(R.drawable.img_common_guide_2)};
    public static final Integer[] c = {Integer.valueOf(R.drawable.img_accessibility_permssion_allow_description_1), Integer.valueOf(R.drawable.img_accessibility_permssion_allow_description_2), Integer.valueOf(R.drawable.img_accessibility_permssion_allow_description_3), Integer.valueOf(R.drawable.img_accessibility_permssion_allow_description_4)};
    public static final Integer[] d = {Integer.valueOf(R.drawable.img_accessibility_permssion_allow_description_a_1), Integer.valueOf(R.drawable.img_accessibility_permssion_allow_description_a_2), Integer.valueOf(R.drawable.img_accessibility_permssion_allow_description_a_3), Integer.valueOf(R.drawable.img_accessibility_permssion_allow_description_a_4)};
    public static final Integer[] e = {Integer.valueOf(R.drawable.img_accessibility_permssion_allow_description_of_1), Integer.valueOf(R.drawable.img_accessibility_permssion_allow_description_of_2), Integer.valueOf(R.drawable.img_accessibility_permssion_allow_description_of_3), Integer.valueOf(R.drawable.img_accessibility_permssion_allow_description_of_4)};
    public static final int[] f = {R.string.drawer_menu_app, R.string.drawer_menu_user_guide, R.string.drawer_menu_log, R.string.mndmdm_common_list_item_alert_sound, R.string.mndmdm_common_list_item_alert_vibration, R.string.drawer_menu_system, R.string.drawer_menu_device_manufacture, R.string.drawer_menu_device_model, R.string.drawer_menu_device_os_version};
    public static final int[] g = {R.string.drawer_menu_app, R.string.drawer_menu_user_guide, R.string.drawer_menu_log, R.string.mndmdm_common_list_item_alert_sound, R.string.mndmdm_common_list_item_alert_vibration, R.string.drawer_menu_gps_checkout, R.string.drawer_menu_system, R.string.drawer_menu_device_manufacture, R.string.drawer_menu_device_model, R.string.drawer_menu_device_os_version};
    public static final int[] h = {R.string.drawer_menu_app, R.string.drawer_menu_admin, R.string.drawer_menu_user_guide, R.string.drawer_menu_log, R.string.mndmdm_common_list_item_alert_sound, R.string.mndmdm_common_list_item_alert_vibration, R.string.drawer_menu_gps_checkout, R.string.drawer_menu_system, R.string.drawer_menu_device_manufacture, R.string.drawer_menu_device_model, R.string.drawer_menu_device_os_version};
    public static final int[] i = {R.string.drawer_menu_app, R.string.drawer_menu_admin, R.string.drawer_menu_user_guide, R.string.drawer_menu_log, R.string.mndmdm_common_list_item_alert_sound, R.string.mndmdm_common_list_item_alert_vibration, R.string.drawer_menu_system, R.string.drawer_menu_device_manufacture, R.string.drawer_menu_device_model, R.string.drawer_menu_device_os_version};
    public static final int[] j = {R.string.drawer_menu_app, R.string.drawer_menu_user_guide, R.string.drawer_menu_log, R.string.mndmdm_common_list_item_alert_sound, R.string.mndmdm_common_list_item_alert_vibration, R.string.drawer_menu_gps_checkout, R.string.drawer_menu_system, R.string.drawer_menu_device_manufacture, R.string.drawer_menu_device_model, R.string.drawer_menu_device_os_version};
    public static final int[] k = {R.string.drawer_menu_app, R.string.drawer_menu_user_guide, R.string.drawer_menu_log, R.string.mndmdm_common_list_item_alert_sound, R.string.mndmdm_common_list_item_alert_vibration, R.string.drawer_menu_system, R.string.drawer_menu_device_manufacture, R.string.drawer_menu_device_model, R.string.drawer_menu_device_os_version};
    public static final int[] l = {R.string.drawer_menu_bug_report, R.string.drawer_menu_preference};

    public static int a() {
        return R.drawable.img_common_msticker_noti_icon_store;
    }

    public static int a(Context context) {
        Resources resources = context.getResources();
        if (d.c().equals(resources.getString(R.string.manufacture_code_samsung))) {
            return 1;
        }
        return (!d.c().equals(resources.getString(R.string.manufacture_code_lg)) || "Nexus 4".equalsIgnoreCase(d.b()) || "Nexus 5".equalsIgnoreCase(d.b()) || "Nexus 5X".equalsIgnoreCase(d.b()) || "Pixel 3 XL".equalsIgnoreCase(d.b()) || "LM-Q910".equalsIgnoreCase(d.b()) || "LMQ910UM".equalsIgnoreCase(d.b()) || "LM-Q927L".equalsIgnoreCase(d.b())) ? 0 : 1;
    }

    public static int a(Context context, int i2) {
        return !k.b(context) ? "msGoLhcVq0dT7rv3dI+HDw==".equals(c.c(context)) ? f[i2] : MntData.b.contains(c.c(context)) ? "com.haruhi.lex.mndfake.vt".equals(context.getPackageName()) ? k[i2] : i[i2] : k[i2] : "msGoLhcVq0dT7rv3dI+HDw==".equals(c.c(context)) ? g[i2] : MntData.b.contains(c.c(context)) ? "com.haruhi.lex.mndfake.vt".equals(context.getPackageName()) ? j[i2] : h[i2] : j[i2];
    }

    public static int a(String str) {
        return "kr.go.mnd.mmsa".equals(str) ? R.string.common_device_admin_description_store : (!"com.haruhi.lex.mndfake.of".equals(str) && !"com.haruhi.lex.mndfake.vt".equals(str)) ? R.string.common_device_admin_description_store : R.string.common_device_admin_description_store_officer;
    }

    public static int b() {
        return R.drawable.img_common_msticker_noti_icon_store;
    }

    public static int b(String str) {
        return "com.haruhi.lex.mndfake.vt".equals(str) ? R.string.common___app_name_store_visitor : "com.haruhi.lex.mndfake.of".equals(str) ? R.string.common___app_name_store_officer : R.string.common___app_name_store;
    }

    public static Integer[] b(Context context) {
        return "kr.go.mnd.mmsa".equalsIgnoreCase(context.getPackageName()) ? d : "com.haruhi.lex.mndfake.of".equalsIgnoreCase(context.getPackageName()) ? e : c;
    }

    public static int c() {
        return 2;
    }

    public static int[] c(Context context) {
        return !k.b(context) ? "msGoLhcVq0dT7rv3dI+HDw==".equals(c.c(context)) ? f : MntData.b.contains(c.c(context)) ? "com.haruhi.lex.mndfake.vt".equals(context.getPackageName()) ? k : i : k : "msGoLhcVq0dT7rv3dI+HDw==".equals(c.c(context)) ? g : MntData.b.contains(c.c(context)) ? "com.haruhi.lex.mndfake.vt".equals(context.getPackageName()) ? j : h : j;
    }

    public static Integer[] c(String str) {
        return ("msGoLhcVq0dT7rv3dI+HDw==".equalsIgnoreCase(str) || "PPzpM+nXRtEukMUoJl/9jw==".equalsIgnoreCase(str)) ? a : b;
    }

    public static int d() {
        return R.string.common_accessibility_activity_description_markany;
    }

    public static int e() {
        return R.string.common_accessibility_allow_complete_commmon;
    }

    public static int f() {
        return R.string.common_accessibility_deny_message_commmon;
    }

    public static int g() {
        return 0;
    }

    public static int h() {
        return R.string.common_accessibility_description;
    }
}
