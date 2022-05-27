package com.example.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "qualification")
public class Qualification {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "quali_id")
	private int qualiId;

	@Column(name = "quali_name")
	private String qualiName;

	@Column(name = "year_of_passout")
	private Date yearOfPassout;

	@Column(name = "marks")
	private double marks;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

}