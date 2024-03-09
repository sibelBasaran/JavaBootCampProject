package com.tobeto.bootcampProject.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="applicants")
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name="user_id")
public class Applicant extends User {

    @Column(name="about")
    private String about;
}
