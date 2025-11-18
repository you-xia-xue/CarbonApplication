package com.carbon.carbon.pojo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "energy_data")
@Entity
public class EnergyData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "electricity")
    private Integer electricity;
    @Column(name = "water")
    private Integer water;
    @Column(name = "carbon")
    private Integer carbon;
    @Column(name = "office_electricity")
    private Integer officeElectricity;
    @Column(name = "production_water")
    private Integer productionWater;
    @Column(name = "production_electricity")
    private Integer productionElectricity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getElectricity() {
        return electricity;
    }

    public void setElectricity(Integer electricity) {
        this.electricity = electricity;
    }

    public Integer getWater() {
        return water;
    }

    public void setWater(Integer water) {
        this.water = water;
    }

    public Integer getCarbon() {
        return carbon;
    }

    public void setCarbon(Integer carbon) {
        this.carbon = carbon;
    }

    public Integer getOfficeElectricity() {
        return officeElectricity;
    }

    public void setOfficeElectricity(Integer officeElectricity) {
        this.officeElectricity = officeElectricity;
    }

    public Integer getProductionWater() {
        return productionWater;
    }

    public void setProductionWater(Integer productionWater) {
        this.productionWater = productionWater;
    }

    public Integer getProductionElectricity() {
        return productionElectricity;
    }

    public void setProductionElectricity(Integer productionElectricity) {
        this.productionElectricity = productionElectricity;
    }
}
