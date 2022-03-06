package br.gov.ac.sefaz.treinamento.gerenciamentocontas.domain

import br.gov.ac.sefaz.treinamento.gerenciamentocontas.dto.PessoaInput
import br.gov.ac.sefaz.treinamento.gerenciamentocontas.enums.Status
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "PESSOA")
class PessoaEntity(
    @Id
    @Column(name = "ID")
    val id: UUID? = UUID.randomUUID(),

    @Column(name = "NOME")
    val nome: String,

    @Column(name = "DATA_NASCIMENTO")
    val dataNascimento: LocalDateTime,

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "STATUS")
    val status: Status
)
