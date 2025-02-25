package vn.edu.iuh.fit.facultyservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(MajorSemesterSummaryId.class)
public class MajorSemesterSummary {
    @Id
    private int year;
    @Id
    private int semester;
    @Id
    private int majorId;
    private int totalMandatoryCredits;
    private int totalElectiveCredits;
}