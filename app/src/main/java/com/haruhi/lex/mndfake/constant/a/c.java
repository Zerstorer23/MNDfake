package com.haruhi.lex.mndfake.constant.a;

import android.app.enterprise.WifiAdminProfile;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.a.j;
import java.util.ArrayList;
import com.haruhi.lex.mndfake.R;
import com.haruhi.lex.mndfake.constant.PermissionListItem;
import com.haruhi.lex.mndfake.mnt.h;

public class c extends BaseAdapter {
    private static final String a = "c";
    private Context b = null;
    private Resources c = null;
    private LayoutInflater d = null;
    private int e = -1;
    private ArrayList<PermissionListItem> f = null;

    public c(Context context, int i, ArrayList<PermissionListItem> arrayList) {
        this.b = context;
        this.c = context.getResources();
        this.d = (LayoutInflater) context.getSystemService("layout_inflater");
        this.e = i;
        this.f = arrayList;
    }

    public int getCount() {
        return this.f.size();
    }

    public Object getItem(int i) {
        return this.f.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0197 A[Catch:{ Exception | NullPointerException -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01a7 A[Catch:{ Exception | NullPointerException -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02b1 A[Catch:{ Exception | NullPointerException -> 0x02b7 }] */
    public View getView(int i, View view, ViewGroup viewGroup) {
        d dVar;
        TextView textView;
        CharSequence charSequence;
        ImageView imageView;
        Drawable drawable;
        ImageView imageView2;
        if (view == null) {
            try {
                view = this.d.inflate(this.e, viewGroup, false);
                dVar = new d();
                dVar.a = (ImageView) view.findViewById(R.id.ivIcon);
                dVar.b = (TextView) view.findViewById(R.id.tvTitle);
                dVar.c = (TextView) view.findViewById(R.id.tvTitleDesc);
                dVar.d = (TextView) view.findViewById(R.id.tvSubTitle);
                dVar.e = (TextView) view.findViewById(R.id.tvSubDesc);
                dVar.f = (Button) view.findViewById(R.id.btnState);
                dVar.g = (ImageView) view.findViewById(R.id.ivBoard);
                view.setTag(dVar);
            } catch (Exception | NullPointerException e2) {
                h.a(a, e2);
            }
        } else {
            dVar = (d) view.getTag();
        }
        PermissionListItem permissionListItem = (PermissionListItem) this.f.get(i);
        if (permissionListItem.a != null && permissionListItem.a.length() > 0) {
            dVar.b.setText(permissionListItem.a);
            dVar.a.setVisibility(8);
            dVar.b.setVisibility(0);
            dVar.c.setVisibility(8);
            dVar.d.setVisibility(8);
            dVar.e.setVisibility(8);
            dVar.f.setVisibility(8);
            imageView2 = dVar.g;
        } else if (permissionListItem.b == null || permissionListItem.b.length() <= 0) {
            if (permissionListItem.g == 1) {
                dVar.a.setVisibility(8);
                dVar.b.setVisibility(8);
                dVar.c.setVisibility(8);
                dVar.d.setVisibility(8);
                dVar.e.setVisibility(8);
                dVar.f.setVisibility(8);
                dVar.g.setVisibility(0);
            } else {
                dVar.a.setVisibility(0);
                dVar.b.setVisibility(8);
                dVar.c.setVisibility(8);
                dVar.d.setVisibility(0);
                dVar.e.setVisibility(0);
                dVar.f.setVisibility(0);
                dVar.g.setVisibility(8);
                dVar.d.setText(permissionListItem.d);
                dVar.e.setText(permissionListItem.e);
                if (!(permissionListItem.e == null || permissionListItem.e.length() == 0)) {
                    if (permissionListItem.e.indexOf("\n") != -1) {
                        Spannable spannableString = new SpannableString(permissionListItem.e);
                        spannableString.setSpan(new ForegroundColorSpan(Color.rgb(240, 91, j.AppCompatTheme_viewInflaterClass)), permissionListItem.e.indexOf("\n"), permissionListItem.e.length(), 0);
                        textView = dVar.e;
                        charSequence = spannableString;
                        textView.setText(charSequence);
                        if (!this.b.getResources().getString(R.string.permission_camera).equalsIgnoreCase(permissionListItem.d)) {
                            imageView = dVar.a;
                            drawable = this.c.getDrawable(R.drawable.img_common_icon_policy_camera);
                        } else if (this.b.getResources().getString(R.string.permission_mic).equalsIgnoreCase(permissionListItem.d)) {
                            imageView = dVar.a;
                            drawable = this.c.getDrawable(R.drawable.img_common_icon_policy_mic);
                        } else if (this.b.getResources().getString(R.string.permission_location).equalsIgnoreCase(permissionListItem.d)) {
                            imageView = dVar.a;
                            drawable = this.c.getDrawable(R.drawable.img_common_icon_policy_location);
                        } else if (this.b.getResources().getString(R.string.permission_phone).equalsIgnoreCase(permissionListItem.d)) {
                            imageView = dVar.a;
                            drawable = this.c.getDrawable(R.drawable.img_common_icon_policy_image_phone);
                        } else if (this.b.getResources().getString(R.string.permission_storage).equalsIgnoreCase(permissionListItem.d)) {
                            imageView = dVar.a;
                            drawable = this.c.getDrawable(R.drawable.img_common_icon_policy_image_storage);
                        } else if (this.b.getResources().getString(R.string.permission_sms).equalsIgnoreCase(permissionListItem.d)) {
                            imageView = dVar.a;
                            drawable = this.c.getDrawable(R.drawable.img_common_icon_policy_image_sms);
                        } else if (this.b.getResources().getString(R.string.permission_account).equalsIgnoreCase(permissionListItem.d)) {
                            imageView = dVar.a;
                            drawable = this.c.getDrawable(R.drawable.img_common_icon_policy_account);
                        } else {
                            if (this.b.getResources().getString(R.string.permission_bluetooth).equalsIgnoreCase(permissionListItem.d) || this.b.getResources().getString(R.string.permission_bluetooth_phone).equalsIgnoreCase(permissionListItem.d)) {
                                imageView = dVar.a;
                                drawable = this.c.getDrawable(R.drawable.img_common_icon_bluetooth);
                            }
                            if (WifiAdminProfile.PHASE1_DISABLE.equals(permissionListItem.f)) {
                                dVar.f.setVisibility(8);
                            }
                        }
                        imageView.setImageDrawable(drawable);
                        if (WifiAdminProfile.PHASE1_DISABLE.equals(permissionListItem.f)) {
                        }
                    }
                }
                textView = dVar.e;
                charSequence = permissionListItem.e;
                textView.setText(charSequence);
                if (!this.b.getResources().getString(R.string.permission_camera).equalsIgnoreCase(permissionListItem.d)) {
                }
                imageView.setImageDrawable(drawable);
                if (WifiAdminProfile.PHASE1_DISABLE.equals(permissionListItem.f)) {
                }
            }
            return view;
        } else {
            dVar.c.setText(permissionListItem.b);
            dVar.a.setVisibility(8);
            dVar.b.setVisibility(8);
            dVar.c.setVisibility(0);
            dVar.d.setVisibility(8);
            dVar.e.setVisibility(8);
            dVar.f.setVisibility(8);
            imageView2 = dVar.g;
        }
        imageView2.setVisibility(8);
        return view;
    }
}
