package com.haruhi.lex.mndfake.constant;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.haruhi.lex.mndfake.mnt.h;

public class LocationInfo implements Parcelable {
    public static final Creator<LocationInfo> CREATOR = new Creator<LocationInfo>() {
        /* renamed from: a */
        public LocationInfo createFromParcel(Parcel parcel) {
            return new LocationInfo(parcel);
        }

        /* renamed from: a */
        public LocationInfo[] newArray(int i) {
            return new LocationInfo[i];
        }
    };
    private static final String h = "LocationInfo";
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public float g;

    public LocationInfo() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = BitmapDescriptorFactory.HUE_RED;
    }

    public LocationInfo(Parcel parcel) {
        this();
        try {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readFloat();
        } catch (Exception | NullPointerException e2) {
            h.a(h, e2);
        }
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
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeFloat(this.g);
        } catch (Exception | NullPointerException e2) {
            h.a(h, e2);
        }
    }
}
