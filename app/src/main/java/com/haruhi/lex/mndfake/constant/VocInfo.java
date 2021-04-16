package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.haruhi.lex.mndfake.mnt.h;

public class VocInfo implements Parcelable {
    public static final Creator<VocInfo> CREATOR = new Creator<VocInfo>() {
        /* renamed from: a */
        public VocInfo createFromParcel(Parcel parcel) {
            return new VocInfo(parcel);
        }

        /* renamed from: a */
        public VocInfo[] newArray(int i) {
            return new VocInfo[i];
        }
    };
    private static final String e = "VocInfo";
    public String a;
    public String b;
    public String c;
    public String d;

    public VocInfo() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    public VocInfo(Parcel parcel) {
        this();
        try {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
        } catch (Exception | NullPointerException e2) {
            h.a(e, e2);
        }
    }

    public VocInfo(String str, String str2, String str3, String str4) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        } catch (Exception | NullPointerException e2) {
            h.a(e, e2);
        }
    }
}
