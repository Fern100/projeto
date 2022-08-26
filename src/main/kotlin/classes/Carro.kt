package classes

class Carro(cor: String, marca: String) : Veiculo(cor, marca) {

    override fun testDrive() {

        val text = "Dirigindo......"

        for (i in text) {
            print(i)
            Thread.sleep(300) //0.5 secs
        }

        println()

        // Funçao de acelerar o carro , dependendo da resposta do usuario
        print("Você deseja testar a velocidade do carro? [S/N]: ")
        val acelera = readln()

        println()

        if (acelera == "S" || acelera == "s") {

            val text = "Acelerando...."
            for (i in text) {
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
        println("|         O teste drive acabou!!           |")
        println("|  Você deseja comprar com o carro? [S/N]  |")
        print("Opc: ")
        val resp = readln()


        if (resp == "S" || resp == "s") {

        }

    }

    override fun exibir() {
        println("A marca do carro escolhido é: $marca e sua cor é $cor")
    }


}