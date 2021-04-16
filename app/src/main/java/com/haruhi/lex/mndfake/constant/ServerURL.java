package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.haruhi.lex.mndfake.mnt.h;

public class ServerURL implements Parcelable {
    public static final Creator<ServerURL> CREATOR = new Creator<ServerURL>() {
        /* renamed from: a */
        public ServerURL createFromParcel(Parcel parcel) {
            return new ServerURL(parcel);
        }

        /* renamed from: a */
        public ServerURL[] newArray(int i) {
            return new ServerURL[i];
        }
    };
    private static final String a = "ServerURL";
    private String b;
    private String c;
    private String d;

    public ServerURL() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    public ServerURL(Parcel parcel) {
        this();
        try {
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
    }

    public ServerURL(String str, String str2, String str3) {
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
