/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;

import java.util.Objects;

/**
 *
 * @author AN515-45
 */
public class SinhVien {
    private String maSV;
    private String hoTenSV;
    private int hocBong;

    public SinhVien() {
    }

    public SinhVien(String maSV) {
        this.maSV = maSV;
    }
    
    public SinhVien(String maSV, String hoTenSV, int hocBong) {
        this.maSV = maSV;
        this.hoTenSV = hoTenSV;
        this.hocBong = hocBong;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTenSV() {
        return hoTenSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }

    public int getHocBong() {
        return hocBong;
    }

    public void setHocBong(int hocBong) {
        this.hocBong = hocBong;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTenSV=" + hoTenSV + ", hocBong=" + hocBong + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.maSV);
        hash = 29 * hash + Objects.hashCode(this.hoTenSV);
        hash = 29 * hash + this.hocBong;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        if (!Objects.equals(this.maSV, other.maSV)) {
            return false;
        }
        return true;
    }

    
    
    
}
