package lk.prison_management.asset.offence.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import lk.prison_management.asset.offence.entity.enums.OffenceType;
import lk.prison_management.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("Offence")
public class Offence extends AuditEntity {

    private String name;

    @Enumerated(EnumType.STRING)
    private OffenceType offenceType;
}
