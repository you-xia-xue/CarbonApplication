package com.carbon.carbon.pojo;

import jakarta.persistence.*;

@Table(name = "production_data")
@Entity
public class ProductionData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "model")
    private String model;
    @Column(name = "specification")
    private String specification;
    @Column(name = "unit")
    private String unit;
    @Column(name = "stock")
    private Integer stock;
    @Column(name = "produced")
    private Integer produced;
    @Column(name = "outsourced")
    private Integer outsourced;
    @Column(name = "carbon_emission")
    private String carbonEmission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getProduced() {
        return produced;
    }

    public void setProduced(Integer produced) {
        this.produced = produced;
    }

    public Integer getOutsourced() {
        return outsourced;
    }

    public void setOutsourced(Integer outsourced) {
        this.outsourced = outsourced;
    }

    public String getCarbonEmission() {
        return carbonEmission;
    }

    public void setCarbonEmission(String carbonEmission) {
        this.carbonEmission = carbonEmission;
    }
}
