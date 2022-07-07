package com.company.contract_var1.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@JmixEntity
@Table(name = "LEGAL_PERSON")
@Entity
@PrimaryKeyJoinColumn(name = "lp_id", referencedColumnName = "ID")
public class LegalPerson extends Contractor {

    @NotNull
    @Column(name = "NAME_COMPANY", nullable = false)
    private String nameCompany;

    @Column(name = "INN")
    private String inn;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DIRECTOR")
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }
}