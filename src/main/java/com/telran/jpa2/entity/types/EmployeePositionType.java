package com.telran.jpa2.entity.types;


public enum EmployeePositionType {

    /**
     * ENUM STRUCTURE
     *
     * Enum elements
     * (semi colon) ;
     *
     * All other class members
     */
    GROUP_LEADER(1),
    TEAM_LEADER(2),
    TEAM_MEMBER(3),
    OUTSOURCE_MEMBER(4)
    ;


    private Integer id;

    EmployeePositionType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static EmployeePositionType getById(Integer id) {
        if (id == null) {
            return null;
        }

        for (EmployeePositionType positionType : values()) {
            if (positionType.getId().equals(id)) {
                return positionType;
            }
        }

        return null;
    }
}
