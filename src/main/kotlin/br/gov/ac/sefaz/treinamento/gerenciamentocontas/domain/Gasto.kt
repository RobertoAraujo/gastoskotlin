package br.gov.ac.sefaz.treinamento.gerenciamentocontas.domain

import br.gov.ac.sefaz.treinamento.gerenciamentocontas.constants.Status
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "Gasto")
class Gasto (
    @Id
    @Column(name = "ID")
    val id: UUID? = UUID.randomUUID(),

    @ManyToOne
    @JoinColumn(name = "PESSOA_ID")
    val pessoa: PessoaEntity,

    @Column(name = "DESCRICAO")
    val descricao: String,

    @Column(name = "DATA_PROCESSAMENTO")
    val dataProcesso: LocalDateTime,

    @Column(name = "VALOR")
    val valor: BigDecimal,

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    val tags: Status,

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "STATUS")
    val status: Status? = Status.ENABLE

    )