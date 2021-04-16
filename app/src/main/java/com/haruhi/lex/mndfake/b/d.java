package com.haruhi.lex.mndfake.b;

import android.content.Context;
import com.samsung.android.knox.AppIdentity;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.application.ApplicationPolicy;
import com.samsung.android.knox.datetime.DateTimePolicy;
import com.samsung.android.knox.license.KnoxEnterpriseLicenseManager;
import com.samsung.android.knox.multiuser.MultiUserManager;
import com.samsung.android.knox.restriction.RestrictionPolicy;
import java.util.ArrayList;
import com.haruhi.lex.mndfake.mnt.h;
import com.haruhi.lex.mndfake.mnt.k;

public class d {
    private static final String a = "d";

    public static double a(Context context) {
        try {
            EnterpriseDeviceManager.getInstance(context);
            return (double) EnterpriseDeviceManager.getAPILevel();
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return -1.0d;
        }
    }

    public static void a(Context context, String str, String str2) {
        try {
            KnoxEnterpriseLicenseManager.getInstance(context.getApplicationContext()).activateLicense(str, str2);
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public static boolean a(Context context, boolean z) {
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        boolean z3 = false;
        try {
            if (context.getPackageName().equals("kr.go.mnd.mmsa")) {
                return true;
            }
            RestrictionPolicy restrictionPolicy = EnterpriseDeviceManager.getInstance(context).getRestrictionPolicy();
            if (z) {
                if (restrictionPolicy.isWiFiEnabled(false)) {
                    str3 = a;
                    str4 = "WIFI is Enabled";
                } else {
                    z2 = restrictionPolicy.allowWiFi(true);
                    str = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Enable WIFI: ");
                    sb.append(z2);
                    str2 = sb.toString();
                    h.a(str, str2);
                    z3 = z2;
                    return z3;
                }
            } else if (restrictionPolicy.isWiFiEnabled(false)) {
                z2 = restrictionPolicy.allowWiFi(false);
                str = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Disable WIFI: ");
                sb2.append(z2);
                str2 = sb2.toString();
                h.a(str, str2);
                z3 = z2;
                return z3;
            } else {
                str3 = a;
                str4 = "WIFI is Disabled";
            }
            h.a(str3, str4);
            z3 = true;
            return z3;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public static boolean a(Context context, boolean z, String str) {
        String str2;
        String sb;
        try {
            ApplicationPolicy applicationPolicy = EnterpriseDeviceManager.getInstance(context).getApplicationPolicy();
            if (z) {
                if (applicationPolicy.getApplicationUninstallationEnabled(str)) {
                    applicationPolicy.setApplicationUninstallationDisabled(str);
                    str2 = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("- disable uninstall: ");
                    sb2.append(str);
                    sb = sb2.toString();
                }
                return true;
            }
            applicationPolicy.setApplicationUninstallationEnabled(str);
            str2 = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("- enable uninstall: ");
            sb3.append(str);
            sb = sb3.toString();
            h.a(str2, sb);
            return true;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean a(Context context, boolean z, String[] strArr) {
        try {
            ArrayList arrayList = new ArrayList();
            for (String add : strArr) {
                arrayList.add(add);
            }
            ApplicationPolicy applicationPolicy = EnterpriseDeviceManager.getInstance(context).getApplicationPolicy();
            return z ? applicationPolicy.addPackagesToClearDataBlackList(arrayList) : applicationPolicy.removePackagesFromClearDataBlackList(arrayList);
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean b(Context context, boolean z) {
        try {
            return EnterpriseDeviceManager.getInstance(context).getLocationPolicy().startGPS(z);
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return true;
        }
    }

    public static boolean b(Context context, boolean z, String str) {
        boolean z2 = false;
        try {
            ApplicationPolicy applicationPolicy = EnterpriseDeviceManager.getInstance(context).getApplicationPolicy();
            double a2 = a(context);
            boolean z3 = true;
            if (a2 < 5.7d) {
                return true;
            }
            if (!z) {
                for (String appIdentity : applicationPolicy.getPackagesFromBatteryOptimizationWhiteList()) {
                    if (applicationPolicy.removePackageFromBatteryOptimizationWhiteList(new AppIdentity(appIdentity, null)) != 0) {
                        z3 = false;
                    }
                }
            } else if (applicationPolicy.addPackageToBatteryOptimizationWhiteList(new AppIdentity(str, null)) != 0) {
                z3 = false;
            }
            z2 = z3;
            return z2;
        } catch (Exception e) {
            h.a(a, e);
        }
    }

    public static boolean b(Context context, boolean z, String[] strArr) {
        try {
            ArrayList arrayList = new ArrayList();
            for (String add : strArr) {
                arrayList.add(add);
            }
            ApplicationPolicy applicationPolicy = EnterpriseDeviceManager.getInstance(context).getApplicationPolicy();
            return z ? applicationPolicy.addPackagesToClearCacheBlackList(arrayList) : applicationPolicy.removePackagesFromClearCacheBlackList(arrayList);
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean c(Context context, boolean z) {
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        try {
            RestrictionPolicy restrictionPolicy = EnterpriseDeviceManager.getInstance(context).getRestrictionPolicy();
            if (z) {
                if (restrictionPolicy.isCameraEnabled(false)) {
                    str3 = a;
                    str4 = "Camera is Enabled";
                } else {
                    z2 = restrictionPolicy.setCameraState(true);
                    str = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Enable Camera: ");
                    sb.append(z2);
                    str2 = sb.toString();
                    h.a(str, str2);
                    return z2;
                }
            } else if (restrictionPolicy.isCameraEnabled(false)) {
                z2 = restrictionPolicy.setCameraState(false);
                str = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Disable Camera: ");
                sb2.append(z2);
                str2 = sb2.toString();
                h.a(str, str2);
                return z2;
            } else {
                str3 = a;
                str4 = "Camera is Disabled";
            }
            h.a(str3, str4);
            return true;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078 A[SYNTHETIC, Splitter:B:21:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009e A[Catch:{ Exception | NullPointerException -> 0x00c7 }] */
    public static boolean d(Context context, boolean z) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String sb;
        if (k.d(context)) {
            h.c(a, "디버깅 버전에서는 usb 통제하지 않음!!!");
            return true;
        }
        RestrictionPolicy restrictionPolicy = EnterpriseDeviceManager.getInstance(context).getRestrictionPolicy();
        boolean z4 = false;
        if (z) {
            try {
                if (restrictionPolicy.isUsbMediaPlayerAvailable(false)) {
                    str5 = a;
                    str6 = "MTP is Enabled";
                } else {
                    z2 = restrictionPolicy.setUsbMediaPlayerAvailability(true);
                    str7 = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Enable MTP: ");
                    sb2.append(z2);
                    sb = sb2.toString();
                    h.a(str7, sb);
                    if (z) {
                        try {
                            if (restrictionPolicy.isUsbHostStorageAllowed()) {
                                str3 = a;
                                str4 = "USB Host Storage is Enabled";
                            } else {
                                z3 = restrictionPolicy.allowUsbHostStorage(true);
                                str2 = a;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Enable USB Host Storage: ");
                                sb3.append(z3);
                                str = sb3.toString();
                                h.a(str2, str);
                                z4 = z3;
                                return z4;
                            }
                        } catch (Exception | NullPointerException e) {
                            h.a(a, e);
                            k.d(context, "USB Host Storage service error !!!");
                        }
                    } else if (restrictionPolicy.isUsbHostStorageAllowed()) {
                        z3 = restrictionPolicy.allowUsbHostStorage(false);
                        str2 = a;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Disable USB Host Storage: ");
                        sb4.append(z3);
                        str = sb4.toString();
                        h.a(str2, str);
                        z4 = z3;
                        return z4;
                    } else {
                        str3 = a;
                        str4 = "USB Host Storage is Disabled";
                    }
                    h.a(str3, str4);
                    z4 = z2;
                    return z4;
                }
            } catch (Exception | NullPointerException e2) {
                h.a(a, e2);
                k.d(context, "MTP service error !!!");
                z2 = false;
            }
        } else if (restrictionPolicy.isUsbMediaPlayerAvailable(false)) {
            z2 = restrictionPolicy.setUsbMediaPlayerAvailability(false);
            str7 = a;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Disable MTP: ");
            sb5.append(z2);
            sb = sb5.toString();
            h.a(str7, sb);
            if (z) {
            }
            h.a(str3, str4);
            z4 = z2;
            return z4;
        } else {
            str5 = a;
            str6 = "MTP is Disabled";
        }
        h.a(str5, str6);
        z2 = true;
        if (z) {
        }
        h.a(str3, str4);
        z4 = z2;
        return z4;
    }

    public static boolean e(Context context, boolean z) {
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z3;
        String str9;
        String sb;
        String str10;
        String sb2;
        try {
            RestrictionPolicy restrictionPolicy = EnterpriseDeviceManager.getInstance(context).getRestrictionPolicy();
            boolean z4 = true;
            if (z) {
                if (restrictionPolicy.isTetheringEnabled()) {
                    h.a(a, "Tethering is Enabled");
                    z3 = true;
                } else {
                    z3 = restrictionPolicy.setTethering(true);
                    String str11 = a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Enable Tethering: ");
                    sb3.append(z3);
                    h.a(str11, sb3.toString());
                }
                if (restrictionPolicy.isBluetoothTetheringEnabled()) {
                    str9 = a;
                    sb = "Tethering is Enabled";
                } else {
                    z3 = restrictionPolicy.setBluetoothTethering(true);
                    str9 = a;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Enable Tethering: ");
                    sb4.append(z3);
                    sb = sb4.toString();
                }
                h.a(str9, sb);
                if (restrictionPolicy.isUsbTetheringEnabled()) {
                    str10 = a;
                    sb2 = "Tethering USB is Enabled";
                } else {
                    z3 = restrictionPolicy.setUsbTethering(true);
                    str10 = a;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Enable Tethering USB: ");
                    sb5.append(z3);
                    sb2 = sb5.toString();
                }
                h.a(str10, sb2);
                if (restrictionPolicy.isWifiTetheringEnabled()) {
                    h.a(a, "Tethering WIFI is Enabled");
                    return z3;
                }
                z2 = restrictionPolicy.setWifiTethering(true);
                str = a;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Enable Tethering WIFI: ");
                sb6.append(z2);
                str2 = sb6.toString();
            } else {
                if (restrictionPolicy.isTetheringEnabled()) {
                    z4 = restrictionPolicy.setTethering(false);
                    str3 = a;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("Disable Tethering: ");
                    sb7.append(z4);
                    str4 = sb7.toString();
                } else {
                    str3 = a;
                    str4 = "Tethering is Disabled";
                }
                h.a(str3, str4);
                if (restrictionPolicy.isBluetoothTetheringEnabled()) {
                    z4 = restrictionPolicy.setBluetoothTethering(false);
                    str5 = a;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("Disable Tethering Bluetooth: ");
                    sb8.append(z4);
                    str6 = sb8.toString();
                } else {
                    str5 = a;
                    str6 = "Tethering Bluetooth is Disabled";
                }
                h.a(str5, str6);
                if (restrictionPolicy.isUsbTetheringEnabled()) {
                    z4 = restrictionPolicy.setUsbTethering(false);
                    str7 = a;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("Disable Tethering USB: ");
                    sb9.append(z4);
                    str8 = sb9.toString();
                } else {
                    str7 = a;
                    str8 = "Tethering USB is Disabled";
                }
                h.a(str7, str8);
                if (restrictionPolicy.isWifiTetheringEnabled()) {
                    z2 = restrictionPolicy.setWifiTethering(false);
                    str = a;
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("Disable Tethering wifi: ");
                    sb10.append(z2);
                    str2 = sb10.toString();
                } else {
                    h.a(a, "Tethering wifi is Disabled");
                    return z4;
                }
            }
            h.a(str, str2);
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean f(Context context, boolean z) {
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        try {
            RestrictionPolicy restrictionPolicy = EnterpriseDeviceManager.getInstance(context).getRestrictionPolicy();
            if (z) {
                if (restrictionPolicy.isMicrophoneEnabled(false)) {
                    str3 = a;
                    str4 = "MIC is Enabled";
                } else {
                    z2 = restrictionPolicy.setMicrophoneState(true);
                    str = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Enable MIC: ");
                    sb.append(z2);
                    str2 = sb.toString();
                    h.a(str, str2);
                    return z2;
                }
            } else if (restrictionPolicy.isMicrophoneEnabled(false)) {
                z2 = restrictionPolicy.setMicrophoneState(false);
                str = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Disable MIC: ");
                sb2.append(z2);
                str2 = sb2.toString();
                h.a(str, str2);
                return z2;
            } else {
                str3 = a;
                str4 = "MIC is Disabled";
            }
            h.a(str3, str4);
            return true;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean g(Context context, boolean z) {
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        try {
            RestrictionPolicy restrictionPolicy = EnterpriseDeviceManager.getInstance(context).getRestrictionPolicy();
            if (z) {
                if (restrictionPolicy.isFactoryResetAllowed()) {
                    z2 = restrictionPolicy.allowFactoryReset(false);
                    str = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Disable FactoryReset: ");
                    sb.append(z2);
                    str2 = sb.toString();
                    h.a(str, str2);
                    return z2;
                }
                str3 = a;
                str4 = "FactoryReset is Disabled";
            } else if (restrictionPolicy.isFactoryResetAllowed()) {
                str3 = a;
                str4 = "FactoryReset is Enabled";
            } else {
                z2 = restrictionPolicy.allowFactoryReset(true);
                str = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Enable FactoryReset: ");
                sb2.append(z2);
                str2 = sb2.toString();
                h.a(str, str2);
                return z2;
            }
            h.a(str3, str4);
            return true;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean h(Context context, boolean z) {
        String str;
        String sb;
        boolean z2 = true;
        try {
            if (a(context) < 4.0d) {
                return true;
            }
            MultiUserManager multiUserManager = EnterpriseDeviceManager.getInstance(context).getMultiUserManager();
            if (z) {
                if (multiUserManager.multipleUsersAllowed()) {
                    z2 = multiUserManager.allowMultipleUsers(false);
                    str = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Disable MultipleUsers: ");
                    sb2.append(z2);
                    sb = sb2.toString();
                } else {
                    str = a;
                    sb = "MultipleUsers is Disabled";
                }
            } else if (multiUserManager.multipleUsersAllowed()) {
                str = a;
                sb = "MultipleUsers is Enabled";
            } else {
                z2 = multiUserManager.allowMultipleUsers(true);
                str = a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Enable MultipleUsers: ");
                sb3.append(z2);
                sb = sb3.toString();
            }
            h.a(str, sb);
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public static boolean i(Context context, boolean z) {
        String str;
        String sb;
        boolean z2 = true;
        if (k.d(context)) {
            k.d(context, "디버깅 버전에서는 usb 통제하지 않음!!!");
            return true;
        }
        RestrictionPolicy restrictionPolicy = EnterpriseDeviceManager.getInstance(context).getRestrictionPolicy();
        if (z) {
            try {
                if (restrictionPolicy.isDeveloperModeAllowed()) {
                    z2 = restrictionPolicy.allowDeveloperMode(false);
                    str = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Disable DeveloperModeAllowed: ");
                    sb2.append(z2);
                    sb = sb2.toString();
                } else {
                    str = a;
                    sb = "DeveloperModeAllowed is Disabled";
                }
            } catch (Exception | NullPointerException e) {
                h.a(a, e);
            }
        } else if (restrictionPolicy.isDeveloperModeAllowed()) {
            str = a;
            sb = "DeveloperModeAllowed is Enabled";
        } else {
            z2 = restrictionPolicy.allowDeveloperMode(true);
            str = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Enable DeveloperModeAllowed: ");
            sb3.append(z2);
            sb = sb3.toString();
        }
        h.a(str, sb);
        return z2;
    }

    public static boolean j(Context context, boolean z) {
        String str;
        String sb;
        boolean z2 = true;
        if (k.d(context)) {
            k.d(context, "디버깅 버전에서는 MockLocation 통제하지 않음!!!");
            return true;
        }
        RestrictionPolicy restrictionPolicy = EnterpriseDeviceManager.getInstance(context).getRestrictionPolicy();
        if (z) {
            try {
                if (restrictionPolicy.isMockLocationEnabled()) {
                    z2 = restrictionPolicy.setMockLocation(false);
                    str = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Disable MockLocation: ");
                    sb2.append(z2);
                    sb = sb2.toString();
                } else {
                    str = a;
                    sb = "MockLocation is Disabled";
                }
            } catch (Exception | NullPointerException e) {
                h.a(a, e);
            }
        } else if (restrictionPolicy.isMockLocationEnabled()) {
            str = a;
            sb = "MockLocation is Enabled";
        } else {
            z2 = restrictionPolicy.setMockLocation(true);
            str = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Enable MockLocation: ");
            sb3.append(z2);
            sb = sb3.toString();
        }
        h.a(str, sb);
        return z2;
    }

    public static boolean k(Context context, boolean z) {
        String str;
        String sb;
        boolean z2 = true;
        if (k.d(context)) {
            k.d(context, "디버깅 버전에서는 usb 통제하지 않음!!!");
            return true;
        }
        RestrictionPolicy restrictionPolicy = EnterpriseDeviceManager.getInstance(context).getRestrictionPolicy();
        if (z) {
            try {
                if (restrictionPolicy.isUsbDebuggingEnabled()) {
                    z2 = restrictionPolicy.setUsbDebuggingEnabled(false);
                    str = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Disable USB Debugging: ");
                    sb2.append(z2);
                    sb = sb2.toString();
                } else {
                    str = a;
                    sb = "USB Debugging is Disabled";
                }
            } catch (Exception | NullPointerException e) {
                h.a(a, e);
            }
        } else if (restrictionPolicy.isUsbDebuggingEnabled()) {
            str = a;
            sb = "USB Debugging is Enabled";
        } else {
            z2 = restrictionPolicy.setUsbDebuggingEnabled(true);
            str = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Enable USB Debugging: ");
            sb3.append(z2);
            sb = sb3.toString();
        }
        h.a(str, sb);
        return z2;
    }

    public static boolean l(Context context, boolean z) {
        String str;
        boolean z2;
        String str2;
        try {
            EnterpriseDeviceManager instance = EnterpriseDeviceManager.getInstance(context);
            if (z) {
                z2 = instance.setAdminRemovable(false, context.getPackageName());
                str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Set Device Admin: ");
                sb.append(z2);
                str2 = sb.toString();
            } else {
                z2 = instance.setAdminRemovable(true, context.getPackageName());
                str = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unset Device Admin: ");
                sb2.append(z2);
                str2 = sb2.toString();
            }
            h.a(str, str2);
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean m(Context context, boolean z) {
        try {
            DateTimePolicy dateTimePolicy = EnterpriseDeviceManager.getInstance(context).getDateTimePolicy();
            if (z) {
                h.a(a, "AutoDate is disabled");
                dateTimePolicy.setAutomaticTime(true);
                dateTimePolicy.setDateTimeChangeEnabled(false);
            } else {
                h.a(a, "AutoDate is Enabled");
                dateTimePolicy.setDateTimeChangeEnabled(true);
            }
            return true;
        } catch (SecurityException e) {
            h.a(a, (Exception) e);
            return false;
        }
    }

    public static boolean n(Context context, boolean z) {
        if (!b(context, z, context.getPackageName()) || !i(context, false) || !j(context, z) || !k(context, z) || !l(context, z) || !a(context, z, context.getPackageName()) || !h(context, z) || !m(context, z) || !g(context, z)) {
            return false;
        }
        String[] strArr = {context.getPackageName()};
        return a(context, z, strArr) && b(context, z, strArr);
    }
}
