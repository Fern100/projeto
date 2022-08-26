package classes

class Moto(cor: String, marca: String): Veiculo(cor, marca) {

    override fun testDrive() {

            val text = "Pilotando......"

            for (i in text) {
                print(i)
                Thread.sleep(300) //0.5 secs
            }
        }

    override fun exibir() {
        println("A marca da moto escolhida é: $marca e sua cor é $cor")
    }
}