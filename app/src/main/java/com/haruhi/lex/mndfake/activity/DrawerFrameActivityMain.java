package com.haruhi.lex.mndfake.activity;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.app.enterprise.WifiAdminProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.fragment.app.g.c;
import androidx.fragment.app.j;
import java.util.List;
import com.haruhi.lex.mndfake.R;
import com.haruhi.lex.mndfake.b.f;
import com.haruhi.lex.mndfake.mnt.MntData;
import com.haruhi.lex.mndfake.mnt.d;
import com.haruhi.lex.mndfake.mnt.h;
import com.haruhi.lex.mndfake.mnt.k;
import com.haruhi.lex.mndfake.service.ServiceAlert;
import com.haruhi.lex.mndfake.service.ServicePolicy;
import com.haruhi.lex.mndfake.service.ServicePolicyMFLG;
import com.haruhi.lex.mndfake.service.ServicePolicyMFSS;

public class DrawerFrameActivityMain extends e implements OnClickListener, OnLongClickListener {
    private static ImageButton A = null;
    private static ImageButton B = null;
    private static ImageButton C = null;
    /* access modifiers changed from: private */
    public static com.haruhi.lex.mndfake.constant.a.e D = null;
    /* access modifiers changed from: private */
    public static int[] E = null;
    /* access modifiers changed from: private */
    public static g F = null;
    /* access modifiers changed from: private */
    public static j G = null;
    private static b H = null;
    /* access modifiers changed from: private */
    public static c I = null;
    private static AlertDialog J = null;
    @SuppressLint({"HandlerLeak"})
    private static Handler K = new Handler() {
        public void handleMessage(Message message) {
            try {
                if (c.a.equals((String) message.obj)) {
                    DrawerFrameActivityMain.G = DrawerFrameActivityMain.F.a();
                    DrawerFrameActivityMain.I = c.a();
                    DrawerFrameActivityMain.G.a((int) R.anim.animation_left_in, (int) R.anim.animation_left_out);
                    DrawerFrameActivityMain.G.a(R.id.content_frame, DrawerFrameActivityMain.I, c.a);
                    DrawerFrameActivityMain.G.d();
                    DrawerFrameActivityMain.p.setTitle((int) R.string.common_mobilesticker_toolbar_title_visit_ready);
                    DrawerFrameActivityMain.I.a(false);
                }
            } catch (Exception | NullPointerException e) {
                h.a(DrawerFrameActivityMain.l, e);
            }
        }
    };
    /* access modifiers changed from: private */
    public static int M = 0;
    private static Handler N = new Handler() {
        public void handleMessage(Message message) {
            DrawerFrameActivityMain.M = 0;
        }
    };
    /* access modifiers changed from: private */
    public static boolean O = false;
    private static Handler P = new Handler() {
        public void handleMessage(Message message) {
            DrawerFrameActivityMain.O = false;
        }
    };
    /* access modifiers changed from: private */
    public static String l = "DrawerFrameActivityMain";
    /* access modifiers changed from: private */
    public static Context m;
    private static ProgressDialog o;
    /* access modifiers changed from: private */
    public static Toolbar p;
    /* access modifiers changed from: private */
    public static DrawerLayout q;
    private static b r;
    private static TextView s;
    private static TextView t;
    private static TextView u;
    private static ImageView v;
    /* access modifiers changed from: private */
    public static RelativeLayout w;
    private static ListView x;
    private static Button y;
    private static Button z;
    private c L = $$Lambda$DrawerFrameActivityMain$gUbjRCAIxZgghPpOz7rdAtWrars.INSTANCE;
    public BroadcastReceiver k = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if (action != null && "com.markany.aegis.vt.MSTICKER_REFRESH_VIEW".equals(action)) {
                    DrawerFrameActivityMain.this.y();
                    DrawerFrameActivityMain.E = com.haruhi.lex.mndfake.a.a.c(DrawerFrameActivityMain.m);
                    DrawerFrameActivityMain.D.a(DrawerFrameActivityMain.E);
                    DrawerFrameActivityMain.D.notifyDataSetChanged();
                }
            } catch (Exception | NullPointerException e) {
                h.a(DrawerFrameActivityMain.l, e);
            }
        }
    };
    /* access modifiers changed from: private */
    public com.haruhi.lex.mndfake.mnt.c n = com.haruhi.lex.mndfake.mnt.c.a((Context) this);

    private class a implements OnItemClickListener {
        private a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            com.haruhi.lex.mndfake.mnt.c a2;
            String str;
            String str2;
            String str3;
            com.haruhi.lex.mndfake.constant.a.e s;
            com.haruhi.lex.mndfake.mnt.c a3;
            String str4;
            String str5;
            String str6;
            DrawerLayout r;
            RelativeLayout q;
            String o;
            String o2;
            String o3;
            String o4;
            try {
                int a4 = com.haruhi.lex.mndfake.a.a.a(DrawerFrameActivityMain.m, i);
                if (R.string.drawer_menu_user_guide == a4) {
                    try {
                        Intent intent = new Intent(DrawerFrameActivityMain.this, ActivityUserGuide.class);
                        intent.setFlags(276824064);
                        DrawerFrameActivityMain.this.startActivity(intent);
                        DrawerFrameActivityMain.this.overridePendingTransition(R.anim.animation_left_in, R.anim.animation_left_out);
                    } catch (NullPointerException e) {
                        e = e;
                        o4 = DrawerFrameActivityMain.l;
                    } catch (Exception e2) {
                        e = e2;
                        o4 = DrawerFrameActivityMain.l;
                    }
                    r = DrawerFrameActivityMain.q;
                    q = DrawerFrameActivityMain.w;
                } else if (R.string.drawer_menu_gps_checkout == a4) {
                    try {
                        if (k.b((Context) DrawerFrameActivityMain.this)) {
                            Intent intent2 = new Intent(DrawerFrameActivityMain.this, ActivityCheckOutGPS.class);
                            intent2.setFlags(268435456);
                            DrawerFrameActivityMain.this.startActivity(intent2);
                            DrawerFrameActivityMain.this.overridePendingTransition(R.anim.animation_left_in, R.anim.animation_left_out);
                        } else {
                            k.b((Context) DrawerFrameActivityMain.this, (int) R.string.mndmdm_checkout_status_desc);
                        }
                    } catch (NullPointerException e3) {
                        e = e3;
                        o3 = DrawerFrameActivityMain.l;
                        h.a(o3, e);
                        r = DrawerFrameActivityMain.q;
                        q = DrawerFrameActivityMain.w;
                        r.i(q);
                    } catch (Exception e4) {
                        e = e4;
                        o3 = DrawerFrameActivityMain.l;
                        h.a(o3, e);
                        r = DrawerFrameActivityMain.q;
                        q = DrawerFrameActivityMain.w;
                        r.i(q);
                    }
                    r = DrawerFrameActivityMain.q;
                    q = DrawerFrameActivityMain.w;
                } else if (R.string.drawer_menu_sms_checkout == a4) {
                    try {
                        if (k.b((Context) DrawerFrameActivityMain.this)) {
                            Intent intent3 = new Intent(DrawerFrameActivityMain.this, ActivityCheckOutSMS.class);
                            intent3.setFlags(268435456);
                            DrawerFrameActivityMain.this.startActivity(intent3);
                            DrawerFrameActivityMain.this.overridePendingTransition(R.anim.animation_left_in, R.anim.animation_left_out);
                        } else {
                            k.b((Context) DrawerFrameActivityMain.this, (int) R.string.mndmdm_checkout_status_desc);
                        }
                    } catch (NullPointerException e5) {
                        e = e5;
                        o2 = DrawerFrameActivityMain.l;
                        h.a(o2, e);
                        r = DrawerFrameActivityMain.q;
                        q = DrawerFrameActivityMain.w;
                        r.i(q);
                    } catch (Exception e6) {
                        e = e6;
                        o2 = DrawerFrameActivityMain.l;
                        h.a(o2, e);
                        r = DrawerFrameActivityMain.q;
                        q = DrawerFrameActivityMain.w;
                        r.i(q);
                    }
                    r = DrawerFrameActivityMain.q;
                    q = DrawerFrameActivityMain.w;
                } else if (R.string.drawer_menu_log == a4) {
                    try {
                        Intent intent4 = new Intent(DrawerFrameActivityMain.this, ActivityLog.class);
                        intent4.setFlags(276824064);
                        DrawerFrameActivityMain.this.startActivity(intent4);
                        DrawerFrameActivityMain.this.overridePendingTransition(R.anim.animation_left_in, R.anim.animation_left_out);
                    } catch (NullPointerException e7) {
                        e = e7;
                        o = DrawerFrameActivityMain.l;
                    } catch (Exception e8) {
                        e = e8;
                        o = DrawerFrameActivityMain.l;
                    }
                    r = DrawerFrameActivityMain.q;
                    q = DrawerFrameActivityMain.w;
                } else if (R.string.drawer_menu_faq == a4) {
                    Intent intent5 = new Intent(DrawerFrameActivityMain.this, a.class);
                    intent5.setFlags(276824064);
                    DrawerFrameActivityMain.this.startActivity(intent5);
                    DrawerFrameActivityMain.this.overridePendingTransition(R.anim.animation_left_in, R.anim.animation_left_out);
                    r = DrawerFrameActivityMain.q;
                    q = DrawerFrameActivityMain.w;
                } else if (R.string.drawer_menu_admin == a4) {
                    Intent intent6 = new Intent(DrawerFrameActivityMain.this, ActivityFixConfig.class);
                    intent6.setFlags(276824064);
                    DrawerFrameActivityMain.this.startActivity(intent6);
                    DrawerFrameActivityMain.this.overridePendingTransition(R.anim.animation_left_in, R.anim.animation_left_out);
                    r = DrawerFrameActivityMain.q;
                    q = DrawerFrameActivityMain.w;
                } else {
                    if (R.string.mndmdm_common_list_item_alert_vibration == a4) {
                        Switch switchR = (Switch) view.findViewById(R.id.swState);
                        if (switchR.isChecked()) {
                            switchR.setChecked(false);
                            a3 = DrawerFrameActivityMain.this.n;
                            str4 = "ConfigInfo";
                            str5 = "config_alert_vibration";
                            str6 = "off";
                        } else {
                            switchR.setChecked(true);
                            a3 = DrawerFrameActivityMain.this.n;
                            str4 = "ConfigInfo";
                            str5 = "config_alert_vibration";
                            str6 = "on";
                        }
                        a3.a(str4, str5, str6);
                        s = DrawerFrameActivityMain.D;
                    } else if (R.string.mndmdm_common_list_item_alert_sound == a4) {
                        Switch switchR2 = (Switch) view.findViewById(R.id.swState);
                        if (switchR2.isChecked()) {
                            switchR2.setChecked(false);
                            a2 = DrawerFrameActivityMain.this.n;
                            str = "ConfigInfo";
                            str2 = "config_alert_sound";
                            str3 = "off";
                        } else {
                            switchR2.setChecked(true);
                            a2 = DrawerFrameActivityMain.this.n;
                            str = "ConfigInfo";
                            str2 = "config_alert_sound";
                            str3 = "on";
                        }
                        a2.a(str, str2, str3);
                        s = DrawerFrameActivityMain.D;
                    } else {
                        return;
                    }
                    s.notifyDataSetChanged();
                    return;
                }
                r.i(q);
                h.a(o4, e);
                r = DrawerFrameActivityMain.q;
                q = DrawerFrameActivityMain.w;
                r.i(q);
                h.a(o, e);
                r = DrawerFrameActivityMain.q;
                q = DrawerFrameActivityMain.w;
                r.i(q);
            } catch (Exception | NullPointerException e9) {
                h.a(DrawerFrameActivityMain.l, e9);
            }
        }
    }

    private void a(Context context, int i, int i2, int i3) {
        try {
            new Builder(m, 2131558674).setTitle(i2).setMessage(i3).setCancelable(false).setNegativeButton(R.string.common___close, $$Lambda$DrawerFrameActivityMain$yij3sDUl2VWruwgIq6KtefAnRmc.INSTANCE).show();
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        try {
            if (((TelephonyManager) getSystemService("phone")).getPhoneType() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("tel:");
                sb.append(t.getText());
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(sb.toString()));
                intent.setFlags(268435456);
                startActivity(intent);
            }
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(EditText editText, DialogInterface dialogInterface, int i) {
        try {
            String obj = editText.getText().toString();
            StringBuilder sb = new StringBuilder();
            sb.append(k.b(Long.valueOf(System.currentTimeMillis())));
            sb.append("sms");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(k.b(Long.valueOf(System.currentTimeMillis())));
            sb3.append("setting");
            sb3.toString();
            if (obj != null) {
                if (obj.length() != 0) {
                    if (sb2.equalsIgnoreCase(obj)) {
                        if (!"msGoLhcVq0dT7rv3dI+HDw==".equalsIgnoreCase(com.haruhi.lex.mndfake.mnt.c.c(m))) {
                            if (!k.b(m)) {
                                k.a(m, (int) R.string.mndmdm_checkout_status_desc);
                                return;
                            }
                            Intent intent = new Intent(this, ActivityCheckOutSMS.class);
                            intent.setFlags(268435456);
                            startActivity(intent);
                            overridePendingTransition(R.anim.animation_left_in, R.anim.animation_left_out);
                            return;
                        }
                        return;
                    }
                    k.a(m, (int) R.string.mndmdm_admin_popup_desc_invalid);
                    return;
                }
            }
            k.a(m, (int) R.string.mndmdm_sms_popup_invalid_intro_desc);
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        this.n.a("CompanyInfo", "company_info_auth_code", WifiAdminProfile.PHASE1_DISABLE);
        this.n.a("ConfigInfo", "config_knox_activated", "off");
        this.n.a("ConfigInfo", "config_knox_activated_new", "off");
        f.a(this, false);
        com.haruhi.lex.mndfake.b.b.d(m);
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        startActivity(intent);
        Context context = m;
        com.haruhi.lex.mndfake.mnt.a.e(context, context.getPackageName());
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0382, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03fc, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0406, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0407, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0408, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x040c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x040d, code lost:
        com.haruhi.lex.mndfake.mnt.h.a(l, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0414, code lost:
        return true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03cf A[Catch:{ NullPointerException -> 0x0406, Exception -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x040c A[ExcHandler: Exception (r0v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9 A[Catch:{ NullPointerException -> 0x0415, Exception -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af A[Catch:{ NullPointerException -> 0x0415, Exception -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d2 A[Catch:{ NullPointerException -> 0x0406, Exception -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d9 A[Catch:{ NullPointerException -> 0x0406, Exception -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ed A[Catch:{ NullPointerException -> 0x0406, Exception -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f1 A[Catch:{ NullPointerException -> 0x0406, Exception -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0211 A[Catch:{ NullPointerException -> 0x0406, Exception -> 0x040c }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0344 A[Catch:{ NullPointerException -> 0x0406, Exception -> 0x040c }] */
    private boolean c(Intent intent) {
        String b;
        Context context;
        String str;
        String string;
        String string2;
        String str2;
        int i;
        Intent intent2;
        String uri;
        int indexOf;
        boolean z2 = true;
        String str3 = "";
        try {
            Uri data = intent.getData();
            if (data == null) {
                String action = intent.getAction();
                String type = intent.getType();
                if ("android.intent.action.SEND".equals(action) && type != null && "text/plain".equals(type)) {
                    uri = intent.getStringExtra("android.intent.extra.TEXT");
                    if (uri != null) {
                        if (uri.length() != 0) {
                            if (uri.contains("mmsa.client.app")) {
                                indexOf = uri.toString().indexOf("p=");
                            }
                        }
                    }
                }
                return false;
            }
            String scheme = data.getScheme();
            String host = data.getHost();
            if (scheme == null || "http".equals(scheme) || host == null || "mmsa.client.app".equalsIgnoreCase(host)) {
                uri = data.toString();
                indexOf = data.toString().indexOf("p=");
            }
            if (str3 != null && str3.length() > 0) {
                b = k.b(str3, 1);
                String str4 = l;
                StringBuilder sb = new StringBuilder();
                sb.append(" ");
                sb.append(b);
                h.a(str4, sb.toString());
                if (b != null) {
                    a(m, R.layout.layout_dialog_common_button_gk, R.string.drawer_menu_sms_checkout, R.string.mndmdm_sms_popup_invalid_desc);
                    return false;
                }
                h.a(m, l, getString(R.string.drawer_menu_sms_checkout), getString(R.string.sms_checkout_msg_receive));
                String[] split = b.split("\\|");
                String str5 = split[0];
                String str6 = split[1];
                String str7 = split[2];
                String str8 = split[3];
                String str9 = split[4];
                String str10 = split[5];
                String str11 = split[6];
                String str12 = split[7];
                if (!k.b((Context) this)) {
                    a(m, R.layout.layout_dialog_common_button_gk, R.string.drawer_menu_sms_checkout_failed, R.string.mndmdm_sms_popup_invalid_desc);
                    return false;
                } else if (!str5.equalsIgnoreCase(com.haruhi.lex.mndfake.mnt.c.d(m))) {
                    a(m, R.layout.layout_dialog_common_button_gk, R.string.drawer_menu_sms_checkout_failed, R.string.mndmdm_sms_popup_not_match_time_desc);
                    return false;
                } else if (!this.n.b("CompanyInfo", "device_lock_time", WifiAdminProfile.PHASE1_DISABLE).equals(str8)) {
                    a(m, R.layout.layout_dialog_common_button_gk, R.string.drawer_menu_sms_checkout_failed, R.string.mndmdm_sms_popup_invalid_desc);
                    return false;
                } else if (!this.n.b("CompanyInfo", "company_info_request_checkout_time", WifiAdminProfile.PHASE1_DISABLE).equals(str9)) {
                    a(m, R.layout.layout_dialog_common_button_gk, R.string.drawer_menu_sms_checkout_failed, R.string.mndmdm_sms_popup_not_match_time_desc);
                    return false;
                } else if (!d.c(this).equalsIgnoreCase(str7)) {
                    a(m, R.layout.layout_dialog_common_button_gk, R.string.drawer_menu_sms_checkout_failed, R.string.mndmdm_sms_popup_invalid_desc);
                    return false;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = Long.valueOf(str10).longValue();
                    long longValue2 = Long.valueOf(str11).longValue();
                    Long.signum(longValue2);
                    if (currentTimeMillis > longValue + (longValue2 * 60000)) {
                        if (Integer.valueOf(str11).intValue() != -1) {
                            a(m, R.layout.layout_dialog_common_button_gk, R.string.drawer_menu_sms_checkout_failed, R.string.mndmdm_sms_popup_invalid_time_desc);
                            return false;
                        }
                    }
                    if ("0722".equalsIgnoreCase(str6)) {
                        if (!com.haruhi.lex.mndfake.mnt.c.c(m).equals("4DMNP7bf5yNdhf+GZ7H7mA==")) {
                            if (!com.haruhi.lex.mndfake.mnt.c.c(m).equals("h/Q2JBll4LTBwoGyyP9JeQ==")) {
                                context = m;
                                str = l;
                                string = getString(R.string.mndmdm_common_camera_allow);
                                string2 = getString(R.string.mndmdm_sms);
                                h.a(context, str, string, string2);
                                Intent intent3 = new Intent(this, ServiceAlert.class);
                                if (!k.c((Context) this)) {
                                    str2 = "alert_type";
                                    i = 5;
                                } else {
                                    str2 = "alert_type";
                                    i = 3;
                                }
                                intent3.putExtra(str2, i);
                                if (k.c((Context) this, ServiceAlert.class.getName()).booleanValue()) {
                                    startService(intent3);
                                } else {
                                    new Handler().postDelayed(new Runnable(intent3) {
                                        private final /* synthetic */ Intent f$1;

                                        {
                                            this.f$1 = r2;
                                        }

                                        public final void run() {
                                            DrawerFrameActivityMain.this.d(this.f$1);
                                        }
                                    }, 1000);
                                }
                                if (!com.haruhi.lex.mndfake.mnt.c.c(m).equals("4DMNP7bf5yNdhf+GZ7H7mA==")) {
                                    if (!com.haruhi.lex.mndfake.mnt.c.c(m).equals("h/Q2JBll4LTBwoGyyP9JeQ==")) {
                                        a(m, R.layout.layout_dialog_common_button_gk, R.string.drawer_menu_sms_checkout_success, R.string.mndmdm_common_camera_allow_desc);
                                        f.a(m, false);
                                        k.a((Context) this, "off");
                                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_lock_time), getResources().getString(R.string.sms_value_default));
                                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_company_code), getResources().getString(R.string.sms_value_empty));
                                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_company_name), getResources().getString(R.string.sms_value_empty));
                                        k.b((Context) this, "off");
                                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_second_lock_time), getResources().getString(R.string.sms_value_default));
                                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_company_second_code), getResources().getString(R.string.sms_value_empty));
                                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_company_second_name), getResources().getString(R.string.sms_value_empty));
                                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_agree_terms), getResources().getString(R.string.sms_value_off));
                                        sendBroadcast(new Intent("com.markany.aegis.vt.MSTICKER_REFRESH_VIEW"));
                                        if (com.haruhi.lex.mndfake.a.a.a(m) != 1) {
                                            this.n.a("ConfigInfo", ServicePolicy.class.getName(), "off");
                                            intent2 = new Intent(this, ServicePolicy.class);
                                            intent2.putExtra("extra_destroy", "yes");
                                            if (com.haruhi.lex.mndfake.mnt.a.b(this, getPackageName()) >= 26 && VERSION.SDK_INT >= 26) {
                                            }
                                            startService(intent2);
                                        } else if (d.c().equals(getResources().getString(R.string.manufacture_code_samsung))) {
                                            this.n.a("ConfigInfo", ServicePolicyMFSS.class.getName(), "on");
                                            intent2 = new Intent(this, ServicePolicyMFSS.class);
                                            intent2.putExtra("extra_destroy", "yes");
                                            if (com.haruhi.lex.mndfake.mnt.a.b(this, getPackageName()) >= 26) {
                                            }
                                            startService(intent2);
                                        } else if (d.c().equals(getResources().getString(R.string.manufacture_code_lg))) {
                                            this.n.a("ConfigInfo", ServicePolicyMFLG.class.getName(), "on");
                                            intent2 = new Intent(this, ServicePolicyMFLG.class);
                                            intent2.putExtra("extra_destroy", "yes");
                                            if (com.haruhi.lex.mndfake.mnt.a.b(this, getPackageName()) >= 26 && VERSION.SDK_INT >= 26) {
                                            }
                                            startService(intent2);
                                        }
                                        startForegroundService(intent2);
                                    }
                                }
                                a(m, R.layout.layout_dialog_common_button_gk, R.string.drawer_menu_sms_checkout_success, R.string.mndmdm_common_add_func_allow_desc);
                                f.a(m, false);
                                k.a((Context) this, "off");
                                this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_lock_time), getResources().getString(R.string.sms_value_default));
                                this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_company_code), getResources().getString(R.string.sms_value_empty));
                                this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_company_name), getResources().getString(R.string.sms_value_empty));
                                k.b((Context) this, "off");
                                this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_second_lock_time), getResources().getString(R.string.sms_value_default));
                                this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_company_second_code), getResources().getString(R.string.sms_value_empty));
                                this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_company_second_name), getResources().getString(R.string.sms_value_empty));
                                this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_agree_terms), getResources().getString(R.string.sms_value_off));
                                sendBroadcast(new Intent("com.markany.aegis.vt.MSTICKER_REFRESH_VIEW"));
                                if (com.haruhi.lex.mndfake.a.a.a(m) != 1) {
                                }
                                startForegroundService(intent2);
                            }
                        }
                        context = m;
                        str = l;
                        string = getString(R.string.mndmdm_common_add_func_allow_2);
                        string2 = getString(R.string.mndmdm_sms);
                        h.a(context, str, string, string2);
                        Intent intent32 = new Intent(this, ServiceAlert.class);
                        if (!k.c((Context) this)) {
                        }
                        intent32.putExtra(str2, i);
                        if (k.c((Context) this, ServiceAlert.class.getName()).booleanValue()) {
                        }
                        if (!com.haruhi.lex.mndfake.mnt.c.c(m).equals("4DMNP7bf5yNdhf+GZ7H7mA==")) {
                        }
                        a(m, R.layout.layout_dialog_common_button_gk, R.string.drawer_menu_sms_checkout_success, R.string.mndmdm_common_add_func_allow_desc);
                        f.a(m, false);
                        k.a((Context) this, "off");
                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_lock_time), getResources().getString(R.string.sms_value_default));
                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_company_code), getResources().getString(R.string.sms_value_empty));
                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_company_name), getResources().getString(R.string.sms_value_empty));
                        k.b((Context) this, "off");
                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_second_lock_time), getResources().getString(R.string.sms_value_default));
                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_company_second_code), getResources().getString(R.string.sms_value_empty));
                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_company_second_name), getResources().getString(R.string.sms_value_empty));
                        this.n.a(getResources().getString(R.string.sms_table_name), getResources().getString(R.string.sms_info_agree_terms), getResources().getString(R.string.sms_value_off));
                        sendBroadcast(new Intent("com.markany.aegis.vt.MSTICKER_REFRESH_VIEW"));
                        if (com.haruhi.lex.mndfake.a.a.a(m) != 1) {
                        }
                        startForegroundService(intent2);
                    } else {
                        k.a((Context) this, (int) R.string.qrcode_toast_invalid_sms);
                    }
                }
            }
            return true;
            str3 = uri.substring(indexOf + 2);
            b = k.b(str3, 1);
            String str42 = l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(b);
            h.a(str42, sb2.toString());
            if (b != null) {
            }
        } catch (NullPointerException e) {
            Exception exc = e;
            h.a(l, exc);
            return z2;
        } catch (Exception e2) {
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(Intent intent) {
        startService(intent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(DialogInterface dialogInterface, int i) {
        try {
            k.b();
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
        }
    }

    private boolean u() {
        try {
            String a2 = com.haruhi.lex.mndfake.mnt.e.a(getBaseContext(), "/MobileSticker/task/");
            String a3 = com.haruhi.lex.mndfake.mnt.e.a(getBaseContext(), "/MobileSticker/log/");
            String str = l;
            StringBuilder sb = new StringBuilder();
            sb.append("create task dir: ");
            sb.append(com.haruhi.lex.mndfake.mnt.e.b(a2));
            h.a(str, sb.toString());
            String str2 = l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("create log dir: ");
            sb2.append(com.haruhi.lex.mndfake.mnt.e.b(a3));
            h.a(str2, sb2.toString());
            F = j();
            p = (Toolbar) findViewById(R.id.toolbar);
            q = (DrawerLayout) findViewById(R.id.drawer_layout);
            w = (RelativeLayout) findViewById(R.id.left_drawer);
            x = (ListView) findViewById(R.id.lvDrawerMenu);
            A = (ImageButton) findViewById(R.id.ivMenu);
            A.setOnClickListener(this);
            v = (ImageView) findViewById(R.id.ivUserState);
            y = (Button) findViewById(R.id.btnClose);
            y.setOnClickListener(this);
            y.setOnLongClickListener(this);
            z = (Button) findViewById(R.id.btnDelete);
            z.setOnClickListener(this);
            B = (ImageButton) findViewById(R.id.btnAlert);
            B.setOnClickListener(this);
            C = (ImageButton) findViewById(R.id.btnDeleteApp);
            C.setOnClickListener(this);
            s = (TextView) findViewById(R.id.tvCopyRightnVersion);
            t = (TextView) findViewById(R.id.tvCallCenter);
            t.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    DrawerFrameActivityMain.this.a(view);
                }
            });
            u = (TextView) findViewById(R.id.tvCallCenter2);
            E = com.haruhi.lex.mndfake.a.a.c((Context) this);
            if (E != null && E.length > 0) {
                D = new com.haruhi.lex.mndfake.constant.a.e(this, R.layout.layout_list_drawer_item, E);
                x.setAdapter(D);
                x.setOnItemClickListener(new a());
            }
            if (!k.a((Context) this)) {
                H = b.a();
                G = F.a();
                G.a(R.id.content_frame, H, b.a);
                G.d();
                p.setTitle((CharSequence) "");
                a(p);
                b().a(false);
                b().a((int) R.drawable.img_common_drawer_menu);
                H.a(true);
            } else {
                y();
                I = c.a();
                G = F.a();
                G.a(R.id.content_frame, I, c.a);
                G.d();
                p.setTitle((CharSequence) "");
                a(p);
                b().a(false);
                b().a((int) R.drawable.img_common_drawer_menu);
                I.a(true);
            }
            AnonymousClass2 r5 = new b(this, q, com.haruhi.lex.mndfake.a.a.b(getPackageName()), com.haruhi.lex.mndfake.a.a.b(getPackageName())) {
                public void a(View view) {
                    super.a(view);
                    DrawerFrameActivityMain.this.c();
                }

                public void b(View view) {
                    super.b(view);
                    DrawerFrameActivityMain.this.c();
                }
            };
            r = r5;
            r.a(false);
            q.a((DrawerLayout.c) r);
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
        }
        return true;
    }

    private boolean v() {
        ImageView imageView;
        Drawable a2;
        try {
            m = this;
            TextView textView = s;
            StringBuilder sb = new StringBuilder();
            sb.append("v");
            sb.append(com.haruhi.lex.mndfake.mnt.a.a((Context) this, getPackageName()));
            textView.setText(sb.toString());
            String c = com.haruhi.lex.mndfake.mnt.c.c(m);
            if (m.getPackageName().equals("kr.go.mnd.mmsa")) {
                if ("msGoLhcVq0dT7rv3dI+HDw==".equals(c)) {
                    if (VERSION.SDK_INT < 21) {
                        imageView = v;
                        a2 = getResources().getDrawable(R.drawable.img_common_mnsa_logo);
                    } else {
                        imageView = v;
                        a2 = androidx.core.content.a.a(m, (int) R.drawable.img_common_mnsa_logo);
                    }
                }
                return true;
            } else if (m.getPackageName().equals("com.haruhi.lex.mndfake.of")) {
                if (MntData.b.contains(c)) {
                    u.setVisibility(0);
                    if (VERSION.SDK_INT < 21) {
                        imageView = v;
                        a2 = getResources().getDrawable(R.drawable.img_common_user_employee);
                    } else {
                        imageView = v;
                        a2 = androidx.core.content.a.a(m, (int) R.drawable.img_common_user_employee);
                    }
                }
                return true;
            } else {
                if (m.getPackageName().equals("com.haruhi.lex.mndfake.vt")) {
                    if (MntData.c.contains(c)) {
                        u.setVisibility(0);
                        if (VERSION.SDK_INT < 21) {
                            imageView = v;
                            a2 = getResources().getDrawable(R.drawable.img_common_user_regular_guest);
                        } else {
                            imageView = v;
                            a2 = androidx.core.content.a.a(m, (int) R.drawable.img_common_user_regular_guest);
                        }
                    } else if ("PPzpM+nXRtEukMUoJl/9jw==".equals(c)) {
                        if (VERSION.SDK_INT < 21) {
                            imageView = v;
                            a2 = getResources().getDrawable(R.drawable.img_common_user_vistor);
                        } else {
                            imageView = v;
                            a2 = androidx.core.content.a.a(m, (int) R.drawable.img_common_user_vistor);
                        }
                    }
                }
                return true;
            }
            imageView.setBackground(a2);
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
        }
        return true;
    }

    private int w() {
        try {
            if (d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_lg)) && new com.haruhi.lex.mndfake.b.e().a(m) == 1) {
                h.c(l, "LG ROOTING CHECK >> ROOTING");
                k.a((Context) this, (int) R.string.policy___popup_deny_rooting);
                finish();
                return R.string.common___off;
            } else if ((WifiAdminProfile.PHASE1_ALLOW_UNAUTHENTICATED.equals(d.a(this)) && !k.d((Context) this)) || com.haruhi.lex.mndfake.b.b.c(this) == null) {
                return R.string.common___off;
            } else {
                if (com.haruhi.lex.mndfake.a.a.a((Context) this) == 1) {
                    if (d.c().equals(getResources().getString(R.string.manufacture_code_samsung))) {
                        if (VERSION.SDK_INT >= 29) {
                            if ("off".equals(com.haruhi.lex.mndfake.mnt.c.a((Context) this).b("ConfigInfo", "config_knox_activated_new", "off"))) {
                                return R.string.common___off;
                            }
                        } else if ("off".equals(com.haruhi.lex.mndfake.mnt.c.a((Context) this).b("ConfigInfo", "config_knox_activated", "off"))) {
                            return R.string.common___off;
                        }
                    } else if (d.c().equals(getResources().getString(R.string.manufacture_code_lg)) && com.haruhi.lex.mndfake.mnt.a.a(com.haruhi.lex.mndfake.mnt.a.a((Context) this, getPackageName()), "1.0.09") >= 0 && "off".equals(com.haruhi.lex.mndfake.mnt.c.a((Context) this).b("ConfigInfo", "config_gda_09_activated", "off"))) {
                        return R.string.common___off;
                    }
                }
                return R.string.common___on;
            }
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
            return R.string.common___off;
        }
    }

    private int x() {
        try {
            return com.haruhi.lex.mndfake.mnt.j.e(this).length > 0 ? R.string.common___off : R.string.common___on;
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
            return R.string.common___off;
        }
    }

    /* access modifiers changed from: private */
    public void y() {
        try {
            if (k.a(this.n)) {
                z.setVisibility(4);
                C.setVisibility(4);
                B.setVisibility(0);
                com.haruhi.lex.mndfake.mnt.c.c(m);
                m.getPackageName().equals("kr.go.mnd.mmsa");
                m.getPackageName().equals("com.haruhi.lex.mndfake.vt");
                return;
            }
            z.setVisibility(0);
            C.setVisibility(0);
            B.setVisibility(8);
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void z() {
        try {
            int d = F.d();
            F.a((int) R.id.content_frame).getTag();
            if (d > 0) {
                int a2 = F.b(d - 1).a();
                String str = l;
                StringBuilder sb = new StringBuilder();
                sb.append("onBackStackChanged  checkedId : ");
                sb.append(a2);
                h.b(str, sb.toString());
            }
            List<Fragment> e = F.e();
            if (e != null) {
                for (Fragment fragment : e) {
                }
            }
        } catch (Exception | NullPointerException e2) {
            h.a(l, e2);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = l;
        StringBuilder sb = new StringBuilder();
        sb.append("receive activity result: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        h.a(str, sb.toString());
        if (1001 == i && -1 != i2 && i2 == 0) {
            try {
                k.a((Context) this, (int) R.string.common_toast_agree);
                k.b();
            } catch (Exception | NullPointerException e) {
                h.a(l, e);
            }
        }
    }

    public void onBackPressed() {
        try {
            if (q.j(w)) {
                q.i(w);
                return;
            }
            int i = 0;
            for (Fragment fragment : F.e()) {
                if (fragment != null) {
                    if (!fragment.isRemoving()) {
                        i++;
                    }
                }
            }
            if (F.d() <= 0 || i <= 1) {
                if (!O) {
                    k.a((Context) this, (int) R.string.toast___exit_back_btn);
                    O = true;
                    P.sendEmptyMessageDelayed(0, 2000);
                } else {
                    k.b();
                }
                return;
            }
            super.onBackPressed();
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
        }
    }

    public void onClick(View view) {
        String str;
        try {
            int id = view.getId();
            if (m != null) {
                switch (id) {
                    case R.id.btnAlert /*2131165231*/:
                        if (!"off".equals(this.n.b("ConfigInfo", "config_alert_vibration", "on")) || !"off".equals(this.n.b("ConfigInfo", "config_alert_sound", "on"))) {
                            Intent intent = new Intent(m, ServiceAlert.class);
                            if (k.b(this.n)) {
                                intent.putExtra("alert_type", 20);
                            } else if (k.a(this.n)) {
                                intent.putExtra("alert_type", 10);
                            } else {
                                intent.putExtra("alert_type", 30);
                            }
                            if (k.c(m, ServiceAlert.class.getName()).booleanValue()) {
                                new Handler().postDelayed(new Runnable(intent) {
                                    private final /* synthetic */ Intent f$0;

                                    {
                                        this.f$0 = r1;
                                    }

                                    public final void run() {
                                        DrawerFrameActivityMain.m.startService(this.f$0);
                                    }
                                }, 1000);
                                break;
                            } else {
                                m.startService(intent);
                                break;
                            }
                        } else {
                            new Builder(m, 2131558674).setTitle(R.string.mndmdm_common_popup_alram_title).setMessage(R.string.mndmdm_common_popup_alram_desc).setCancelable(false).setNegativeButton(R.string.common___ok, $$Lambda$DrawerFrameActivityMain$TD4lB_WJ60rLWw1YRjfm3HeQABk.INSTANCE).show();
                            return;
                        }
                        break;
                    case R.id.btnClose /*2131165240*/:
                        if (q != null) {
                            q.i(w);
                            break;
                        }
                        break;
                    case R.id.btnDelete /*2131165242*/:
                    case R.id.btnDeleteApp /*2131165243*/:
                        try {
                            if (!k.b((Context) this)) {
                                if (!k.c((Context) this)) {
                                    if (J != null) {
                                        J.dismiss();
                                        J = null;
                                    }
                                    J = new Builder(m, 2131558674).setTitle(R.string.common___delete_mmsa).setMessage(R.string.common_app_remove_request_message_commmon).setCancelable(true).setPositiveButton(R.string.common___ok, new DialogInterface.OnClickListener() {
                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            DrawerFrameActivityMain.this.c(dialogInterface, i);
                                        }
                                    }).setNegativeButton(R.string.common___cancel, $$Lambda$DrawerFrameActivityMain$A7Ytc_B2LT2etxos0tNWs1xvKE4.INSTANCE).show();
                                    if (q != null) {
                                        q.i(w);
                                    }
                                }
                            }
                            k.a((Context) this, (int) R.string.common_app_remove_fail_message_commmon);
                        } catch (NullPointerException e) {
                            e = e;
                            str = l;
                            h.a(str, e);
                        } catch (Exception e2) {
                            e = e2;
                            str = l;
                            h.a(str, e);
                        }
                    case R.id.ivMenu /*2131165325*/:
                        if (q != null) {
                            q.h((View) w);
                            break;
                        }
                        break;
                }
            }
        } catch (Exception | NullPointerException e3) {
            h.a(l, e3);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r.a(configuration);
    }

    public void onCreate(Bundle bundle) {
        String str = l;
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(" create");
        h.a(str, sb.toString());
        super.onCreate(bundle);
        setContentView((int) R.layout.drawer_base);
        try {
            k.c((Activity) this);
            k.b((Activity) this);
            if (!d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_samsung)) && !d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_lg)) && !d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_pantech)) && !d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_xiaomi))) {
                if (!d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_huawei))) {
                    Builder builder = new Builder(this, 2131558674);
                    builder.setCancelable(false);
                    builder.setMessage(R.string.toast___not_support_manufacture);
                    builder.setPositiveButton(R.string.common___ok, $$Lambda$DrawerFrameActivityMain$nyY2aSh6j3Jz83euxWWkneoqzOM.INSTANCE);
                    builder.setNegativeButton(R.string.common___cancel, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    builder.show();
                }
            }
            c(getIntent());
            m = this;
            F = j();
            if (d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_lg)) && new com.haruhi.lex.mndfake.b.e().a(m) == 1) {
                k.a((Context) this, (int) R.string.policy___popup_deny_rooting);
                finish();
            } else if (WifiAdminProfile.PHASE1_ALLOW_UNAUTHENTICATED.equals(d.a(this))) {
                finish();
            } else {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.markany.aegis.vt.MSTICKER_REFRESH_VIEW");
                registerReceiver(this.k, intentFilter);
                if (u()) {
                    v();
                }
                if (com.haruhi.lex.mndfake.mnt.j.e(this).length > 0) {
                    Intent intent = new Intent(this, ActivityPermissionAgree.class);
                    intent.setFlags(268435456);
                    startActivity(intent);
                    overridePendingTransition(R.anim.animation_left_in, R.anim.animation_left_out);
                    finish();
                    return;
                }
                if (MntData.b.contains(com.haruhi.lex.mndfake.mnt.c.c((Context) this))) {
                    com.haruhi.lex.mndfake.mnt.c.a((Context) this).a("ConfigInfo", "config_gda_09_activated", "on");
                }
                if (x() != R.string.common___off) {
                    if (w() != R.string.common___off) {
                        if ((d.c().equalsIgnoreCase("HUAWEI") || d.c().equalsIgnoreCase("Xiaomi") || d.c().equalsIgnoreCase("Google")) && !com.haruhi.lex.mndfake.mnt.j.c(this)) {
                            Intent intent2 = new Intent(this, ActivityPermission.class);
                            intent2.setFlags(536870912);
                            startActivity(intent2);
                            overridePendingTransition(R.anim.animation_left_in, R.anim.animation_left_out);
                            finish();
                            return;
                        } else if (k.b((Context) this) || !"on".equals(this.n.b("ConfigInfo", "user_guide", "on"))) {
                            if (!d.c().equalsIgnoreCase("HUAWEI")) {
                                if (!d.c().equalsIgnoreCase("Xiaomi")) {
                                    if (!k.g(this)) {
                                        String c = com.haruhi.lex.mndfake.mnt.c.c((Context) this);
                                        if (!k.b((Context) this)) {
                                            if (J != null) {
                                                J.dismiss();
                                                J = null;
                                            }
                                            if ("msGoLhcVq0dT7rv3dI+HDw==".equals(c) || "PPzpM+nXRtEukMUoJl/9jw==".equals(c)) {
                                                J = new Builder(this, 2131558674).setTitle(R.string.mndmdm_common_popup_nfc_off_title).setMessage(R.string.mndmdm_common_popup_nfc_off_desc).setNegativeButton(R.string.common___ok, $$Lambda$DrawerFrameActivityMain$xb7Wae1EvYDeqyUuMMMkTeeRycg.INSTANCE).create();
                                                J.show();
                                            }
                                        } else if (!"msGoLhcVq0dT7rv3dI+HDw==".equals(c) && "PPzpM+nXRtEukMUoJl/9jw==".equals(c)) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                            return;
                        } else {
                            startActivity(new Intent(this, ActivityUserGuide.class));
                            overridePendingTransition(R.anim.animation_left_in, R.anim.animation_left_out);
                            return;
                        }
                    }
                }
                Intent intent3 = new Intent(this, ActivityPermission.class);
                intent3.setFlags(536870912);
                startActivity(intent3);
                overridePendingTransition(R.anim.animation_left_in, R.anim.animation_left_out);
                finish();
            }
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.fragment_menu, menu);
        return true;
    }

    public void onDestroy() {
        String str;
        String str2 = l;
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(" destroy");
        h.a(str2, sb.toString());
        super.onDestroy();
        try {
            m = this;
            if (o != null) {
                k.a(o);
                o = null;
            }
            if (J != null) {
                J.dismiss();
                J = null;
            }
            try {
                unregisterReceiver(this.k);
            } catch (NullPointerException e) {
                e = e;
                str = l;
            } catch (Exception e2) {
                e = e2;
                str = l;
            }
            k.d((Activity) this);
            h.a(str, e);
            k.d((Activity) this);
        } catch (Exception | NullPointerException e3) {
            h.a(l, e3);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onLongClick(View view) {
        try {
            if (view.getId() == R.id.btnClose) {
                EditText editText = new EditText(m);
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.setInputType(129);
                editText.setMaxLines(1);
                editText.setMinimumWidth(200);
                editText.setWidth(500);
                new Builder(m, 2131558674).setView(editText).setTitle("").setPositiveButton(R.string.common___ok, new DialogInterface.OnClickListener(editText) {
                    private final /* synthetic */ EditText f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        DrawerFrameActivityMain.this.a(this.f$1, dialogInterface, i);
                    }
                }).show();
            }
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        c(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (r.a(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        String str = l;
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(" pause");
        h.a(str, sb.toString());
        super.onPause();
        try {
            F.b(this.L);
            if (q != null) {
                q.i(w);
            }
            if (J != null) {
                J.dismiss();
                J = null;
            }
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
        }
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        b bVar = r;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x0073;
     */
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intent intent;
        boolean z2 = false;
        if (i == 5468) {
            try {
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = true;
                        break;
                    } else if (iArr[i2] != 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    Intent intent2 = new Intent();
                    intent2.setAction("com.markany.aegis.vt.MSTICKER_PERMISSION");
                    intent2.putExtra("extra_return_code", "success");
                    sendBroadcast(intent2);
                    if (k.b((Context) this)) {
                        if (com.haruhi.lex.mndfake.a.a.a((Context) this) != 1) {
                            this.n.a("ConfigInfo", ServicePolicy.class.getName(), "on");
                            intent = new Intent(this, ServicePolicy.class);
                            if (com.haruhi.lex.mndfake.mnt.a.b(this, getPackageName()) >= 26 && VERSION.SDK_INT >= 26) {
                            }
                            startService(intent);
                            return;
                        } else if (d.c().equals(getResources().getString(R.string.manufacture_code_samsung))) {
                            this.n.a("ConfigInfo", ServicePolicyMFSS.class.getName(), "on");
                            intent = new Intent(this, ServicePolicyMFSS.class);
                            if (com.haruhi.lex.mndfake.mnt.a.b(this, getPackageName()) >= 26) {
                            }
                            startService(intent);
                            return;
                        } else if (d.c().equals(getResources().getString(R.string.manufacture_code_lg))) {
                            this.n.a("ConfigInfo", ServicePolicyMFLG.class.getName(), "on");
                            intent = new Intent(this, ServicePolicyMFLG.class);
                            if (com.haruhi.lex.mndfake.mnt.a.b(this, getPackageName()) >= 26 && VERSION.SDK_INT >= 26) {
                            }
                            startService(intent);
                            return;
                        } else {
                            return;
                        }
                        startForegroundService(intent);
                        return;
                    }
                    return;
                }
                k.a((Context) this, (int) R.string.permission_reqest_fail_optional_location);
                k.b();
            } catch (NullPointerException e) {
                e = e;
                h.a(l, e);
            } catch (Exception e2) {
                e = e2;
                h.a(l, e);
            }
        } else if (i == 5467) {
            int length2 = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    z2 = true;
                    break;
                } else if (iArr[i3] != 0) {
                    break;
                } else {
                    i3++;
                }
            }
            if (z2) {
                Intent intent3 = new Intent(this, ActivityBeacon.class);
                intent3.setFlags(8388608);
                startActivity(intent3);
                return;
            }
            k.a((Context) this, (int) R.string.permission_reqest_fail_optional_location);
        } else if (i == 5466) {
            int length3 = iArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length3) {
                    z2 = true;
                    break;
                } else if (iArr[i4] != 0) {
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                Intent intent4 = new Intent();
                intent4.setAction("com.markany.aegis.vt.MSTICKER_REQUEST_AUDIO_OUT");
                sendBroadcast(intent4);
            }
        } else {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        String str = l;
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(" resume");
        h.a(str, sb.toString());
        super.onResume();
        try {
            if (k.a((Activity) this)) {
                if (x() != R.string.common___off) {
                    if (w() != R.string.common___off) {
                        if (!k.d((Context) this)) {
                            getWindow().addFlags(8192);
                        }
                        if (com.haruhi.lex.mndfake.a.a.c() == 1) {
                            d.e(this);
                        }
                        F.a(this.L);
                        E = com.haruhi.lex.mndfake.a.a.c((Context) this);
                        D.a(E);
                        D.notifyDataSetChanged();
                        return;
                    }
                }
                Intent intent = new Intent(this, ActivityPermission.class);
                intent.setFlags(536870912);
                startActivity(intent);
                finish();
            }
        } catch (Exception | NullPointerException e) {
            h.a(l, e);
        }
    }
}
