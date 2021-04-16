package com.haruhi.lex.mndfake.b;

import android.content.Context;
import android.os.Build.VERSION;
import com.haruhi.lex.mndfake.R;
import com.haruhi.lex.mndfake.a.a;
import com.haruhi.lex.mndfake.mnt.c;
import com.haruhi.lex.mndfake.mnt.d;
import com.haruhi.lex.mndfake.mnt.h;
import com.haruhi.lex.mndfake.mnt.k;

public class f {
    private static final String a = "f";

    public static boolean a(Context context, boolean z) {
        boolean o;
        try {
            if (a.a(context) == 1) {
                if (d.c().equals(context.getResources().getString(R.string.manufacture_code_samsung))) {
                    o = VERSION.SDK_INT >= 29 ? d.n(context, z) : c.n(context, z);
                } else if (d.c().equals(context.getResources().getString(R.string.manufacture_code_lg))) {
                    o = e.o(context, z);
                }
                return o;
            }
            return true;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean a(Context context, boolean z, c cVar) {
        boolean d;
        boolean z2 = false;
        try {
            if (k.d(context)) {
                h.c(a, "디버깅 버전에서는 usb 통제하지 않음");
                return true;
            }
            if (a.a(context) == 1) {
                if (d.c().equals(context.getResources().getString(R.string.manufacture_code_samsung))) {
                    d = VERSION.SDK_INT >= 29 ? d.d(context, z) : c.d(context, z);
                } else if (d.c().equals(context.getResources().getString(R.string.manufacture_code_lg))) {
                    d = e.d(context, z);
                }
                z2 = d;
                return z2;
            }
            z2 = true;
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public static boolean b(Context context, boolean z) {
        boolean f;
        try {
            if (a.a(context) == 1) {
                if (d.c().equals(context.getResources().getString(R.string.manufacture_code_samsung))) {
                    f = VERSION.SDK_INT >= 29 ? d.f(context, z) : c.f(context, z);
                } else if (d.c().equals(context.getResources().getString(R.string.manufacture_code_lg))) {
                    f = e.f(context, z);
                }
                return f;
            }
            return true;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean b(Context context, boolean z, c cVar) {
        boolean z2;
        try {
            if (a.a(context) != 1) {
                z2 = a.a(context, z, cVar);
            } else if (d.c().equals(context.getResources().getString(R.string.manufacture_code_samsung))) {
                z2 = VERSION.SDK_INT >= 29 ? d.a(context, z) : c.a(context, z);
            } else if (!d.c().equals(context.getResources().getString(R.string.manufacture_code_lg))) {
                return true;
            } else {
                z2 = e.a(context, z);
            }
            return z2;
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
            return false;
        }
    }

    public static boolean c(Context context, boolean z, c cVar) {
        return true;
    }

    public static boolean d(Context context, boolean z, c cVar) {
        boolean e;
        try {
            if (a.a(context) == 1) {
                if (d.c().equals(context.getResources().getString(R.string.manufacture_code_samsung))) {
                    e = VERSION.SDK_INT >= 29 ? d.e(context, z) : c.e(context, z);
                } else if (d.c().equals(context.getResources().getString(R.string.manufacture_code_lg))) {
                    e = e.e(context, z);
                }
                return e;
            }
            return true;
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
            return false;
        }
    }
}
