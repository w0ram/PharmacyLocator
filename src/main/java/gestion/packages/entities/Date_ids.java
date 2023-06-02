package gestion.packages.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)

public class Date_ids implements Serializable {

	private int pharmacie;
	private int garde;

	@Temporal(TemporalType.DATE)
	private Date date_debut;

}