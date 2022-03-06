package br.gov.ac.sefaz.treinamento.gerenciamentocontas.dto

import br.gov.ac.sefaz.treinamento.gerenciamentocontas.domain.PessoaEntity
import br.gov.ac.sefaz.treinamento.gerenciamentocontas.enums.Status
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class PessoaInput (
   val id: UUID? = null,
   val nome: String,
   val dataNascimento: String,
   val status: Status
)

fun PessoaInput.toEntity() = PessoaEntity(
    nome = this.nome,
    dataNascimento = this.dataNascimento,
    status = this.status
)
