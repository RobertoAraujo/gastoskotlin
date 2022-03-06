package br.gov.ac.sefaz.treinamento.gerenciamentocontas.controller

import br.gov.ac.sefaz.treinamento.gerenciamentocontas.dto.PessoaInput
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/pessoa")
class PessoaController {

    @PostMapping
    fun create(@RequestBody input: PessoaInput){

    }
}