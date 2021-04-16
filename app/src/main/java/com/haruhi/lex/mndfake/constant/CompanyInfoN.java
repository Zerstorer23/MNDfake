package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import com.haruhi.lex.mndfake.mnt.h;

public class CompanyInfoN implements Parcelable {
    public static final Creator<CompanyInfoN> CREATOR = new Creator<CompanyInfoN>() {
        /* renamed from: a */
        public CompanyInfoN createFromParcel(Parcel parcel) {
            return new CompanyInfoN(parcel);
        }

        /* renamed from: a */
        public CompanyInfoN[] newArray(int i) {
            return new CompanyInfoN[i];
        }
    };
    private final String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private ArrayList<String> f;
    private CheckIn g;
    private CheckOut h;
    private ArrayList<VocInfo> i;
    private ArrayList<LocationInfoGK> j;
    private ArrayList<a> k;
    private ArrayList<SMSInfo> l;
    private DeviceEnv m;
    private ServerURL n;
    private Policy o;

    public CompanyInfoN() {
        this.a = CompanyInfoN.class.getSimpleName();
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
    }

    public CompanyInfoN(Parcel parcel) {
        this();
        try {
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.m = (DeviceEnv) parcel.readParcelable(DeviceEnv.class.getClassLoader());
            this.n = (ServerURL) parcel.readParcelable(ServerURL.class.getClassLoader());
            if (this.f != null) {
                parcel.readStringList(this.f);
            }
            this.g = (CheckIn) parcel.readParcelable(CheckIn.class.getClassLoader());
            this.h = (CheckOut) parcel.readParcelable(CheckOut.class.getClassLoader());
            this.o = (Policy) parcel.readParcelable(Policy.class.getClassLoader());
            if (this.i != null) {
                parcel.readTypedList(this.i, VocInfo.CREATOR);
            }
            if (this.j != null) {
                parcel.readTypedList(this.j, LocationInfoGK.CREATOR);
            }
            if (this.l != null) {
                parcel.readTypedList(this.l, SMSInfo.CREATOR);
            }
        } catch (Exception | NullPointerException e2) {
            h.a(this.a, e2);
        }
    }

    public CompanyInfoN(String str, String str2, String str3, String str4, DeviceEnv deviceEnv, ServerURL serverURL, ArrayList<String> arrayList, CheckIn checkIn, CheckOut checkOut, Policy policy, ArrayList<VocInfo> arrayList2, ArrayList<LocationInfoGK> arrayList3, ArrayList<a> arrayList4, ArrayList<SMSInfo> arrayList5) {
        this.a = CompanyInfoN.class.getSimpleName();
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
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.m = deviceEnv;
        this.n = serverURL;
        this.f = arrayList;
        this.g = checkIn;
        this.h = checkOut;
        this.o = policy;
        this.i = arrayList2;
        this.j = arrayList3;
        this.k = arrayList4;
        this.l = arrayList5;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public CheckIn d() {
        return this.g;
    }

    public int describeContents() {
        return 0;
    }

    public Policy e() {
        return this.o;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        try {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeStringList(this.f);
            parcel.writeParcelable(this.g, i2);
            parcel.writeParcelable(this.h, i2);
            parcel.writeParcelable(this.m, i2);
            parcel.writeParcelable(this.n, i2);
            parcel.writeParcelable(this.o, i2);
            if (this.i != null) {
                parcel.writeTypedList(this.i);
            }
            if (this.j != null) {
                parcel.writeTypedList(this.j);
            }
            if (this.l != null) {
                parcel.writeTypedList(this.l);
            }
        } catch (Exception | NullPointerException e2) {
            h.a(this.a, e2);
        }
    }
}
