package com.example.springboot.domain;

import java.sql.Timestamp;


public class Detail {
    private Long id;
    private Integer severity;
    private String title;
    private String reportUser;
    private Timestamp createDate;
    private Project project;

    public Detail() {
    }

    public Detail(Long id,Integer severity, String title, String reportUser, Timestamp createDate) {
        this.id = id;
        this.severity = severity;
        this.title = title;
        this.reportUser = reportUser;
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReportUser() {
        return reportUser;
    }

    public void setReportUser(String reportUser) {
        this.reportUser = reportUser;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", severity=" + severity +
                ", title='" + title + '\'' +
                ", reportUser='" + reportUser + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}