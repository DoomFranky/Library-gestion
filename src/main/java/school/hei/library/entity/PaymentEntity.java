package school.hei.library.entity;

import java.time.LocalDate;

public class PaymentEntity {
       private Long id;
    private MemberEntity membre;
    private double montant;
    private LocalDate datePaiement;
    private String modePaiement;
}
