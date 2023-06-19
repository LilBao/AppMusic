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
public class PlaylistSong extends Song {
    private int trackno;
    private int maplaylist;
    private String mabh;
    
    public int getTrackno() {
        return trackno;
    }

    public void setTrackno(int trackno) {
        this.trackno = trackno;
    }

    public int getMaplaylist() {
        return maplaylist;
    }

    public void setMaplaylist(int maplaylist) {
        this.maplaylist = maplaylist;
    }

    public String getMabh() {
        return mabh;
    }

    public void setMabh(String mabh) {
        this.mabh = mabh;
    }

    public PlaylistSong() {
    }

    public PlaylistSong(String mabh, String tenbh, String theloai, String nguoist, String nguoitb, String anh, String musicpath, Date ngaytao) {
        super(mabh, tenbh, theloai, nguoist, nguoitb, anh, musicpath, ngaytao);
    }

    public PlaylistSong(int trackno, int maplaylist, String mabh) {
        this.trackno = trackno;
        this.maplaylist = maplaylist;
        this.mabh = mabh;
    }

 
}
