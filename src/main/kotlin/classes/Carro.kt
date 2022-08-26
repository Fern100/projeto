package classes

class Carro(cor: String, marca: String) : Veiculo(cor, marca) {

    override fun testDrive() {

        val text = "Dirigindo......"

        for (i in text) {
            print(i)
            Thread.sleep(300) //0.5 secs
        }
        println()
        println("|         O teste drive acabou!!           |")
        println("|  Você deseja comprar com o carro? [S/N]  |")
        val resp = readln()

        if (resp == "S" && resp == "s") {
            
        }

    }

    override fun exibir() {
        println("A marca do carro escolhido é: $marca e sua cor é $cor")
    }


}