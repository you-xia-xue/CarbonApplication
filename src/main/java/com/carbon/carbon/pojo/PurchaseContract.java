package com.carbon.carbon.pojo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "purchase_contract")
@Entity
public class PurchaseContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "contract_no")
    private Integer contractNo;
    @Column(name = "apply_no")
    private Integer applyNo;
    @Column(name = "supplier")
    private String supplier;
    @Column(name = "contact_person")
    private String contactPerson;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "delivery_method")
    private String deliveryMethod;
    @Column(name = "sign_date")
    private LocalDate signDate;
    @Column(name = "applicant")
    private String applicant;
    @Column(name = "apply_time")
    private LocalDate applyTime;
    @Column(name = "apply_status")
    private String applyStatus;
    @Column(name = "auditor")
    private String auditor;
    @Column(name = "audit_time")
    private LocalDate auditTime;
    @Column(name = "audit_status")
    private String auditStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContractNo() {
        return contractNo;
    }

    public void setContractNo(Integer contractNo) {
        this.contractNo = contractNo;
    }

    public Integer getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(Integer applyNo) {
        this.applyNo = applyNo;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public LocalDate getSignDate() {
        return signDate;
    }

    public void setSignDate(LocalDate signDate) {
        this.signDate = signDate;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public LocalDate getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(LocalDate applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public LocalDate getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(LocalDate auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }
}
