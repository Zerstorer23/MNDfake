package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.haruhi.lex.mndfake.mnt.h;

public class PermissionListItem implements Parcelable {
    public static final Creator<PermissionListItem> CREATOR = new Creator<PermissionListItem>() {
        /* renamed from: a */
        public PermissionListItem createFromParcel(Parcel parcel) {
            return new PermissionListItem(parcel);
        }

        /* renamed from: a */
        public PermissionListItem[] newArray(int i) {
            return new PermissionListItem[i];
        }
    };
    private static final String h = "PermissionListItem";
    public String a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public int g;

    public PermissionListItem() {
        this.a = "";
        this.b = "";
        this.c = -1;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = -1;
        this.a = "";
        this.b = "";
        this.c = -1;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = -1;
    }

    public PermissionListItem(Parcel parcel) {
        this();
        try {
            this.c = parcel.readInt();
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.g = parcel.readInt();
        } catch (Exception | NullPointerException e2) {
            h.a(h, e2);
        }
    }

    public PermissionListItem(String str, String str2, int i, String str3, String str4, String str5, int i2) {
        this.a = "";
        this.b = "";
        this.c = -1;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = -1;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeInt(this.c);
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeInt(this.g);
        } catch (Exception | NullPointerException e2) {
            h.a(h, e2);
        }
    }
}
