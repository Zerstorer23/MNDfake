package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.haruhi.lex.mndfake.mnt.h;

public class CheckValue implements Parcelable {
    public static final Creator<CheckValue> CREATOR = new Creator<CheckValue>() {
        /* renamed from: a */
        public CheckValue createFromParcel(Parcel parcel) {
            return new CheckValue(parcel);
        }

        /* renamed from: a */
        public CheckValue[] newArray(int i) {
            return new CheckValue[i];
        }
    };
    private static final String a = "CheckValue";
    private String b;
    private String c;
    private String d;

    public CheckValue() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    public CheckValue(Parcel parcel) {
        this();
        try {
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
        } catch (Exception | NullPointerException e) {
            h.a(a, e);
        }
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
