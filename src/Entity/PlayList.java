/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class PlayList {

    private int maplaylist;
    private int matk;
    private String tieude;
    private int counts;
    private String hinh;
    private String descriptions;
    private Date ngaytao;

    public PlayList() {
    }

    public PlayList(int maplaylist, int matk, String tieude, int counts, String hinh, String descriptions, Date ngaytao) {
        this.maplaylist = maplaylist;
        this.matk = matk;
        this.tieude = tieude;
        this.counts = counts;
        this.hinh = hinh;
        this.descriptions = descriptions;
        this.ngaytao = ngaytao;
    }

    public int getMaplaylist() {
        return maplaylist;
    }

    public void setMaplaylist(int maplaylist) {
        this.maplaylist = maplaylist;
    }

    public int getMatk() {
        return matk;
    }

    public void setMatk(int matk) {
        this.matk = matk;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    
}
