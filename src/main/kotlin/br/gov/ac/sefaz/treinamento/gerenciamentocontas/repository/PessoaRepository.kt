package br.gov.ac.sefaz.treinamento.gerenciamentocontas.repository

import br.gov.ac.sefaz.treinamento.gerenciamentocontas.domain.PessoaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PessoaRepository : JpaRepository<PessoaEntity, UUID>{
}