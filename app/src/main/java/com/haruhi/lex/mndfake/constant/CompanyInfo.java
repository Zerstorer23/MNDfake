package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import com.haruhi.lex.mndfake.mnt.h;

public class CompanyInfo implements Parcelable {
    public static final Creator<CompanyInfo> CREATOR = new Creator<CompanyInfo>() {
        /* renamed from: a */
        public CompanyInfo createFromParcel(Parcel parcel) {
            return new CompanyInfo(parcel);
        }

        /* renamed from: a */
        public CompanyInfo[] newArray(int i) {
            return new CompanyInfo[i];
        }
    };
    private final String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private ArrayList<VocInfo> n;
    private ArrayList<LocationInfoGK> o;
    private ArrayList<a> p;
    private Policy q;

    public CompanyInfo() {
        this.a = CompanyInfo.class.getSimpleName();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public CompanyInfo(Parcel parcel) {
        this();
        try {
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readString();
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.q = (Policy) parcel.readParcelable(Policy.class.getClassLoader());
            if (this.n != null) {
                parcel.readTypedList(this.n, VocInfo.CREATOR);
            }
            if (this.o != null) {
                parcel.readTypedList(this.o, LocationInfoGK.CREATOR);
            }
        } catch (Exception | NullPointerException e2) {
            h.a(this.a, e2);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        try {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeParcelable(this.q, i2);
            if (this.n != null) {
                parcel.writeTypedList(this.n);
            }
            if (this.o != null) {
                parcel.writeTypedList(this.o);
            }
        } catch (Exception | NullPointerException e2) {
            h.a(this.a, e2);
        }
    }
}
