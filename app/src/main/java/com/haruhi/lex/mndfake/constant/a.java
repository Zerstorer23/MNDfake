package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.haruhi.lex.mndfake.mnt.h;

public class a {
    public static final Creator<a> g = new Creator<a>() {
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: a */
        public a[] newArray(int i) {
            return new a[i];
        }
    };
    private static final String h = "a";
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public a() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
    }

    public a(Parcel parcel) {
        this();
        try {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
        } catch (Exception | NullPointerException e2) {
            h.a(h, e2);
        }
    }
}
