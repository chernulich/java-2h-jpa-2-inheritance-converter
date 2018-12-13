package com.telran.jpa2.entity.types;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class EmployeePositionTypeConverter implements AttributeConverter<EmployeePositionType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(EmployeePositionType attribute) {
        return attribute == null ? null : attribute.getId();
    }

    @Override
    public EmployeePositionType convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : EmployeePositionType.getById(dbData);
    }
}
