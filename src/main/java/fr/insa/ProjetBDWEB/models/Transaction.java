package fr.insa.ProjetBDWEB.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtransaction;
    private String type;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @ManyToOne
    @JsonIgnore
    private Compte comptebenef;
    private Integer montant;
}
