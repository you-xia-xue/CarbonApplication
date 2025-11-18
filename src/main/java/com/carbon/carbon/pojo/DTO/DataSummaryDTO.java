package com.carbon.carbon.pojo.DTO;

import com.carbon.carbon.pojo.EnergyData;

import java.util.List;

public class DataSummaryDTO {
    private Integer annualSales;
    private Integer monthlySales;
    private Integer todaySales;
    private Integer annualCarbon;
    private Integer monthlyCarbon;
    private Integer todayCarbon;
    private List<EnergyData> CarbonRanking;
    public DataSummaryDTO(
            Integer annualSales,
            Integer monthlySales,
            Integer todaySales,
            Integer annualCarbon,
            Integer monthlyCarbon,
            Integer todayCarbon,
            List<EnergyData> CarbonRanking) {
        this.annualSales = annualSales;
        this.monthlySales = monthlySales;
        this.todaySales = todaySales;
        this.annualCarbon = annualCarbon;
        this.monthlyCarbon = monthlyCarbon;
        this.todayCarbon = todayCarbon;
        this.CarbonRanking = CarbonRanking;
    }

    public Integer getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(Integer annualSales) {
        this.annualSales = annualSales;
    }

    public Integer getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(Integer monthlySales) {
        this.monthlySales = monthlySales;
    }

    public Integer getTodaySales() {
        return todaySales;
    }

    public void setTodaySales(Integer todaySales) {
        this.todaySales = todaySales;
    }

    public Integer getAnnualCarbon() {
        return annualCarbon;
    }

    public void setAnnualCarbon(Integer annualCarbon) {
        this.annualCarbon = annualCarbon;
    }

    public Integer getMonthlyCarbon() {
        return monthlyCarbon;
    }

    public void setMonthlyCarbon(Integer monthlyCarbon) {
        this.monthlyCarbon = monthlyCarbon;
    }

    public Integer getTodayCarbon() {
        return todayCarbon;
    }

    public void setTodayCarbon(Integer todayCarbon) {
        this.todayCarbon = todayCarbon;
    }

    public List<EnergyData> getCarbonRanking() {
        return CarbonRanking;
    }

    public void setCarbonRanking(List<EnergyData> carbonRanking) {
        CarbonRanking = carbonRanking;
    }
}
