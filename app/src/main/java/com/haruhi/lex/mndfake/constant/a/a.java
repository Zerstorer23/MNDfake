package com.haruhi.lex.mndfake.constant.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import com.haruhi.lex.mndfake.R;
import com.haruhi.lex.mndfake.constant.LocationInfoGK;
import com.haruhi.lex.mndfake.mnt.h;

public class a extends BaseAdapter {
    LayoutInflater a = null;
    private final String b = a.class.getSimpleName();
    private List<LocationInfoGK> c = null;
    private int d = 0;

    public a(List<LocationInfoGK> list) {
        this.c = list;
        this.d = this.c.size();
    }

    public int getCount() {
        return this.d;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        String sb;
        if (view == null) {
            try {
                Context context = viewGroup.getContext();
                if (this.a == null) {
                    this.a = (LayoutInflater) context.getSystemService("layout_inflater");
                }
                view = this.a.inflate(R.layout.layout_list_location_item, viewGroup, false);
            } catch (Exception | NullPointerException e) {
                h.a(this.b, e);
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.tvDistance);
        ((TextView) view.findViewById(R.id.tvTitle)).setText(((LocationInfoGK) this.c.get(i)).a());
        if (((LocationInfoGK) this.c.get(i)).e() > 1000) {
            double e2 = (double) ((LocationInfoGK) this.c.get(i)).e();
            Double.isNaN(e2);
            Double valueOf = Double.valueOf(e2 * 0.001d);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format("%.1f", new Object[]{valueOf}));
            sb2.append("km");
            sb = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(((LocationInfoGK) this.c.get(i)).e());
            sb3.append(" m");
            sb = sb3.toString();
        }
        textView.setText(sb);
        return view;
    }
}
