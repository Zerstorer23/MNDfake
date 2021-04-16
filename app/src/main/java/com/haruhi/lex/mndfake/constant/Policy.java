package com.haruhi.lex.mndfake.constant;

import android.app.enterprise.WifiAdminProfile;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.haruhi.lex.mndfake.mnt.h;

public class Policy implements Parcelable {
    public static final Creator<Policy> CREATOR = new Creator<Policy>() {
        /* renamed from: a */
        public Policy createFromParcel(Parcel parcel) {
            return new Policy(parcel);
        }

        /* renamed from: a */
        public Policy[] newArray(int i) {
            return new Policy[i];
        }
    };
    private static final String k = "Policy";
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    public Policy() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.a = WifiAdminProfile.PHASE1_DISABLE;
        this.b = WifiAdminProfile.PHASE1_DISABLE;
        this.c = WifiAdminProfile.PHASE1_DISABLE;
        this.d = WifiAdminProfile.PHASE1_DISABLE;
        this.e = WifiAdminProfile.PHASE1_DISABLE;
        this.f = WifiAdminProfile.PHASE1_DISABLE;
        this.g = WifiAdminProfile.PHASE1_DISABLE;
        this.h = WifiAdminProfile.PHASE1_DISABLE;
        this.i = WifiAdminProfile.PHASE1_DISABLE;
        this.j = WifiAdminProfile.PHASE1_DISABLE;
    }

    public Policy(Parcel parcel) {
        this();
        try {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.j = parcel.readString();
        } catch (Exception | NullPointerException e2) {
            h.a(k, e2);
        }
    }

    public Policy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        try {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
        } catch (Exception | NullPointerException e2) {
            h.a(k, e2);
        }
    }
}
