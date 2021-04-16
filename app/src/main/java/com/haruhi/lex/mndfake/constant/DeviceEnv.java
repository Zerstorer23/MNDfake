package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.haruhi.lex.mndfake.mnt.h;

public class DeviceEnv implements Parcelable {
    public static final Creator<DeviceEnv> CREATOR = new Creator<DeviceEnv>() {
        /* renamed from: a */
        public DeviceEnv createFromParcel(Parcel parcel) {
            return new DeviceEnv(parcel);
        }

        /* renamed from: a */
        public DeviceEnv[] newArray(int i) {
            return new DeviceEnv[i];
        }
    };
    private static final String a = "DeviceEnv";
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    public DeviceEnv() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
    }

    public DeviceEnv(Parcel parcel) {
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
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }

    public DeviceEnv(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
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
        } catch (Exception | NullPointerException e2) {
            h.a(a, e2);
        }
    }
}
