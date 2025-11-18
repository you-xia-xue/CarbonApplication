package com.carbon.carbon.pojo.DTO;

public class EnergyOverviewDTO {
    private Integer electricityTotal;
    private Integer waterTotal;
    private Integer carbonTotal;
    public EnergyOverviewDTO(Integer electricityTotal, Integer waterTotal, Integer carbonTotal) {
        this.electricityTotal = electricityTotal;
        this.waterTotal = waterTotal;
        this.carbonTotal = carbonTotal;
    }

    public Integer getElectricityTotal() {
        return electricityTotal;
    }

    public void setElectricityTotal(Integer electricityTotal) {
        this.electricityTotal = electricityTotal;
    }

    public Integer getWaterTotal() {
        return waterTotal;
    }

    public void setWaterTotal(Integer waterTotal) {
        this.waterTotal = waterTotal;
    }

    public Integer getCarbonTotal() {
        return carbonTotal;
    }

    public void setCarbonTotal(Integer carbonTotal) {
        this.carbonTotal = carbonTotal;
    }
}
