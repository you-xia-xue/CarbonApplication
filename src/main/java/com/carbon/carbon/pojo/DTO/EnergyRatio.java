package com.carbon.carbon.pojo.DTO;

public class EnergyRatio {
    private Integer officeElectricity;
    private Integer officeWater;
    private Integer productionWater;
    private Integer productionElectricity;
    private Integer totalEnergy;
    public EnergyRatio(Integer officeElectricity, Integer officeWater, Integer productionWater, Integer productionElectricity) {
        int sum = productionElectricity + officeElectricity+officeWater+productionWater;
        this.officeElectricity = (officeElectricity/sum)*100;
        this.officeWater = (officeWater/sum)*100;
        this.productionWater = (productionWater/sum)*100;
        this.productionElectricity = (productionElectricity/sum)*100;
        this.totalEnergy = 100;
    }
    public Integer getOfficeElectricity() {
        return officeElectricity;
    }

    public void setOfficeElectricity(Integer officeElectricity) {
        this.officeElectricity = officeElectricity;
    }

    public Integer getOfficeWater() {
        return officeWater;
    }

    public void setOfficeWater(Integer officeWater) {
        this.officeWater = officeWater;
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

    public Integer getTotalEnergy() {
        return totalEnergy;
    }

    public void setTotalEnergy(Integer totalEnergy) {
        this.totalEnergy = totalEnergy;
    }
}
