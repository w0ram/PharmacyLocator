package gestion.packages.entities;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)

public class DateGarde  {

	@EmbeddedId
	private Date_ids di;
	@Temporal(TemporalType.DATE)
	private Date date_Fin;

	@ManyToOne
	@JoinColumn(name = "pharmacie", insertable = false, updatable = false)
	private Pharmacie pharmacie;

	@ManyToOne
	@JoinColumn(name = "garde", insertable = false, updatable = false)
	private Garde garde;

}
