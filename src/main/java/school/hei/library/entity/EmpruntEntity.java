package school.hei.library.entity;

import java.time.LocalDate;

public class EmpruntEntity {
      private Long id;
    private MemberEntity membre;
    private BookEntity livre;
    private LocalDate dateEmprunt;
    private LocalDate dateRetourPrevue;
    private LocalDate dateRetourEffective;
    private String statut;
}
