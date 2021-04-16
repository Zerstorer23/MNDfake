package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.haruhi.lex.mndfake.mnt.h;

public class SMSInfo implements Parcelable {
    public static final Creator<SMSInfo> CREATOR = new Creator<SMSInfo>() {
        /* renamed from: a */
        public SMSInfo createFromParcel(Parcel parcel) {
            return new SMSInfo(parcel);
        }

        /* renamed from: a */
        public SMSInfo[] newArray(int i) {
            return new SMSInfo[i];
        }
    };
    private static final String a = "SMSInfo";
    private String b;
    private String c;
    private String d;

    public SMSInfo() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    public SMSInfo(Parcel parcel) {
        this();
        try {
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public SMSInfo(String str, String str2, String str3) {
        this.b = "";
        this.c = "";
        this.d = "";
        this.b = str;
        this.c = str2;
        this.d = str3;
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
