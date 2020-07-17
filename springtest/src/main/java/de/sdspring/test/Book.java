package de.sdspring.test;

import javax.persistence.Column;

//import java.util.List;

import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlElement;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.PrePersist;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

//import org.hibernate.annotations.Table;
import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.MappedSuperclass;
import lombok.Data;

// id     INTEGER IDENTITY PRIMARY KEY,
//entry_name VARCHAR(40),
//infotext VARCHAR(80),
//**isbn 

@Data
@Entity
@Table(name = "TAB_MASTER")

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@NotNull
	@Column(name = "entry_name")
	private String entry_name;

	@NotNull
	@Column(name = "infotext")
	private String infotext;

	public String getEntry_name() {
		return entry_name;
	}

	public void setEntry_name(String entry_name) {
		this.entry_name = entry_name;
	}

	public String getInfotext() {
		return infotext;
	}

	public void setInfotext(String infotext) {
		this.infotext = infotext;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@NotNull
	@Column(name = "isbn")
	private String isbn;

}
