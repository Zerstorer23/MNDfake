package com.haruhi.lex.mndfake.constant.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.haruhi.lex.mndfake.R;
import com.haruhi.lex.mndfake.mnt.MntData;
import com.haruhi.lex.mndfake.mnt.c;
import com.haruhi.lex.mndfake.mnt.d;
import com.haruhi.lex.mndfake.mnt.h;

public class e extends BaseAdapter {
    private static final String a = "e";
    private Context b = null;
    private Resources c = null;
    private int[] d = null;
    private LayoutInflater e = null;
    private int f = 0;

    public e(Context context, int i, int[] iArr) {
        this.e = (LayoutInflater) context.getSystemService("layout_inflater");
        this.b = context;
        this.c = context.getResources();
        this.d = iArr;
        this.f = i;
    }

    public void a(int[] iArr) {
        this.d = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.d[i] = iArr[i];
        }
    }

    public int getCount() {
        return this.d.length;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        Switch g;
        Switch g2;
        Switch g3;
        if (view == null) {
            try {
                view = this.e.inflate(this.f, viewGroup, false);
                bVar = new b();
                bVar.a((RelativeLayout) view.findViewById(R.id.rlListView), (ImageView) view.findViewById(R.id.ivIcon), (TextView) view.findViewById(R.id.tvTitle), (TextView) view.findViewById(R.id.tvValue), (TextView) view.findViewById(R.id.tvDetail), (ImageView) view.findViewById(R.id.ivDetail), (Switch) view.findViewById(R.id.swState));
                view.setTag(bVar);
            } catch (Exception | NullPointerException e2) {
                h.a(a, e2);
            }
        } else {
            bVar = (b) view.getTag();
        }
        if (this.d != null) {
            int i2 = this.d[i];
            bVar.c().setText(this.c.getString(i2));
            if (!(R.string.drawer_menu_app == i2 || R.string.drawer_menu_checkout == i2)) {
                if (R.string.drawer_menu_system != i2) {
                    bVar.a().setBackgroundResource(R.color.common_mndmdm_background);
                    bVar.c().setTextColor(this.b.getResources().getColor(R.color.common_base_color_txt));
                    bVar.b().setVisibility(0);
                    if (R.string.drawer_menu_user_guide == i2) {
                        bVar.b().setImageResource(R.drawable.img_ico_menu_guide);
                        bVar.d().setVisibility(8);
                        bVar.e().setVisibility(4);
                        bVar.f().setVisibility(0);
                        g = bVar.g();
                    } else if (R.string.drawer_menu_gps_checkout == i2) {
                        bVar.b().setImageResource(R.drawable.img_ico_menu_gps);
                        bVar.d().setVisibility(8);
                        bVar.e().setVisibility(4);
                        bVar.f().setVisibility(0);
                        g = bVar.g();
                    } else if (R.string.drawer_menu_sms_checkout == i2) {
                        bVar.b().setImageResource(R.drawable.img_ico_menu_sms);
                        bVar.d().setVisibility(8);
                        bVar.e().setVisibility(4);
                        bVar.f().setVisibility(0);
                        g = bVar.g();
                    } else if (R.string.drawer_menu_log == i2) {
                        bVar.b().setImageResource(R.drawable.img_ico_menu_log);
                        bVar.d().setVisibility(8);
                        bVar.e().setVisibility(4);
                        bVar.f().setVisibility(0);
                        g = bVar.g();
                    } else if (R.string.drawer_menu_faq == i2) {
                        bVar.b().setImageResource(R.drawable.img_ico_menu_log);
                        bVar.d().setVisibility(8);
                        bVar.e().setVisibility(4);
                        bVar.f().setVisibility(0);
                        g = bVar.g();
                    } else if (R.string.drawer_menu_admin == i2) {
                        bVar.b().setImageResource(R.drawable.img_ico_menu_setting);
                        String c2 = c.c(this.b);
                        String str = "";
                        if (this.b.getPackageName().equals("kr.go.mnd.mmsa")) {
                            if ("msGoLhcVq0dT7rv3dI+HDw==".equals(c2)) {
                                str = "병사용";
                            }
                        } else if (this.b.getPackageName().equals("com.haruhi.lex.mndfake.of")) {
                            boolean contains = MntData.b.contains(c2);
                        } else {
                            this.b.getPackageName().equals("com.haruhi.lex.mndfake.vt");
                        }
                        bVar.d().setText(str);
                        bVar.d().setTextColor(this.b.getResources().getColor(R.color.common_base_color_txt));
                        bVar.d().setVisibility(8);
                        bVar.e().setVisibility(4);
                        bVar.f().setVisibility(0);
                        bVar.g().setVisibility(8);
                        bVar.e().setVisibility(4);
                    } else if (R.string.drawer_menu_device_manufacture == i2) {
                        bVar.b().setImageResource(R.drawable.img_ico_check);
                        bVar.d().setVisibility(8);
                        bVar.e().setText(d.c());
                        bVar.e().setVisibility(0);
                        bVar.f().setVisibility(4);
                        bVar.g().setVisibility(8);
                        g = bVar.g();
                    } else if (R.string.drawer_menu_device_model == i2) {
                        bVar.b().setImageResource(R.drawable.img_ico_check);
                        bVar.d().setVisibility(8);
                        bVar.e().setText(d.b());
                        bVar.e().setVisibility(0);
                        bVar.f().setVisibility(4);
                        bVar.g().setVisibility(8);
                        g = bVar.g();
                    } else if (R.string.drawer_menu_device_os_version == i2) {
                        bVar.b().setImageResource(R.drawable.img_ico_check);
                        bVar.d().setVisibility(8);
                        bVar.e().setText(d.a());
                        bVar.e().setVisibility(0);
                        bVar.f().setVisibility(4);
                        g = bVar.g();
                    } else {
                        if (R.string.mndmdm_common_list_item_alert_vibration == i2) {
                            bVar.b().setImageResource(R.drawable.img_ico_menu_vibration);
                            bVar.d().setText(R.string.mndmdm_common_list_item_alert_vibration_dsc);
                            bVar.d().setVisibility(0);
                            bVar.e().setVisibility(4);
                            bVar.f().setVisibility(4);
                            bVar.g().setVisibility(0);
                            if ("on".equals(c.e(this.b))) {
                                g3 = bVar.g();
                            } else {
                                g2 = bVar.g();
                                g2.setChecked(false);
                            }
                        } else if (R.string.mndmdm_common_list_item_alert_sound == i2) {
                            bVar.b().setImageResource(R.drawable.img_ico_menu_voice);
                            bVar.d().setText(R.string.mndmdm_common_list_item_alert_sound_dsc);
                            bVar.d().setVisibility(0);
                            bVar.e().setVisibility(4);
                            bVar.f().setVisibility(4);
                            bVar.g().setVisibility(0);
                            if ("on".equals(c.f(this.b))) {
                                g3 = bVar.g();
                            } else {
                                g2 = bVar.g();
                                g2.setChecked(false);
                            }
                        }
                        g3.setChecked(true);
                    }
                    g.setVisibility(8);
                }
            }
            bVar.a().setBackgroundResource(R.color.common_menu_background);
            bVar.c().setTextColor(this.b.getResources().getColor(R.color.common_menu_list_title));
            bVar.b().setVisibility(4);
            bVar.d().setVisibility(8);
            bVar.e().setVisibility(4);
            bVar.f().setVisibility(4);
            g = bVar.g();
            g.setVisibility(8);
        }
        return view;
    }
}
