package com.haruhi.lex.mndfake.activity;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import com.haruhi.lex.mndfake.R;
import com.haruhi.lex.mndfake.b.b;
import com.haruhi.lex.mndfake.b.f;
import com.haruhi.lex.mndfake.constant.CompanyInfoN;
import com.haruhi.lex.mndfake.mnt.MntData;
import com.haruhi.lex.mndfake.mnt.d;
import com.haruhi.lex.mndfake.mnt.e;
import com.haruhi.lex.mndfake.mnt.h;
import com.haruhi.lex.mndfake.mnt.j;
import com.haruhi.lex.mndfake.mnt.k;
import com.haruhi.lex.mndfake.service.ServiceAlert;
import com.haruhi.lex.mndfake.service.ServicePolicy;
import com.haruhi.lex.mndfake.service.ServicePolicyMFLG;
import com.haruhi.lex.mndfake.service.ServicePolicyMFSS;

public class c extends Fragment {
    private static TextView A = null;
    private static TextView B = null;
    private static TextView C = null;
    private static TextView D = null;
    /* access modifiers changed from: private */
    public static TextView E = null;
    private static TextView F = null;
    private static ImageView G = null;
    private static ImageView H = null;
    private static ImageView I = null;
    private static ImageView J = null;
    private static ProgressBar L = null;
    private static ProgressBar M = null;
    private static Dialog N = null;
    private static int O = 0;
    private static int P = 0;
    private static int Q = 0;
    private static Timer R = null;
    @SuppressLint({"HandlerLeak"})
    private static Handler S = new Handler() {
        public void handleMessage(Message message) {
            try {
                ((ImageView) message.obj).setAnimation(AnimationUtils.loadAnimation(c.f, R.anim.animation_incease_scale));
            } catch (Exception e) {
                h.a(c.a, e);
            }
        }
    };
    @SuppressLint({"HandlerLeak"})
    private static Handler T = new Handler() {
        public void handleMessage(Message message) {
            try {
                g gVar = (g) message.obj;
                for (Fragment fragment : gVar.e()) {
                    if (fragment != null) {
                        if (!c.a.equals(fragment.getTag())) {
                            gVar.a().b(fragment).a(fragment).d();
                        }
                    }
                }
            } catch (Exception | NullPointerException e) {
                h.a(c.a, e);
            }
        }
    };
    public static final String a = "c";
    public static long c;
    /* access modifiers changed from: private */
    public static Context f;
    private static Resources g;
    /* access modifiers changed from: private */
    public static com.haruhi.lex.mndfake.mnt.c h;
    private static ProgressDialog i;
    /* access modifiers changed from: private */
    public static MenuItem j;
    private static Toolbar k;
    private static Button l;
    private static Button m;
    private static Button n;
    private static Button o;
    private static Button p;
    private static Button q;
    private static RelativeLayout r;
    private static RelativeLayout s;
    private static RelativeLayout t;
    private static RelativeLayout u;
    private static LinearLayout v;
    private static TextView w;
    private static TextView x;
    private static TextView y;
    private static TextView z;
    private ImageView K = null;
    private OnClickListener U = new OnClickListener() {
        public final void onClick(View view) {
            c.this.b(view);
        }
    };
    boolean b = true;
    Runnable d = new Runnable() {
        public final void run() {
            c.this.n();
        }
    };
    public BroadcastReceiver e = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if (action != null && "com.markany.aegis.vt.MSTICKER_REFRESH_VIEW".equals(action)) {
                    if (c.j != null) {
                        if (k.b(c.h)) {
                            c.j.setVisible(false);
                        } else {
                            c.j.setVisible(true);
                        }
                    }
                    c.this.j();
                    c.this.e();
                    c.this.d();
                }
            } catch (Exception | NullPointerException e) {
                h.a(c.a, e);
            }
        }
    };

    class a extends TimerTask {
        a() {
        }

        public void run() {
            try {
                if (c.E != null) {
                    c.E.post(c.this.d);
                }
            } catch (Exception | NullPointerException e) {
                h.a(c.a, e);
            }
        }
    }

    public static c a() {
        return new c();
    }

    private void a(long j2) {
        if (j2 != 0) {
            try {
                long currentTimeMillis = System.currentTimeMillis() - j2;
                x.setText(k.a(Long.valueOf(j2)));
                int i2 = (int) (currentTimeMillis / 1000);
                int i3 = i2 / 60;
                int i4 = i3 / 60;
                int i5 = i4 / 24;
                int i6 = i2 % 60;
                int i7 = i3 % 60;
                int i8 = i4 % 24;
                B.setText(String.format("%d", new Object[]{Integer.valueOf(i5)}));
                C.setText(String.format("%02d", new Object[]{Integer.valueOf(i8)}));
                D.setText(String.format("%02d", new Object[]{Integer.valueOf(i7)}));
                E.setText(String.format("%02d", new Object[]{Integer.valueOf(i6)}));
            } catch (Exception | NullPointerException e2) {
                h.a(a, e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x013c A[Catch:{ Exception | NullPointerException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x015f A[Catch:{ Exception | NullPointerException -> 0x01a8 }] */
    private void a(View view) {
        int i2;
        ImageView imageView;
        Drawable a2;
        try {
            k = (Toolbar) getActivity().findViewById(R.id.toolbar);
            L = (ProgressBar) view.findViewById(R.id.pdProgress);
            M = (ProgressBar) view.findViewById(R.id.pdProgressOF);
            m = (Button) view.findViewById(R.id.btnCameraDeny);
            m.setOnClickListener(this.U);
            n = (Button) view.findViewById(R.id.btnCameraAllow);
            l = (Button) view.findViewById(R.id.btnCameraAllowPure);
            l.setOnClickListener(this.U);
            n.setOnClickListener(this.U);
            o = (Button) view.findViewById(R.id.btnCameraAllowFull);
            o.setOnClickListener(this.U);
            q = (Button) view.findViewById(R.id.btnAddFuncAllow);
            q.setOnClickListener(this.U);
            p = (Button) view.findViewById(R.id.btnAddFuncDeny);
            p.setOnClickListener(this.U);
            r = (RelativeLayout) view.findViewById(R.id.rlTitle);
            s = (RelativeLayout) view.findViewById(R.id.rlSubTitle);
            v = (LinearLayout) view.findViewById(R.id.llDelayTime);
            u = (RelativeLayout) view.findViewById(R.id.rlintegrity);
            w = (TextView) view.findViewById(R.id.tvCheckInTimeTitle);
            x = (TextView) view.findViewById(R.id.tvCheckInTim);
            G = (ImageView) view.findViewById(R.id.ivCameraSticker);
            I = (ImageView) view.findViewById(R.id.ivPolicys);
            J = (ImageView) view.findViewById(R.id.ivPolicysMain);
            this.K = (ImageView) view.findViewById(R.id.ivViolation);
            H = (ImageView) view.findViewById(R.id.ivCompany);
            if (!f.getPackageName().equals("kr.go.mnd.mmsa")) {
                if (d.c().equalsIgnoreCase("HUAWEI")) {
                    i2 = R.drawable.img_common_company_huawei;
                } else if (d.c().equalsIgnoreCase("Xiaomi")) {
                    i2 = R.drawable.img_common_company_xiaomi;
                }
                if (i2 == 0) {
                    if (VERSION.SDK_INT < 21) {
                        imageView = H;
                        a2 = getResources().getDrawable(i2);
                    } else {
                        imageView = H;
                        a2 = androidx.core.content.a.a(f, i2);
                    }
                    imageView.setBackground(a2);
                    H.setVisibility(0);
                } else {
                    H.setVisibility(4);
                }
                B = (TextView) view.findViewById(R.id.tvDay);
                C = (TextView) view.findViewById(R.id.tvHour);
                D = (TextView) view.findViewById(R.id.tvMin);
                E = (TextView) view.findViewById(R.id.tvSec);
                z = (TextView) view.findViewById(R.id.tvInstallDate);
                A = (TextView) view.findViewById(R.id.tvAgentVersion);
            }
            i2 = 0;
            if (i2 == 0) {
            }
            B = (TextView) view.findViewById(R.id.tvDay);
            C = (TextView) view.findViewById(R.id.tvHour);
            D = (TextView) view.findViewById(R.id.tvMin);
            E = (TextView) view.findViewById(R.id.tvSec);
            z = (TextView) view.findViewById(R.id.tvInstallDate);
            A = (TextView) view.findViewById(R.id.tvAgentVersion);
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00fb, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0139, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x013b;
     */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface, int i2) {
        String str2;
        Context context;
        Intent intent;
        if (!b.b(f)) {
            k.b();
            h.c(a, getString(R.string.error_code_deviceadmin_disable));
            return;
        }
        h.a(f, a, getString(R.string.mndmdm_common_all_func_deny), getString(R.string.mndmdm_manual));
        Intent intent2 = new Intent(f, ServiceAlert.class);
        intent2.putExtra("alert_type", 2);
        if (!k.c(f, ServiceAlert.class.getName()).booleanValue()) {
            f.startService(intent2);
        } else {
            new Handler().postDelayed(new Runnable(intent2) {
                private final /* synthetic */ Intent f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    c.f.startService(this.f$0);
                }
            }, 1000);
        }
        if (str.equals("4DMNP7bf5yNdhf+GZ7H7mA==")) {
            context = f;
            str2 = "mndmdm1";
        } else {
            context = f;
            str2 = "mndmdm2";
        }
        CompanyInfoN a2 = com.haruhi.lex.mndfake.mnt.g.a(context, str2);
        a(a2);
        if (!k.b(h)) {
            k.b(f, "on");
            h.a("CompanyInfo", "device_second_lock_time", String.valueOf(System.currentTimeMillis()));
            h.a("CompanyInfo", "company_info_company_second_code", a2.a());
            h.a("CompanyInfo", "company_info_company_second_name", a2.b());
        }
        if (com.haruhi.lex.mndfake.a.a.a(f) == 1) {
            if (d.c().equals(getResources().getString(R.string.manufacture_code_samsung))) {
                h.a("ConfigInfo", ServicePolicyMFSS.class.getName(), "on");
                intent = new Intent(f, ServicePolicyMFSS.class);
                Context context2 = f;
                if (com.haruhi.lex.mndfake.mnt.a.b(context2, context2.getPackageName()) >= 26) {
                }
                f.startService(intent);
            } else if (d.c().equals(getResources().getString(R.string.manufacture_code_lg))) {
                h.a("ConfigInfo", ServicePolicyMFLG.class.getName(), "on");
                intent = new Intent(f, ServicePolicyMFLG.class);
                Context context3 = f;
                if (com.haruhi.lex.mndfake.mnt.a.b(context3, context3.getPackageName()) >= 26) {
                }
                f.startService(intent);
            }
            f.startForegroundService(intent);
        }
        f.sendBroadcast(new Intent("com.markany.aegis.vt.MSTICKER_REFRESH_VIEW"));
        e();
        d();
    }

    private void a(CompanyInfoN companyInfoN) {
        Intent intent;
        Context context;
        Context context2;
        try {
            if (f != null) {
                com.haruhi.lex.mndfake.mnt.c a2 = com.haruhi.lex.mndfake.mnt.c.a(f);
                a2.a("CompanyInfo", "company_info_company_code", companyInfoN.a());
                a2.a("CompanyInfo", "company_info_company_name", companyInfoN.b());
                a2.a("CompanyInfo", "company_info_has_init_info", "on");
                a2.a("CompanyInfo", "company_info_agree_terms", "on");
                k.a(f, "on");
                a2.a("CompanyInfo", "device_lock_time", String.valueOf(System.currentTimeMillis()));
                a2.a("DeviceInfo", "device_model", d.b());
                f.a(f, true);
                if (companyInfoN.c() != null) {
                    companyInfoN.c().length();
                }
                if (com.haruhi.lex.mndfake.a.a.a(f) != 1) {
                    h.a("ConfigInfo", ServicePolicy.class.getName(), "on");
                    intent = new Intent(f, ServicePolicy.class);
                    if (com.haruhi.lex.mndfake.mnt.a.b(f, f.getPackageName()) < 26 || VERSION.SDK_INT < 26) {
                        context = f;
                        context.startService(intent);
                        return;
                    }
                    context2 = f;
                } else if (d.c().equals(getResources().getString(R.string.manufacture_code_samsung))) {
                    h.a("ConfigInfo", ServicePolicyMFSS.class.getName(), "on");
                    intent = new Intent(f, ServicePolicyMFSS.class);
                    if (com.haruhi.lex.mndfake.mnt.a.b(f, f.getPackageName()) < 26 || VERSION.SDK_INT < 26) {
                        context = f;
                        context.startService(intent);
                        return;
                    }
                    context2 = f;
                } else if (d.c().equals(getResources().getString(R.string.manufacture_code_lg))) {
                    h.a("ConfigInfo", ServicePolicyMFLG.class.getName(), "on");
                    intent = new Intent(f, ServicePolicyMFLG.class);
                    if (com.haruhi.lex.mndfake.mnt.a.b(f, f.getPackageName()) < 26 || VERSION.SDK_INT < 26) {
                        context = f;
                        context.startService(intent);
                        return;
                    }
                    context2 = f;
                } else {
                    return;
                }
                context2.startForegroundService(intent);
            }
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008b, code lost:
        r8.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x018c, code lost:
        if ("PPzpM+nXRtEukMUoJl/9jw==".equals(com.haruhi.lex.mndfake.mnt.c.c(f)) == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0194, code lost:
        if (com.haruhi.lex.mndfake.b.b.b(f) != false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0196, code lost:
        com.haruhi.lex.mndfake.mnt.k.b();
        com.haruhi.lex.mndfake.mnt.h.c(a, getString(com.haruhi.lex.mndfake.R.string.error_code_deviceadmin_disable));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a9, code lost:
        if (N == null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01ab, code lost:
        N.dismiss();
        N = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01b2, code lost:
        N = new android.app.Dialog(f);
        r8 = (android.widget.RelativeLayout) android.view.View.inflate(f, com.haruhi.lex.mndfake.R.layout.layout_dialog_common_2button_mnd, null);
        r1 = (android.widget.TextView) r8.findViewById(com.haruhi.lex.mndfake.R.id.tvTitle);
        r2 = (android.widget.TextView) r8.findViewById(com.haruhi.lex.mndfake.R.id.tvDescription);
        r3 = (android.widget.Button) r8.findViewById(com.haruhi.lex.mndfake.R.id.btnOK);
        r3.setText(com.haruhi.lex.mndfake.R.string.mndmdm_common_camera_allow_bluetooth);
        r4 = (android.widget.Button) r8.findViewById(com.haruhi.lex.mndfake.R.id.btnCancel);
        r4.setText(com.haruhi.lex.mndfake.R.string.mndmdm_common_camera_allow_location);
        r1.setText(com.haruhi.lex.mndfake.R.string.mndmdm_common_camera_allow_method);
        r2.setVisibility(8);
        r3.setOnClickListener(new com.haruhi.lex.mndfake.activity.$$Lambda$c$Ov1EZotnW_3bXQ53fYYpcUgkzKY(r7));
        r4.setOnClickListener(new com.haruhi.lex.mndfake.activity.$$Lambda$c$_3kUpUDlV6mMQ82PhpJ2eExhs4U(r7));
        N.requestWindowFeature(1);
        N.setContentView(r8);
        N.setCancelable(true);
        N.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0226, code lost:
        l();
     */
    public /* synthetic */ void b(View view) {
        Builder negativeButton;
        try {
            int id = view.getId();
            switch (id) {
                case R.id.btnAddFuncAllow /*2131165228*/:
                    break;
                case R.id.btnAddFuncDeny /*2131165229*/:
                    if (com.haruhi.lex.mndfake.a.a.a(f) != 1) {
                        k.b(f, (int) R.string.mndmdm_common_add_func_not_support);
                        return;
                    }
                    negativeButton = new Builder(f, 2131558674).setTitle(R.string.mndmdm_common_add_func_deny).setMessage(R.string.mndmdm_checkin_sec_desc).setCancelable(false).setPositiveButton(R.string.common___ok, new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            c.this.c(dialogInterface, i);
                        }
                    }).setNegativeButton(R.string.common___cancel, $$Lambda$c$OKgjOXgNkknFSx4tlmtEwtphjpk.INSTANCE);
                default:
                    switch (id) {
                        case R.id.btnCameraAllow /*2131165235*/:
                        case R.id.btnCameraAllowFull /*2131165236*/:
                        case R.id.btnCameraAllowPure /*2131165237*/:
                            break;
                        case R.id.btnCameraDeny /*2131165238*/:
                            if ((f.getPackageName().equals("com.haruhi.lex.mndfake.of") || f.getPackageName().equals("com.haruhi.lex.mndfake.vt")) && !b()) {
                                k.d(f, getResources().getString(R.string.nfc_msg_not_support_manufacture));
                                break;
                            } else {
                                String b2 = h.b("CompanyInfo", "company_info_auth_code", "");
                                if (c()) {
                                    if (b()) {
                                        negativeButton = new Builder(f, 2131558674).setTitle(R.string.mndmdm_common_all_func_deny).setMessage(R.string.mndmdm_checkin_emp_desc).setCancelable(false).setPositiveButton(R.string.common___ok, new DialogInterface.OnClickListener(b2) {
                                            private final /* synthetic */ String f$1;

                                            {
                                                this.f$1 = r2;
                                            }

                                            public final void onClick(DialogInterface dialogInterface, int i) {
                                                c.this.a(this.f$1, dialogInterface, i);
                                            }
                                        }).setNegativeButton(R.string.common___cancel, $$Lambda$c$L8kp1ITSJ1u9iKa9ghYozuG3uM.INSTANCE);
                                    }
                                } else if (!d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_samsung)) && !d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_lg)) && !d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_pantech)) && !d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_xiaomi))) {
                                    if (!d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_huawei))) {
                                        Builder builder = new Builder(f, 2131558674);
                                        builder.setCancelable(false);
                                        builder.setMessage(R.string.toast___not_support_manufacture);
                                        builder.setPositiveButton(R.string.common___ok, $$Lambda$c$42L_wkHbxIEmsIMwPvywLOODcc.INSTANCE);
                                        builder.setNegativeButton(R.string.common___cancel, new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                            }
                                        });
                                        builder.show();
                                        return;
                                    }
                                }
                                negativeButton = new Builder(f, 2131558674).setTitle(R.string.mndmdm_common_camera_deny).setMessage(R.string.mndmdm_checkin_desc).setCancelable(false).setPositiveButton(R.string.common___ok, new DialogInterface.OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        c.this.e(dialogInterface, i);
                                    }
                                }).setNegativeButton(R.string.common___cancel, $$Lambda$c$J8OX1X2aq72cISVom_pjMrw1HZE.INSTANCE);
                            }
                            break;
                    }
            }
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00f3, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0131, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x015a, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x015c;
     */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i2) {
        Intent intent;
        if (!b.b(f)) {
            k.b();
            h.c(a, getString(R.string.error_code_deviceadmin_disable));
            return;
        }
        if (k.a(h)) {
            h.a(f, a, getString(R.string.mndmdm_common_add_func_deny), getString(R.string.mndmdm_manual));
            Intent intent2 = new Intent(f, ServiceAlert.class);
            intent2.putExtra("alert_type", 2);
            if (!k.c(f, ServiceAlert.class.getName()).booleanValue()) {
                f.startService(intent2);
            } else {
                new Handler().postDelayed(new Runnable(intent2) {
                    private final /* synthetic */ Intent f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void run() {
                        c.f.startService(this.f$0);
                    }
                }, 1000);
            }
            CompanyInfoN a2 = com.haruhi.lex.mndfake.mnt.g.a(f, "mndmdm2");
            if (!k.b(h)) {
                k.b(f, "on");
                h.a("CompanyInfo", "device_second_lock_time", String.valueOf(System.currentTimeMillis()));
                h.a("CompanyInfo", "company_info_company_second_code", a2.a());
                h.a("CompanyInfo", "company_info_company_second_name", a2.b());
            }
            if (com.haruhi.lex.mndfake.a.a.a(f) != 1) {
                h.a("ConfigInfo", ServicePolicy.class.getName(), "on");
                intent = new Intent(f, ServicePolicy.class);
                Context context = f;
                if (com.haruhi.lex.mndfake.mnt.a.b(context, context.getPackageName()) >= 26) {
                }
                f.startService(intent);
            } else if (d.c().equals(getResources().getString(R.string.manufacture_code_samsung))) {
                h.a("ConfigInfo", ServicePolicyMFSS.class.getName(), "on");
                intent = new Intent(f, ServicePolicyMFSS.class);
                Context context2 = f;
                if (com.haruhi.lex.mndfake.mnt.a.b(context2, context2.getPackageName()) >= 26) {
                }
                f.startService(intent);
            } else if (d.c().equals(getResources().getString(R.string.manufacture_code_lg))) {
                h.a("ConfigInfo", ServicePolicyMFLG.class.getName(), "on");
                intent = new Intent(f, ServicePolicyMFLG.class);
                Context context3 = f;
                if (com.haruhi.lex.mndfake.mnt.a.b(context3, context3.getPackageName()) >= 26) {
                }
                f.startService(intent);
            }
            f.startForegroundService(intent);
        }
        f.sendBroadcast(new Intent("com.markany.aegis.vt.MSTICKER_REFRESH_VIEW"));
        h.a(f, a, getString(R.string.mndmdm_common_add_func_deny), getString(R.string.mndmdm_manual));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        try {
            if (N != null) {
                N.dismiss();
                N = null;
            }
            m();
        } catch (Exception e2) {
            h.a(a, e2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(DialogInterface dialogInterface, int i2) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        try {
            if (N != null) {
                N.dismiss();
                N = null;
            }
            l();
        } catch (Exception e2) {
            h.a(a, e2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(DialogInterface dialogInterface, int i2) {
        if (b.b(f) && b.c(f) != null) {
            h.a(f, a, getString(R.string.mndmdm_common_camera_deny), getString(R.string.mndmdm_manual));
            a(com.haruhi.lex.mndfake.mnt.g.a(f, "mndmdm"));
            f.sendBroadcast(new Intent("com.markany.aegis.vt.MSTICKER_REFRESH_VIEW"));
            e();
            d();
            Intent intent = new Intent(f, ServiceAlert.class);
            intent.putExtra("alert_type", 1);
            if (!k.c(f, ServiceAlert.class.getName()).booleanValue()) {
                f.startService(intent);
            } else {
                new Handler().postDelayed(new Runnable(intent) {
                    private final /* synthetic */ Intent f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void run() {
                        c.f.startService(this.f$0);
                    }
                }, 1000);
            }
            return;
        }
        k.b();
        h.c(a, getString(R.string.error_code_deviceadmin_disable));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(DialogInterface dialogInterface, int i2) {
        try {
            k.b();
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g(DialogInterface dialogInterface, int i2) {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x04bd A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x04df A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0550 A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0561 A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0574 A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x059f A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x05d9 A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x05e8 A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009d A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ab A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c2 A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0116 A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x023b A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0242 A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02bb A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02c9 A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02e0 A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0358 A[Catch:{ Exception | NullPointerException -> 0x05f5 }] */
    public void j() {
        ProgressBar progressBar;
        ImageView imageView;
        Drawable a2;
        RelativeLayout relativeLayout;
        Drawable a3;
        Button button;
        Drawable a4;
        ProgressBar progressBar2;
        ImageView imageView2;
        Drawable a5;
        RelativeLayout relativeLayout2;
        Drawable a6;
        RelativeLayout relativeLayout3;
        Drawable a7;
        ProgressBar progressBar3;
        ImageView imageView3;
        Drawable a8;
        ImageView imageView4;
        RelativeLayout relativeLayout4;
        Drawable a9;
        try {
            int i2 = 0;
            if (!d.b(f)) {
                u.setVisibility(0);
                k.a(getContext(), (int) R.string.common___invalid_app_not_installed_integrity);
            }
            String c2 = com.haruhi.lex.mndfake.mnt.c.c(f);
            if (k.b(h)) {
                if (!f.getPackageName().equals("com.haruhi.lex.mndfake.of")) {
                    if (!f.getPackageName().equals("com.haruhi.lex.mndfake.vt")) {
                        progressBar3 = L;
                        progressBar3.setVisibility(0);
                        q.setVisibility(0);
                        m.setVisibility(4);
                        n.setVisibility(4);
                        p.setVisibility(4);
                        o.setVisibility(4);
                        v.setVisibility(0);
                        w.setVisibility(0);
                        x.setVisibility(0);
                        if (VERSION.SDK_INT >= 21) {
                            imageView3 = G;
                            a8 = getResources().getDrawable(R.drawable.img_policy_state_addition_block);
                        } else {
                            imageView3 = G;
                            a8 = androidx.core.content.a.a(f, (int) R.drawable.img_policy_state_addition_block);
                        }
                        imageView3.setImageDrawable(a8);
                        if (!f.getPackageName().equals("kr.go.mnd.mmsa")) {
                            if ("msGoLhcVq0dT7rv3dI+HDw==".equals(c2)) {
                                if (VERSION.SDK_INT < 21) {
                                    k.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_soldier_yellow));
                                    r.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_soldier_yellow));
                                    relativeLayout4 = s;
                                    a9 = getResources().getDrawable(R.drawable.img_bg_user_soldier_sub);
                                } else {
                                    k.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_soldier_yellow));
                                    r.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_soldier_yellow));
                                    relativeLayout4 = s;
                                    a9 = androidx.core.content.a.a(f, (int) R.drawable.img_bg_user_soldier_sub);
                                }
                            }
                            if (h.b("CompanyInfo", "company_info_auth_code", "").equals("h/Q2JBll4LTBwoGyyP9JeQ==")) {
                                imageView4 = I;
                            } else if (c()) {
                                I.setVisibility(4);
                                imageView4 = J;
                            } else {
                                i2 = 8;
                                I.setVisibility(8);
                                imageView4 = J;
                            }
                            imageView4.setVisibility(i2);
                            return;
                        } else if (f.getPackageName().equals("com.haruhi.lex.mndfake.of")) {
                            if (MntData.b.contains(c2)) {
                                if (VERSION.SDK_INT < 21) {
                                    k.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_employee));
                                    r.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_employee));
                                    relativeLayout4 = s;
                                    a9 = getResources().getDrawable(R.drawable.img_bg_user_officer_sub);
                                } else {
                                    k.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_employee));
                                    r.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_employee));
                                    relativeLayout4 = s;
                                    a9 = androidx.core.content.a.a(f, (int) R.drawable.img_bg_user_officer_sub);
                                }
                            }
                            if (h.b("CompanyInfo", "company_info_auth_code", "").equals("h/Q2JBll4LTBwoGyyP9JeQ==")) {
                            }
                            imageView4.setVisibility(i2);
                            return;
                        } else {
                            if (f.getPackageName().equals("com.haruhi.lex.mndfake.vt")) {
                                if (MntData.c.contains(c2)) {
                                    if (VERSION.SDK_INT < 21) {
                                        k.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_regular_visitor));
                                        r.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_regular_visitor));
                                        relativeLayout4 = s;
                                        a9 = getResources().getDrawable(R.drawable.img_bg_user_regular_guest_sub);
                                    } else {
                                        k.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_regular_visitor));
                                        r.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_regular_visitor));
                                        relativeLayout4 = s;
                                        a9 = androidx.core.content.a.a(f, (int) R.drawable.img_bg_user_regular_guest_sub);
                                    }
                                } else if ("PPzpM+nXRtEukMUoJl/9jw==".equals(c2)) {
                                    if (VERSION.SDK_INT < 21) {
                                        k.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_visitor));
                                        r.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_visitor));
                                        relativeLayout4 = s;
                                        a9 = getResources().getDrawable(R.drawable.img_bg_user_visitor_sub);
                                    } else {
                                        k.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_visitor));
                                        r.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_visitor));
                                        relativeLayout4 = s;
                                        a9 = androidx.core.content.a.a(f, (int) R.drawable.img_bg_user_visitor_sub);
                                    }
                                }
                            }
                            if (h.b("CompanyInfo", "company_info_auth_code", "").equals("h/Q2JBll4LTBwoGyyP9JeQ==")) {
                            }
                            imageView4.setVisibility(i2);
                            return;
                        }
                        relativeLayout4.setBackground(a9);
                        if (h.b("CompanyInfo", "company_info_auth_code", "").equals("h/Q2JBll4LTBwoGyyP9JeQ==")) {
                        }
                        imageView4.setVisibility(i2);
                        return;
                    }
                }
                L.setVisibility(8);
                progressBar3 = M;
                progressBar3.setVisibility(0);
                q.setVisibility(0);
                m.setVisibility(4);
                n.setVisibility(4);
                p.setVisibility(4);
                o.setVisibility(4);
                v.setVisibility(0);
                w.setVisibility(0);
                x.setVisibility(0);
                if (VERSION.SDK_INT >= 21) {
                }
                imageView3.setImageDrawable(a8);
                if (!f.getPackageName().equals("kr.go.mnd.mmsa")) {
                }
                relativeLayout4.setBackground(a9);
                if (h.b("CompanyInfo", "company_info_auth_code", "").equals("h/Q2JBll4LTBwoGyyP9JeQ==")) {
                }
                imageView4.setVisibility(i2);
                return;
            }
            I.setVisibility(8);
            J.setVisibility(8);
            if (k.a(h)) {
                if (!f.getPackageName().equals("com.haruhi.lex.mndfake.of")) {
                    if (!f.getPackageName().equals("com.haruhi.lex.mndfake.vt")) {
                        progressBar2 = L;
                        progressBar2.setVisibility(0);
                        m.setVisibility(4);
                        o.setVisibility(0);
                        v.setVisibility(0);
                        w.setVisibility(0);
                        x.setVisibility(0);
                        if (VERSION.SDK_INT >= 21) {
                            imageView2 = G;
                            a5 = getResources().getDrawable(R.drawable.img_policy_state_camera_block);
                        } else {
                            imageView2 = G;
                            a5 = androidx.core.content.a.a(f, (int) R.drawable.img_policy_state_camera_block);
                        }
                        imageView2.setImageDrawable(a5);
                        if (f.getPackageName().equals("kr.go.mnd.mmsa")) {
                            if (f.getPackageName().equals("com.haruhi.lex.mndfake.of")) {
                                if (MntData.b.contains(c2)) {
                                    if (!b()) {
                                        p.setVisibility(4);
                                        n.setVisibility(4);
                                        l.setVisibility(0);
                                    }
                                    if (VERSION.SDK_INT < 21) {
                                        k.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_employee));
                                        r.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_employee));
                                        relativeLayout2 = s;
                                        a6 = getResources().getDrawable(R.drawable.img_bg_user_officer_sub);
                                    } else {
                                        k.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_employee));
                                        r.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_employee));
                                        relativeLayout2 = s;
                                        a6 = androidx.core.content.a.a(f, (int) R.drawable.img_bg_user_officer_sub);
                                    }
                                }
                            } else if (f.getPackageName().equals("com.haruhi.lex.mndfake.vt")) {
                                if (MntData.c.contains(c2)) {
                                    if (!b()) {
                                        p.setVisibility(4);
                                        n.setVisibility(4);
                                        l.setVisibility(0);
                                    }
                                    if (VERSION.SDK_INT < 21) {
                                        k.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_regular_visitor));
                                        r.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_regular_visitor));
                                        relativeLayout2 = s;
                                        a6 = getResources().getDrawable(R.drawable.img_bg_user_regular_guest_sub);
                                    } else {
                                        k.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_regular_visitor));
                                        r.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_regular_visitor));
                                        relativeLayout2 = s;
                                        a6 = androidx.core.content.a.a(f, (int) R.drawable.img_bg_user_regular_guest_sub);
                                    }
                                } else if ("PPzpM+nXRtEukMUoJl/9jw==".equals(c2)) {
                                    if (b()) {
                                        p.setVisibility(4);
                                        n.setVisibility(4);
                                        l.setVisibility(0);
                                    }
                                    n.setVisibility(4);
                                    p.setVisibility(4);
                                    o.setVisibility(0);
                                    if (VERSION.SDK_INT < 21) {
                                        k.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_visitor));
                                        r.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_visitor));
                                        relativeLayout2 = s;
                                        a6 = getResources().getDrawable(R.drawable.img_bg_user_visitor_sub);
                                    } else {
                                        k.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_visitor));
                                        r.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_visitor));
                                        relativeLayout2 = s;
                                        a6 = androidx.core.content.a.a(f, (int) R.drawable.img_bg_user_visitor_sub);
                                    }
                                }
                            }
                            relativeLayout2.setBackground(a6);
                        } else if ("msGoLhcVq0dT7rv3dI+HDw==".equals(c2)) {
                            if ("msGoLhcVq0dT7rv3dI+HDw==".equals(c2)) {
                                n.setVisibility(4);
                                p.setVisibility(4);
                                o.setVisibility(0);
                            }
                            if (VERSION.SDK_INT < 21) {
                                k.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_soldier_yellow));
                                r.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_soldier_yellow));
                                relativeLayout3 = s;
                                a7 = getResources().getDrawable(R.drawable.img_bg_user_soldier_sub);
                            } else {
                                k.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_soldier_yellow));
                                r.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_soldier_yellow));
                                relativeLayout3 = s;
                                a7 = androidx.core.content.a.a(f, (int) R.drawable.img_bg_user_soldier_sub);
                            }
                            relativeLayout3.setBackground(a7);
                            I.setVisibility(8);
                            J.setVisibility(8);
                        }
                        if (VERSION.SDK_INT >= 21) {
                            p.setBackground(getResources().getDrawable(R.drawable.style_mndmdm_btn_small_deny));
                            button = n;
                            a4 = getResources().getDrawable(R.drawable.style_mndmdm_btn_small_allow);
                        } else {
                            p.setBackground(androidx.core.content.a.a(f, (int) R.drawable.style_mndmdm_btn_small_deny));
                            button = n;
                            a4 = androidx.core.content.a.a(f, (int) R.drawable.style_mndmdm_btn_small_allow);
                        }
                    }
                }
                L.setVisibility(8);
                progressBar2 = M;
                progressBar2.setVisibility(0);
                m.setVisibility(4);
                o.setVisibility(0);
                v.setVisibility(0);
                w.setVisibility(0);
                x.setVisibility(0);
                if (VERSION.SDK_INT >= 21) {
                }
                imageView2.setImageDrawable(a5);
                if (f.getPackageName().equals("kr.go.mnd.mmsa")) {
                }
                if (VERSION.SDK_INT >= 21) {
                }
            } else {
                if (!f.getPackageName().equals("com.haruhi.lex.mndfake.of")) {
                    if (!f.getPackageName().equals("com.haruhi.lex.mndfake.vt")) {
                        progressBar = L;
                        progressBar.setVisibility(4);
                        m.setVisibility(0);
                        n.setVisibility(4);
                        p.setVisibility(4);
                        q.setVisibility(4);
                        o.setVisibility(4);
                        v.setVisibility(4);
                        w.setVisibility(4);
                        x.setVisibility(4);
                        if (VERSION.SDK_INT >= 21) {
                            imageView = G;
                            a2 = getResources().getDrawable(R.drawable.img_policy_state_camera_allow);
                        } else {
                            imageView = G;
                            a2 = androidx.core.content.a.a(f, (int) R.drawable.img_policy_state_camera_allow);
                        }
                        imageView.setImageDrawable(a2);
                        if (VERSION.SDK_INT >= 21) {
                            k.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_unlock_red));
                            r.setBackground(getResources().getDrawable(R.color.common_mndmdm_background_unlock_red));
                            relativeLayout = s;
                            a3 = getResources().getDrawable(R.drawable.img_bg_user_out_sub);
                        } else {
                            k.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_unlock_red));
                            r.setBackground(androidx.core.content.a.a(f, (int) R.color.common_mndmdm_background_unlock_red));
                            relativeLayout = s;
                            a3 = androidx.core.content.a.a(f, (int) R.drawable.img_bg_user_out_sub);
                        }
                        relativeLayout.setBackground(a3);
                        if (b() && c()) {
                            m.setText(R.string.mndmdm_common_all_func_deny);
                        }
                        if (VERSION.SDK_INT >= 21) {
                            button = m;
                            a4 = getResources().getDrawable(R.drawable.style_mndmdm_btn_deny);
                        } else {
                            button = m;
                            a4 = androidx.core.content.a.a(f, (int) R.drawable.style_mndmdm_btn_deny);
                        }
                    }
                }
                L.setVisibility(4);
                progressBar = M;
                progressBar.setVisibility(4);
                m.setVisibility(0);
                n.setVisibility(4);
                p.setVisibility(4);
                q.setVisibility(4);
                o.setVisibility(4);
                v.setVisibility(4);
                w.setVisibility(4);
                x.setVisibility(4);
                if (VERSION.SDK_INT >= 21) {
                }
                imageView.setImageDrawable(a2);
                if (VERSION.SDK_INT >= 21) {
                }
                relativeLayout.setBackground(a3);
                m.setText(R.string.mndmdm_common_all_func_deny);
                if (VERSION.SDK_INT >= 21) {
                }
            }
            button.setBackground(a4);
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b0 A[Catch:{ Exception | NullPointerException -> 0x00e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00cb A[Catch:{ Exception | NullPointerException -> 0x00e3 }] */
    private boolean k() {
        StringBuilder sb;
        Long valueOf;
        try {
            f = getContext();
            h = com.haruhi.lex.mndfake.mnt.c.a(getContext());
            if (A != null) {
                A.setText(com.haruhi.lex.mndfake.mnt.a.a(f, f.getPackageName()));
            }
            if (k.b(h)) {
                valueOf = Long.valueOf(h.b("CompanyInfo", "device_second_lock_time", WifiAdminProfile.PHASE1_DISABLE));
            } else {
                if (k.a(h)) {
                    valueOf = Long.valueOf(h.b("CompanyInfo", "device_lock_time", WifiAdminProfile.PHASE1_DISABLE));
                }
                j();
                z.setText(com.haruhi.lex.mndfake.mnt.a.c(f, f.getPackageName()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e.a(getContext(), "/MobileSticker/task/"));
                sb2.append("ConfigMndMDM.json");
                String sb3 = sb2.toString();
                e.a(getContext(), "ConfigMndMDM.json", sb3);
                ArrayList b2 = com.haruhi.lex.mndfake.mnt.g.b(sb3);
                if (b2 == null || b2.size() == 0) {
                    k.a(getContext(), (int) R.string.qrcode_toast_init_failed);
                }
                if (!k.b(h)) {
                    sb = new StringBuilder();
                    sb.append(e.a(getContext(), "/MobileSticker/task/"));
                    sb.append("sec_company_icon.png");
                } else {
                    sb = new StringBuilder();
                    sb.append(e.a(getContext(), "/MobileSticker/task/"));
                    sb.append("company_icon.png");
                }
                sb.toString();
                return true;
            }
            valueOf.longValue();
            j();
            z.setText(com.haruhi.lex.mndfake.mnt.a.c(f, f.getPackageName()));
            StringBuilder sb22 = new StringBuilder();
            sb22.append(e.a(getContext(), "/MobileSticker/task/"));
            sb22.append("ConfigMndMDM.json");
            String sb32 = sb22.toString();
            e.a(getContext(), "ConfigMndMDM.json", sb32);
            ArrayList b22 = com.haruhi.lex.mndfake.mnt.g.b(sb32);
            k.a(getContext(), (int) R.string.qrcode_toast_init_failed);
            if (!k.b(h)) {
            }
            sb.toString();
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
        return true;
    }

    private void l() {
        String str;
        try {
            LocationManager locationManager = (LocationManager) getContext().getSystemService("location");
            if (com.haruhi.lex.mndfake.a.a.a(f) != 1) {
                if (!locationManager.isProviderEnabled("gps")) {
                    if (!locationManager.isProviderEnabled("network")) {
                        k.h(getContext());
                        return;
                    }
                }
                String[] a2 = j.a(getContext(), j.j);
                if (a2.length > 0) {
                    j.a((Activity) getContext(), 5467, a2);
                    return;
                }
            } else if (j.a(f, j.j).length > 0) {
                if (d.c().equals(getResources().getString(R.string.manufacture_code_samsung))) {
                    if (VERSION.SDK_INT >= 29) {
                        j.a((Activity) f, 5467, j.j);
                        return;
                    } else {
                        com.haruhi.lex.mndfake.b.c.a(f, f.getPackageName(), j.j);
                        com.haruhi.lex.mndfake.b.c.b(f, f.getPackageName(), j.j);
                    }
                } else if (d.c().equals(getResources().getString(R.string.manufacture_code_lg))) {
                    j.a((Activity) f, 5467, j.j);
                    return;
                }
            }
            try {
                ArrayList k2 = k.k(f);
                if (k2 != null) {
                    if (!k2.isEmpty()) {
                        if (k.a(f, k2)) {
                            new Builder(f, 2131558674).setTitle(R.string.mndmdm_common_user_guide_2_desc_2_title).setMessage(R.string.mndmdm_location_request_unable_mock).setCancelable(false).setPositiveButton(R.string.common___ok, $$Lambda$c$Fc1AefipceUZavgrhpDSRlcAD9A.INSTANCE).show();
                            return;
                        }
                    }
                }
            } catch (NullPointerException e2) {
                e = e2;
                str = a;
                h.a(str, e);
                Intent intent = new Intent(f, ActivityBeacon.class);
                intent.setFlags(276824064);
                f.startActivity(intent);
            } catch (Exception e3) {
                e = e3;
                str = a;
                h.a(str, e);
                Intent intent2 = new Intent(f, ActivityBeacon.class);
                intent2.setFlags(276824064);
                f.startActivity(intent2);
            }
            Intent intent22 = new Intent(f, ActivityBeacon.class);
            intent22.setFlags(276824064);
            f.startActivity(intent22);
        } catch (Exception | NullPointerException e4) {
            h.a(a, e4);
        }
    }

    private void m() {
        Intent intent = new Intent(f, ActivityCheckOutGPS.class);
        intent.setFlags(276824064);
        f.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n() {
        try {
            a(c);
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    public void a(boolean z2) {
        this.b = z2;
    }

    public boolean b() {
        return d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_samsung)) || d.c().equalsIgnoreCase(getResources().getString(R.string.manufacture_code_lg));
    }

    public boolean c() {
        return !com.haruhi.lex.mndfake.mnt.c.c(f).equals("PPzpM+nXRtEukMUoJl/9jw==") && !com.haruhi.lex.mndfake.mnt.c.c(f).equals("msGoLhcVq0dT7rv3dI+HDw==");
    }

    public void d() {
        com.haruhi.lex.mndfake.mnt.c cVar;
        String str;
        String str2;
        String str3;
        try {
            if (k.b(h)) {
                cVar = h;
                str = "CompanyInfo";
                str2 = "device_second_lock_time";
                str3 = WifiAdminProfile.PHASE1_DISABLE;
            } else {
                cVar = h;
                str = "CompanyInfo";
                str2 = "device_lock_time";
                str3 = WifiAdminProfile.PHASE1_DISABLE;
            }
            String b2 = cVar.b(str, str2, str3);
            if (b2 != null) {
                if (b2.length() != 0) {
                    int currentTimeMillis = (int) ((System.currentTimeMillis() - Long.valueOf(b2).longValue()) / 1000);
                    int i2 = currentTimeMillis / 60;
                    int i3 = i2 / 60;
                    int i4 = i3 / 24;
                    int i5 = currentTimeMillis % 60;
                    int i6 = i2 % 60;
                    int i7 = i3 % 24;
                    B.setText(String.format("%d", new Object[]{Integer.valueOf(i4)}));
                    C.setText(String.format("%02d", new Object[]{Integer.valueOf(i7)}));
                    D.setText(String.format("%02d", new Object[]{Integer.valueOf(i6)}));
                    E.setText(String.format("%02d", new Object[]{Integer.valueOf(i5)}));
                    x.setText(k.a(Long.valueOf(b2)));
                    c = Long.valueOf(b2).longValue();
                    R = new Timer();
                    R.schedule(new a(), 1000, 200);
                }
            }
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    public void e() {
        try {
            if (R != null) {
                R.purge();
                R.cancel();
                R = null;
            }
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    public void onCreate(Bundle bundle) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" create");
        h.a(str, sb.toString());
        super.onCreate(bundle);
        try {
            setHasOptionsMenu(true);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.markany.aegis.vt.MSTICKER_REFRESH_VIEW");
            getActivity().registerReceiver(this.e, intentFilter);
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intent intent;
        Context context;
        Context context2;
        View inflate = layoutInflater.inflate(R.layout.fragment_n_rnd_mdm_main, viewGroup, false);
        try {
            f = getActivity();
            if (!d.b(f)) {
                Intent intent2 = new Intent(f, ServiceAlert.class);
                intent2.putExtra("alert_type", 40);
                if (!k.c(f, ServiceAlert.class.getName()).booleanValue()) {
                    f.startService(intent2);
                } else {
                    new Handler().postDelayed(new Runnable(intent2) {
                        private final /* synthetic */ Intent f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void run() {
                            c.f.startService(this.f$0);
                        }
                    }, 1000);
                }
            }
            g = getContext().getResources();
            h = com.haruhi.lex.mndfake.mnt.c.a(getContext());
            a(inflate);
            k();
            Message message = new Message();
            message.obj = getFragmentManager();
            T.sendMessageDelayed(message, 1000);
            if (k.a(h)) {
                if (com.haruhi.lex.mndfake.a.a.a(f) != 1) {
                    h.a("ConfigInfo", ServicePolicy.class.getName(), "on");
                    if (f != null) {
                        intent = new Intent(f, ServicePolicy.class);
                        if (com.haruhi.lex.mndfake.mnt.a.b(f, f.getPackageName()) < 26 || VERSION.SDK_INT < 26) {
                            context = f;
                            context.startService(intent);
                        } else {
                            context2 = f;
                        }
                    }
                } else if (d.c().equals(getResources().getString(R.string.manufacture_code_samsung))) {
                    h.a("ConfigInfo", ServicePolicyMFSS.class.getName(), "on");
                    intent = new Intent(f, ServicePolicyMFSS.class);
                    if (com.haruhi.lex.mndfake.mnt.a.b(f, f.getPackageName()) < 26 || VERSION.SDK_INT < 26) {
                        context = f;
                        context.startService(intent);
                    } else {
                        context2 = f;
                    }
                } else if (d.c().equals(getResources().getString(R.string.manufacture_code_lg))) {
                    h.a("ConfigInfo", ServicePolicyMFLG.class.getName(), "on");
                    if (f != null) {
                        intent = new Intent(f, ServicePolicyMFLG.class);
                        if (com.haruhi.lex.mndfake.mnt.a.b(f, f.getPackageName()) < 26 || VERSION.SDK_INT < 26) {
                            context = f;
                            context.startService(intent);
                        } else {
                            context2 = f;
                        }
                    }
                }
                context2.startForegroundService(intent);
            }
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
        return inflate;
    }

    public void onDestroy() {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" destroy");
        h.a(str, sb.toString());
        super.onDestroy();
        f = null;
        A = null;
        r = null;
        t = null;
        v = null;
        x = null;
        w = null;
        u = null;
        G = null;
        H = null;
        I = null;
        J = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        B = null;
        C = null;
        D = null;
        E = null;
        z = null;
        y = null;
        A = null;
        R = null;
        c = 0;
        try {
            getActivity().unregisterReceiver(this.e);
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getItemId();
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" pause");
        h.a(str, sb.toString());
        super.onPause();
        try {
            e();
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        try {
            menu.findItem(R.id.action_refresh_policy).setVisible(false);
            menu.findItem(R.id.action_refresh_qrcode).setVisible(false);
            menu.findItem(R.id.action_refresh_qrcode_mdm_release).setVisible(false);
            menu.findItem(R.id.action_second_area).setVisible(false);
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    public void onResume() {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" resume");
        h.a(str, sb.toString());
        super.onResume();
        try {
            k();
            e();
            if (k.a(h) || k.b(h)) {
                d();
            }
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }
}
