/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Attribute;

import java.time.LocalTime;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class RENT {
   private int rentID,cusID,movieID;
   private String dayTime;
   private int fee;
 

    public int getRentID() {
        return rentID;
    }

    public void setRentID(int rentID) {
        this.rentID = rentID;
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getDayTime() {
        return dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public RENT(int rentID, int cusID, int movieID, String dayTime, int fee) {
        this.rentID = rentID;
        this.cusID = cusID;
        this.movieID = movieID;
        this.dayTime = dayTime;
        this.fee = fee;
    }

   public Object[] toObject(){
        return new Object[]{
            rentID,cusID,movieID,dayTime,fee
        };
    }

}
