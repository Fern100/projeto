package classes

import java.lang.Exception

 class CadastroCliente(

    val nome: String,
    val telefone: String,
    val email: String,
    val endereco: String

) {
    var marketing: Boolean = false

    init {
        verificarString()
    }
    constructor(nome: String, telefone: String, email: String, endereco: String, marketing: Boolean) : this(
        nome,
        telefone,
        email,
        endereco
    ) {
        this.marketing = marketing
    }
    private fun verificarString () {
         if (nome.isBlank()) {
             throw Exception("Nome é um campo obrigatório.")
         }
     }

 }