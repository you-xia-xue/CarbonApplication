package com.carbon.carbon.pojo;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name="purchase_plan")
@Entity
public class PurchasePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "bill_no")
    private Integer billNo;
    @Column(name = "applicant")
    private String applicant;
    @Column(name = "apply_date")
    private LocalDateTime applyDate;
    @Column(name = "apply_status")
    private String applyStatus;
    @Column(name = "auditor")
    private String auditor;
    @Column(name = "audit_date")
    private LocalDateTime auditDate;
    @Column(name = "audit_status")
    private String auditStatus;

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public LocalDateTime getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(LocalDateTime auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    public LocalDateTime getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(LocalDateTime applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public Integer getBillNo() {
        return billNo;
    }

    public void setBillNo(Integer billNo) {
        this.billNo = billNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
