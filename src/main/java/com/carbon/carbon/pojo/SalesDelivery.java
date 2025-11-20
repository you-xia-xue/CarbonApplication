package com.carbon.carbon.pojo;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = "sales_delivery")
@Entity
public class SalesDelivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "delivery_no")
    private String deliveryNo;
    @Column(name = "customer_no")
    private String customerNo;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "delivery_method")
    private String deliveryMethod;
    @Column(name = "delivery_date")
    private LocalDate deliveryDate;
    @Column(name = "delivery_address")
    private String deliveryAddress;
    @Column(name = "contact_person")
    private String contactPerson;
    @Column(name = "contact_phone")
    private String contactPhone;
    @Column(name = "out_stock_status")
    private String outStockStatus;
    @Column(name = "create_time")
    private LocalDateTime createTime;

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getOutStockStatus() {
        return outStockStatus;
    }

    public void setOutStockStatus(String outStockStatus) {
        this.outStockStatus = outStockStatus;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
