package org.springframework.samples.petclinic.charity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.NamedEntity;

import java.time.LocalDate;

@Entity
@Table(name = "charity")
public class Charity extends NamedEntity {

	@Column(name = "action_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate actionDate;

	@Column(name = "name")
	private String name;

	@Column(name = "telephone")
	@NotBlank
	@Digits(fraction = 0, integer = 10)
	private String telephone;

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getActionDate() {
		return this.actionDate;
	}

	public void setActionDate(LocalDate birthDate) {
		this.actionDate = birthDate;
	}

}
