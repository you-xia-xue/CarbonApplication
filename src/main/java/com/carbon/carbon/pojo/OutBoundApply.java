package com.carbon.carbon.pojo;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name = "outbound_apply")
@Entity
public class OutBoundApply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "bill_no")
    private Integer billNo;
    @Column(name = "related_bill_no")
    private Integer relatedBillNo;
    @Column(name = "business_type")
    private String businessType;
    @Column(name = "customer")
    private String customer;
    @Column(name = "contract_no")
    private Integer customerNo;
    @Column(name = "contract_type")
    private String customerType;
    @Column(name = "apply_type")
    private String applyType;
    @Column(name = "applicant")
    private String applicant;
    @Column(name = "apply_date")
    private LocalDateTime applyDate;
    @Column(name = "audit_date")
    private LocalDateTime auditDate;
    @Column(name = "audit_status")
    private String auditStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBillNo() {
        return billNo;
    }

    public void setBillNo(Integer billNo) {
        this.billNo = billNo;
    }

    public Integer getRelatedBillNo() {
        return relatedBillNo;
    }

    public void setRelatedBillNo(Integer relatedBillNo) {
        this.relatedBillNo = relatedBillNo;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(Integer customerNo) {
        this.customerNo = customerNo;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public LocalDateTime getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(LocalDateTime applyDate) {
        this.applyDate = applyDate;
    }

    public LocalDateTime getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(LocalDateTime auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

}
