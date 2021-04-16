package com.haruhi.lex.mndfake.b;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import com.lge.mdm.LGMDMManager;
import com.lge.mdm.config.LGMDMAppDetails;
import com.lge.mdm.config.LGMDMApplicationState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.haruhi.lex.mndfake.br.BroadcastReceiverGDA_LG;
import com.haruhi.lex.mndfake.mnt.h;
import com.haruhi.lex.mndfake.mnt.k;

public class e {
    private static final String a = "e";

    public static boolean a(Context context, boolean z) {
        String str;
        String str2;
        boolean z2 = false;
        try {
            if (context.getPackageName().equals("kr.go.mnd.mmsa")) {
                return true;
            }
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if (z) {
                if (instance.getAllowWifi(componentName)) {
                    str = a;
                    str2 = "Wifi is Enabled";
                } else {
                    instance.setAllowWifi(componentName, true);
                    str = a;
                    str2 = "Enable Wifi";
                }
            } else if (instance.getAllowWifi(componentName)) {
                instance.setAllowWifi(componentName, false);
                str = a;
                str2 = "Disable Wifi";
            } else {
                str = a;
                str2 = "Wifi is Disabled";
            }
            h.a(str, str2);
            z2 = true;
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public static boolean a(Context context, boolean z, String[] strArr) {
        new ArrayList();
        try {
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            List applicationState = instance.getApplicationState(componentName);
            if (applicationState.size() > 0) {
                Iterator it = applicationState.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((LGMDMApplicationState) it.next()).getPackageName().equals(strArr)) {
                            String str = a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("disableApplicationUninstall remove app:");
                            sb.append(strArr);
                            h.a(str, sb.toString());
                            it.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                for (String str2 : strArr) {
                    LGMDMApplicationState lGMDMApplicationState = new LGMDMApplicationState();
                    lGMDMApplicationState.setPackageName(str2);
                    lGMDMApplicationState.setAllowUninstallation(2);
                    applicationState.add(lGMDMApplicationState);
                    String str3 = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("disableApplicationUninstall Add app:");
                    sb2.append(strArr);
                    h.a(str3, sb2.toString());
                }
            } else {
                instance.setApplicationState(componentName, new ArrayList());
            }
            instance.setApplicationState(componentName, applicationState);
            return true;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean b(Context context, boolean z) {
        try {
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if (z) {
                instance.turnOnOffGPS(componentName, true);
            } else {
                instance.turnOnOffGPS(componentName, false);
            }
            return true;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean c(Context context, boolean z) {
        String str;
        String str2;
        try {
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if (z) {
                if (instance.getAllowCameraWithWhitelist(componentName)) {
                    str = a;
                    str2 = "Camera is Enabled";
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("com.markany.aegis");
                    instance.setAllowCameraWithWhitelist(componentName, true, arrayList);
                    str = a;
                    str2 = "Enable Camera";
                }
            } else if (instance.getAllowCameraWithWhitelist(componentName)) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("com.markany.aegis");
                instance.setAllowCameraWithWhitelist(componentName, false, arrayList2);
                str = a;
                str2 = "Disable Camera";
            } else {
                str = a;
                str2 = "Camera is Disabled";
            }
            h.a(str, str2);
            return true;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean d(Context context, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z2 = false;
        try {
            if (context.getPackageName().equals("kr.go.mnd.mmsa")) {
                return true;
            }
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if (z) {
                if (instance.getAllowUsb(componentName)) {
                    str = a;
                    str2 = "Usb is Enabled";
                } else {
                    instance.setAllowUsb(componentName, true);
                    str = a;
                    str2 = "Enable Usb";
                }
            } else if (instance.getAllowUsb(componentName)) {
                instance.setAllowUsb(componentName, false);
                str = a;
                str2 = "Disable Usb";
            } else {
                str = a;
                str2 = "Usb is Disabled";
            }
            h.a(str, str2);
            if (z) {
                if (instance.getAllowUSBMtp(componentName)) {
                    str3 = a;
                    str4 = "Usb is Enabled";
                } else {
                    instance.setAllowUSBMtp(componentName, true);
                    str3 = a;
                    str4 = "Enable Usb";
                }
            } else if (instance.getAllowUSBMtp(componentName)) {
                instance.setAllowUSBMtp(componentName, false);
                str3 = a;
                str4 = "Disable Usb";
            } else {
                str3 = a;
                str4 = "Usb is Disabled";
            }
            h.a(str3, str4);
            if (z) {
                if (instance.getAllowUSBHostStorage(componentName)) {
                    str5 = a;
                    str6 = "Usb is Enabled";
                } else {
                    instance.setAllowUSBHostStorage(componentName, true);
                    str5 = a;
                    str6 = "Enable Usb";
                }
            } else if (instance.getAllowUSBHostStorage(componentName)) {
                instance.setAllowUSBHostStorage(componentName, false);
                str5 = a;
                str6 = "Disable Usb";
            } else {
                str5 = a;
                str6 = "Usb is Disabled";
            }
            h.a(str5, str6);
            z2 = true;
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public static boolean e(Context context, boolean z) {
        String str;
        String str2;
        boolean z2 = false;
        try {
            if (context.getPackageName().equals("kr.go.mnd.mmsa")) {
                return true;
            }
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if (z) {
                if (instance.getAllowTethering(componentName)) {
                    str = a;
                    str2 = "Tethering is Enabled";
                } else {
                    instance.setAllowTethering(componentName, true);
                    str = a;
                    str2 = "Enable Tethering";
                }
            } else if (instance.getAllowTethering(componentName)) {
                instance.setAllowTethering(componentName, false);
                str = a;
                str2 = "Disable Tethering";
            } else {
                str = a;
                str2 = "Tethering is Disabled";
            }
            h.a(str, str2);
            z2 = true;
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public static boolean f(Context context, boolean z) {
        String str;
        String str2;
        boolean z2 = false;
        try {
            if (context.getPackageName().equals("kr.go.mnd.mmsa")) {
                return true;
            }
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if (z) {
                if (instance.getAllowMicrophone(componentName)) {
                    str = a;
                    str2 = "Microphone is Enabled";
                } else {
                    instance.setAllowMicrophone(componentName, true);
                    str = a;
                    str2 = "Enable Microphone";
                }
            } else if (instance.getAllowMicrophone(componentName)) {
                instance.setAllowMicrophone(componentName, false);
                str = a;
                str2 = "Disable Microphone";
            } else {
                str = a;
                str2 = "Microphone is Disabled";
            }
            h.a(str, str2);
            z2 = true;
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public static boolean g(Context context, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if (z) {
                if (instance.getAllowWipeData(componentName)) {
                    str = a;
                    str2 = "WipeData is Enabled";
                } else {
                    instance.setAllowWipeData(componentName, true);
                    str = a;
                    str2 = "Enable WipeData";
                }
            } else if (instance.getAllowWipeData(componentName)) {
                instance.setAllowWipeData(componentName, false);
                str = a;
                str2 = "Disable WipeData";
            } else {
                str = a;
                str2 = "WipeData is Disabled";
            }
            h.a(str, str2);
            if (z) {
                if (instance.getAllowHardwareFactoryreset(componentName)) {
                    str3 = a;
                    str4 = "HardwareFactoryreset is Enabled";
                } else {
                    instance.setAllowHardwareFactoryreset(componentName, true);
                    str3 = a;
                    str4 = "Enable HardwareFactoryreset";
                }
            } else if (instance.getAllowHardwareFactoryreset(componentName)) {
                instance.setAllowHardwareFactoryreset(componentName, false);
                str3 = a;
                str4 = "Disable HardwareFactoryreset";
            } else {
                str3 = a;
                str4 = "HardwareFactoryreset is Disabled";
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
        String str2;
        try {
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if (z) {
                if (instance.getAllowRemoveDeviceAdmin(componentName, context.getPackageName())) {
                    instance.setAllowRemoveDeviceAdmin(componentName, false);
                    str = a;
                    str2 = "Disable RemoveDeviceAdmin";
                } else {
                    str = a;
                    str2 = "RemoveDeviceAdmin is Disabled";
                }
            } else if (instance.getAllowRemoveDeviceAdmin(componentName, context.getPackageName())) {
                str = a;
                str2 = "RemoveDeviceAdmin is Enabled";
            } else {
                instance.setAllowRemoveDeviceAdmin(componentName, true);
                str = a;
                str2 = "Enable RemoveDeviceAdmin";
            }
            h.a(str, str2);
            return true;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean i(Context context, boolean z) {
        String str;
        String str2;
        boolean z2 = false;
        try {
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if ("2.3".compareTo(instance.getMDMVersion()) > 0) {
                return true;
            }
            if (z) {
                if (instance.getAllowMultiUser(componentName)) {
                    str = a;
                    str2 = "setAllowMultiUser is Enabled";
                } else {
                    instance.setAllowMultiUser(componentName, true);
                    str = a;
                    str2 = "Enable setAllowMultiUser";
                }
            } else if (instance.getAllowMultiUser(componentName)) {
                instance.setAllowMultiUser(componentName, false);
                str = a;
                str2 = "Disable setAllowMultiUser";
            } else {
                str = a;
                str2 = "setAllowMultiUser is Disabled";
            }
            h.a(str, str2);
            z2 = true;
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public static boolean j(Context context, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z2 = false;
        try {
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if ("3.2".compareTo(instance.getMDMVersion()) > 0) {
                return true;
            }
            if (z) {
                if (instance.getAllowChangeDateAndTime(componentName)) {
                    str = a;
                    str2 = "ChangeDateAndTime is Enabled";
                } else {
                    instance.setAllowChangeDateAndTime(componentName, true);
                    str = a;
                    str2 = "Enable ChangeDateAndTime";
                }
            } else if (instance.getAllowChangeDateAndTime(componentName)) {
                instance.setAllowChangeDateAndTime(componentName, false);
                str = a;
                str2 = "Disable ChangeDateAndTime";
            } else {
                str = a;
                str2 = "ChangeDateAndTime is Disabled";
            }
            h.a(str, str2);
            if (z) {
                if (instance.getAllowChangeTimezone(componentName)) {
                    str3 = a;
                    str4 = "ChangeTimezone is Enabled";
                } else {
                    instance.setAllowChangeTimezone(componentName, true);
                    str3 = a;
                    str4 = "Enable ChangeTimezone";
                }
            } else if (instance.getAllowChangeTimezone(componentName)) {
                instance.setAllowChangeTimezone(componentName, false);
                str3 = a;
                str4 = "Disable ChangeTimezone";
            } else {
                str3 = a;
                str4 = "ChangeTimezone is Disabled";
            }
            h.a(str3, str4);
            z2 = true;
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public static boolean k(Context context, boolean z) {
        String str;
        String str2;
        boolean z2 = false;
        try {
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if ("4.0".compareTo(instance.getMDMVersion()) > 0) {
                return true;
            }
            if (z) {
                if (instance.getAllowDeveloperMode(componentName)) {
                    str = a;
                    str2 = "enableDeveloperMode is Enabled";
                } else {
                    instance.setAllowDeveloperMode(componentName, true);
                    str = a;
                    str2 = "Enable enableDeveloperMode";
                }
            } else if (instance.getAllowDeveloperMode(componentName)) {
                instance.setAllowDeveloperMode(componentName, false);
                str = a;
                str2 = "Disable enableDeveloperMode";
            } else {
                str = a;
                str2 = "enableDeveloperMode is Disabled";
            }
            h.a(str, str2);
            z2 = true;
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public static boolean l(Context context, boolean z) {
        String str;
        String str2;
        boolean z2 = false;
        try {
            if (k.d(context)) {
                k.d(context, "디버깅 버전에서는 MockLocation 통제하지 않음!!!");
                return true;
            }
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if (z) {
                if (instance.getAllowMockLocation(componentName)) {
                    str = a;
                    str2 = "USBDebugging is Enabled";
                } else {
                    instance.setAllowMockLocation(componentName, true);
                    str = a;
                    str2 = "Enable USBDebugging";
                }
            } else if (instance.getAllowMockLocation(componentName)) {
                instance.setAllowMockLocation(componentName, false);
                str = a;
                str2 = "Disable USBDebugging";
            } else {
                str = a;
                str2 = "USBDebugging is Disabled";
            }
            h.a(str, str2);
            z2 = true;
            return z2;
        } catch (NullPointerException e) {
            h.a(a, (Exception) e);
        } catch (Exception e2) {
            h.a(a, e2);
        }
    }

    public static boolean m(Context context, boolean z) {
        String str;
        String str2;
        boolean z2 = false;
        try {
            if (k.d(context)) {
                k.d(context, "디버깅 버전에서는 usb 통제하지 않음!!!");
                return true;
            }
            ComponentName componentName = new ComponentName(context, BroadcastReceiverGDA_LG.class);
            LGMDMManager instance = LGMDMManager.getInstance();
            if (z) {
                if (instance.getAllowUSBDebugging(componentName)) {
                    str = a;
                    str2 = "USBDebugging is Enabled";
                } else {
                    instance.setAllowUSBDebugging(componentName, true);
                    str = a;
                    str2 = "Enable USBDebugging";
                }
            } else if (instance.getAllowUSBDebugging(componentName)) {
                instance.setAllowUSBDebugging(componentName, false);
                str = a;
                str2 = "Disable USBDebugging";
            } else {
                str = a;
                str2 = "USBDebugging is Disabled";
            }
            h.a(str, str2);
            z2 = true;
            return z2;
        } catch (NullPointerException e) {
            h.a(a, (Exception) e);
        } catch (Exception e2) {
            h.a(a, e2);
        }
    }

    public static boolean n(Context context, boolean z) {
        String str;
        String str2;
        boolean z2 = false;
        try {
            if ("5.2".compareTo(LGMDMManager.getInstance().getMDMVersion()) > 0) {
                return true;
            }
            LGMDMAppDetails lGMDMAppDetails = new LGMDMAppDetails();
            if (z) {
                if (lGMDMAppDetails.canClearData()) {
                    str = a;
                    str2 = "canClearData is Enabled";
                } else {
                    lGMDMAppDetails.setClearData(true);
                    str = a;
                    str2 = "Enable ChangeDateAndTime";
                }
            } else if (lGMDMAppDetails.canClearData()) {
                lGMDMAppDetails.setClearData(false);
                str = a;
                str2 = "canClearData is disabled";
            } else {
                str = a;
                str2 = "Enable ChangeDateAndTime";
            }
            h.a(str, str2);
            z2 = true;
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public static boolean o(Context context, boolean z) {
        try {
            boolean z2 = !k(context, true);
            if (m(context, !z)) {
                z2 = false;
            }
            if (l(context, !z)) {
                z2 = false;
            }
            if (i(context, !z)) {
                z2 = false;
            }
            if (n(context, !z)) {
                z2 = false;
            }
            if (j(context, !z)) {
                z2 = false;
            }
            if (g(context, !z)) {
                z2 = false;
            }
            if (a(context, z, new String[]{context.getPackageName()})) {
                z2 = false;
            }
            if (h(context, z)) {
                return false;
            }
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public int a(Context context) {
        int i;
        try {
            if (VERSION.SDK_INT >= 29) {
                return -1;
            }
            i = LGMDMManager.getInstance().checkRootDetection(new ComponentName(context, BroadcastReceiverGDA_LG.class));
            return i;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            i = 0;
        }
    }
}
