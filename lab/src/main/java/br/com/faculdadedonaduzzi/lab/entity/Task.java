package br.com.faculdadedonaduzzi.lab.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;
<<<<<<< HEAD

=======
    private String prazo;
>>>>>>> d92058401e4753bf23c36f30af1b3970c7b7c289
}
