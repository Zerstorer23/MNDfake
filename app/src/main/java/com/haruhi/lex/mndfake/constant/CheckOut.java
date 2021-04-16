package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.haruhi.lex.mndfake.mnt.h;

public class CheckOut implements Parcelable {
    public static final Creator<CheckOut> CREATOR = new Creator<CheckOut>() {
        /* renamed from: a */
        public CheckOut createFromParcel(Parcel parcel) {
            return new CheckOut(parcel);
        }

        /* renamed from: a */
        public CheckOut[] newArray(int i) {
            return new CheckOut[i];
        }
    };
    private static final String a = "CheckOut";
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public CheckOut() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
    }

    public CheckOut(Parcel parcel) {
        this();
        try {
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
        } catch (Exception e2) {
            h.a(a, e2);
        }
    }

    public CheckOut(String str, String str2, String str3, String str4, String str5) {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        } catch (Exception e2) {
            h.a(a, e2);
        }
    }
}
