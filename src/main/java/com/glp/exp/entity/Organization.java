package com.glp.exp.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "ORGANIZATION", indexes = {
        @Index(name = "IDX_ORGANIZATION_COUNTRY", columnList = "COUNTRY_ID")
})
@Entity
public class Organization {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @InstanceName
    @Column(name = "NAME")
    private String name;
    @Column(name = "GUID_1C", length = 100)
    private String guid_1c;
    @Column(name = "FULL_NAME")
    private String full_name;
    @Column(name = "BIN_IIN", length = 15)
    private String bin_iin;
    @Column(name = "FORM_TYPE")
    private String form_type;
    @Column(name = "KBE", length = 4)
    private String kbe;
    @Column(name = "LEGAL_ADDRESS")
    private String legal_address;
    @JoinColumn(name = "COUNTRY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getGuid_1c() {
        return guid_1c;
    }

    public void setGuid_1c(String guid_1c) {
        this.guid_1c = guid_1c;
    }

    public String getLegal_address() {
        return legal_address;
    }

    public void setLegal_address(String legal_address) {
        this.legal_address = legal_address;
    }

    public String getKbe() {
        return kbe;
    }

    public void setKbe(String kbe) {
        this.kbe = kbe;
    }

    public OwnerForm getForm_type() {
        return form_type == null ? null : OwnerForm.fromId(form_type);
    }

    public void setForm_type(OwnerForm form_type) {
        this.form_type = form_type == null ? null : form_type.getId();
    }

    public String getBin_iin() {
        return bin_iin;
    }

    public void setBin_iin(String bin_iin) {
        this.bin_iin = bin_iin;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}