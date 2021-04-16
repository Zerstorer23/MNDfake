package com.haruhi.lex.mndfake.b;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.app.enterprise.WifiAdminProfile;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.haruhi.lex.mndfake.R;
import com.haruhi.lex.mndfake.a.a;
import com.haruhi.lex.mndfake.br.BroadcastReceiverGDA_LG;
import com.haruhi.lex.mndfake.mnt.d;
import com.haruhi.lex.mndfake.mnt.h;
import com.haruhi.lex.mndfake.mnt.k;

public class b {
    private static final String a = "b";

    public static ComponentName a(Context context) {
        ComponentName componentName;
        try {
            if (a.a(context) != 1) {
                componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            } else if (d.c().equals(context.getResources().getString(R.string.manufacture_code_samsung))) {
                componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            } else if (!d.c().equals(context.getResources().getString(R.string.manufacture_code_lg))) {
                return null;
            } else {
                componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            }
            return componentName;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return null;
        }
    }

    public static boolean a(Context context, int i) {
        try {
            ComponentName a2 = a(context);
            Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
            intent.putExtra("android.app.extra.DEVICE_ADMIN", a2);
            intent.putExtra("android.app.extra.ADD_EXPLANATION", context.getString(a.a(context.getPackageName())));
            ((Activity) context).startActivityForResult(intent, i);
            return true;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean a(Context context, boolean z) {
        DevicePolicyManager c;
        ComponentName a2;
        boolean z2;
        boolean z3 = false;
        if (z) {
            try {
                if (VERSION.SDK_INT < 14) {
                    return false;
                }
                c = c(context);
                a2 = a(context);
                if (c != null && c.getCameraDisabled(a2)) {
                    z2 = !z;
                }
                z3 = true;
                return z3;
            } catch (Exception | NullPointerException e) {
                h.a(a, e);
            }
        } else if (VERSION.SDK_INT < 14) {
            return false;
        } else {
            c = c(context);
            a2 = a(context);
            if (c != null && !c.getCameraDisabled(a2)) {
                z2 = !z;
            }
            z3 = true;
            return z3;
        }
        c.setCameraDisabled(a2, z2);
        z3 = true;
        return z3;
    }

    public static boolean b(Context context) {
        try {
            return ((DevicePolicyManager) context.getSystemService("device_policy")).isAdminActive(a(context));
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return true;
        }
    }

    public static DevicePolicyManager c(Context context) {
        DevicePolicyManager devicePolicyManager = null;
        try {
            if (WifiAdminProfile.PHASE1_ALLOW_UNAUTHENTICATED.equals(d.a(context)) && !k.d(context)) {
                return null;
            }
            ComponentName a2 = a(context);
            DevicePolicyManager devicePolicyManager2 = (DevicePolicyManager) context.getSystemService("device_policy");
            try {
                if (!devicePolicyManager2.isAdminActive(a2)) {
                    devicePolicyManager2 = null;
                }
                devicePolicyManager = devicePolicyManager2;
            } catch (Exception | NullPointerException e) {
                Exception exc = e;
                devicePolicyManager = devicePolicyManager2;
                e = exc;
                h.a(a, e);
                return devicePolicyManager;
            }
            return devicePolicyManager;
        } catch (Exception | NullPointerException e2) {
            e = e2;
            h.a(a, e);
            return devicePolicyManager;
        }
    }

    public static void d(Context context) {
        DevicePolicyManager c = c(context);
        try {
            ComponentName a2 = a(context);
            if (c != null && a2 != null) {
                c.removeActiveAdmin(a2);
            }
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }
}
