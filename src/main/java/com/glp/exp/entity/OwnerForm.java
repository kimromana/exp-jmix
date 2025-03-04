package com.glp.exp.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum OwnerForm implements EnumClass<String> {

    LEGAL("UR"),
    INDIVIDUAL("FIZ"),
    ENTREPRENEUR("IP");

    private final String id;

    OwnerForm(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static OwnerForm fromId(String id) {
        for (OwnerForm at : OwnerForm.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}