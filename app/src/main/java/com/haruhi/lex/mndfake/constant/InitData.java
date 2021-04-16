package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import com.haruhi.lex.mndfake.mnt.h;

public class InitData implements Parcelable {
    public static final Creator<InitData> CREATOR = new Creator<InitData>() {
        /* renamed from: a */
        public InitData createFromParcel(Parcel parcel) {
            return new InitData(parcel);
        }

        /* renamed from: a */
        public InitData[] newArray(int i) {
            return new InitData[i];
        }
    };
    private final String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private ArrayList<LocationInfo> l;
    private ArrayList<a> m;

    public InitData() {
        this.a = InitData.class.getSimpleName();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }

    public InitData(Parcel parcel) {
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
            this.j = parcel.readString();
            this.k = parcel.readString();
            if (this.l != null) {
                parcel.readTypedList(this.l, LocationInfo.CREATOR);
            }
            if (this.m != null) {
                parcel.readTypedList(this.m, a.g);
            }
        } catch (Exception | NullPointerException e2) {
            h.a(this.a, e2);
        }
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
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            if (this.l != null) {
                parcel.writeTypedList(this.l);
            }
            ArrayList<a> arrayList = this.m;
        } catch (Exception | NullPointerException e2) {
            h.a(this.a, e2);
        }
    }
}
