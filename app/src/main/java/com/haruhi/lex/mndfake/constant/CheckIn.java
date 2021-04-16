package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.haruhi.lex.mndfake.mnt.h;

public class CheckIn implements Parcelable {
    public static final Creator<CheckIn> CREATOR = new Creator<CheckIn>() {
        /* renamed from: a */
        public CheckIn createFromParcel(Parcel parcel) {
            return new CheckIn(parcel);
        }

        /* renamed from: a */
        public CheckIn[] newArray(int i) {
            return new CheckIn[i];
        }
    };
    private static final String a = "CheckIn";
    private String b;
    private String c;
    private String d;

    public CheckIn() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    public CheckIn(Parcel parcel) {
        this();
        try {
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public CheckIn(String str, String str2, String str3) {
        this.b = "";
        this.c = "";
        this.d = "";
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public String a() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }
}
