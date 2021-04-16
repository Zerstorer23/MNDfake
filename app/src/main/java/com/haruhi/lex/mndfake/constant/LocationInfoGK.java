package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.haruhi.lex.mndfake.mnt.h;

public class LocationInfoGK implements Parcelable {
    public static final Creator<LocationInfoGK> CREATOR = new Creator<LocationInfoGK>() {
        /* renamed from: a */
        public LocationInfoGK createFromParcel(Parcel parcel) {
            return new LocationInfoGK(parcel);
        }

        /* renamed from: a */
        public LocationInfoGK[] newArray(int i) {
            return new LocationInfoGK[i];
        }
    };
    private static final String a = "LocationInfoGK";
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private int h;

    public LocationInfoGK() {
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = "";
        this.f = "";
        this.g = 0;
        this.h = 0;
        this.e = "";
        this.f = "";
        this.g = 0;
    }

    public LocationInfoGK(Parcel parcel) {
        this();
        try {
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    public LocationInfoGK(String str, String str2, String str3, int i) {
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = "";
        this.f = "";
        this.g = 0;
        this.h = 0;
        this.b = str;
        this.e = str2;
        this.f = str3;
        this.g = i;
    }

    public LocationInfoGK(String str, String str2, String str3, String str4, String str5, int i) {
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = "";
        this.f = "";
        this.g = 0;
        this.h = 0;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
    }

    public String a() {
        return this.b;
    }

    public void a(int i) {
        this.h = i;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public int d() {
        return this.g;
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }
}
