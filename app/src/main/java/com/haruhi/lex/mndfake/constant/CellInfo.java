package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.haruhi.lex.mndfake.mnt.h;

public class CellInfo implements Parcelable {
    public static final Creator<CellInfo> CREATOR = new Creator<CellInfo>() {
        /* renamed from: a */
        public CellInfo createFromParcel(Parcel parcel) {
            return new CellInfo(parcel);
        }

        /* renamed from: a */
        public CellInfo[] newArray(int i) {
            return new CellInfo[i];
        }
    };
    private static final String c = "CellInfo";
    public String a;
    public String b;

    public CellInfo() {
        this.a = "";
        this.b = "";
        this.a = "";
        this.b = "";
    }

    public CellInfo(Parcel parcel) {
        this();
        try {
            this.a = parcel.readString();
            this.b = parcel.readString();
        } catch (Exception | NullPointerException e) {
            h.a(c, e);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
        } catch (Exception | NullPointerException e) {
            h.a(c, e);
        }
    }
}
