package com.example.listingview;

import android.os.Parcel;
import android.os.Parcelable;

public class Roles implements Parcelable {

    public String getDeskrip() {
        return deskrip;
    }

    public void setDeskrip(String deskrip) {
        this.deskrip = deskrip;
    }

    private String deskrip;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    private String remarks;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    private String photo;

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.deskrip);
    }

    public Roles() {
    }
    protected Roles(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
        this.deskrip = in.readString();
    }
    public static final Parcelable.Creator<Roles> CREATOR = new Parcelable.Creator<Roles>() {
        @Override
        public Roles createFromParcel(Parcel source) {
            return new Roles(source);
        }
        @Override
        public Roles[] newArray(int size) {
            return new Roles[size];
        }
    };
}
