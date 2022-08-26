package classes

class Moto(cor: String, marca: String) : Veiculo(cor, marca) {

    override fun testDrive() {

        val text = "Pilotando......"

        for (i in text) {
            print(i)
            Thread.sleep(300) //0.5 secs
        }

        println()

        // Funçao de acelerar o carro , dependendo da resposta do usuario
        print("Você deseja testar a velocidade da moto? [S/N]: ")
        val acelera = readln()

        println()

        if (acelera == "S" || acelera == "s") {

            val acelera = "Empinan.... Acelerando...."
            for (i in acelera) {
                print(i)
                Thread.sleep(300) //0.5 secs


            }
            println()

            println("10 minutos depois...")

            println()
            val textParando = "Parando......"

            for (i in textParando) {
                print(i)
                Thread.sleep(300) //0.5 secs
            }

        } else {
            val text = "Parando......"
            for (i in text) {
                print(i)
                Thread.sleep(300) //0.5 secs
            }
        }

        // Depois de terminar as funções entra na parte do pagamento , perguntando se o usuario
        // deseja continuar a compra ou voltar para o menu...

        println()
        println("|         O teste drive acabou!!          |")
        println("|    Você deseja comprar a moto? [S/N]    |")
        print("Opc: ")
        val resp = readln()


        if (resp == "S" || resp == "s") {
            pagamentoCliente()
        }

    }


    fun pagamentoCliente() {

        var debito: Double = 0.0
        var credito: Double = 0.0
        var pix: Double = 0.0

        println("Qual a forma de pagamento")
        println("1 - Cartão de crédito")
        println("2 - Cartão de débito")
        println("3 - Pix")
        println("4 - Cancelar")
        var opcao = readLine()!!.toInt()

        when (opcao) {
            1 -> {
                parcelas()
            }

            2 -> {
                debito()
            }

            3 -> {
                pix()
            }
        }
    }

    fun parcelas() {
        print("Quer parcelar? [S/N]: ")
        var resp = readln()

        if (resp == "S" || resp == "s") {
            print("Em quantas vezes? ")
            val respVezes = readln()

            println("Pagamento Confirmado de R$185.000,00 em $respVezes vezes no crédito")
            println()

        } else {
            println("Pagamento Confirmado de R$185.000,00 no crédito")
            println()
        }
    }
    fun debito() {
        print("Pagamento Confirmado de R$185.000,00 no débito.")
        println()
    }

    fun pix() {
        print("Pagamento Confirmado de R$185.000,00 no pix.")
        println()
    }

    override fun exibir() {
        println("A marca da moto escolhida é: $marca e sua cor é $cor")
    }
}