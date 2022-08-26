import classes.CadastroCliente
import classes.Carro
import classes.Moto

fun main() {

        var marketing1 = false

        try {

        println("Digite o seu nome: ")
        val nome = readln()

        println("Digite o seu telefone: ")
        val telefone = readln()

        println("Digite o seu e-mail: ")
        val email = readln()

        println("Digite o seu endereço: ")
        val endereco = readln()

        println("Gostaria de receber promoções da nossa loja? [S/N]")
        val marketing = readln()

        if (marketing == "S") {
            marketing1 = true
        }
        var cliente1 = CadastroCliente(nome, telefone, email, endereco, marketing1)

        while (true) {
            println("|        Loja de veículos      |")
            println("|Selecione o que deseja fazer: |")
            println("| 1 - Comprar Carro |")
            println("| 2 - Comprar Moto |")
            println("| 3 - Sair |")

            print("| Opção: |")
            println()

            when (readln().toInt()) {
                1 -> {
                    println()
                    println("Digite a cor do carro: ")
                    val corCarro1 = readln()

                    println("Digite a marca do carro: ")
                    val marcaCarro1 = readln()

                    val carro1 = Carro(corCarro1, marcaCarro1)
                    println("Deseja fazer um test Drive? [S/N]")
                    var testDrive = readln()
                    if (testDrive == "S" || testDrive == "s") {
                        carro1.testDrive()
                    } else {
                        println("Deseja finalizar a compra? [S/N]")
                        var resp = readln()
                        if (resp == "S" || resp == "s") {
                            println("O carro foi comprado!!")
                            carro1.exibir()
                            break
                        } else {
                            println("Voltando para o menu")
                        }
                    }
                }

                2 -> {
                    println("Digite a cor da moto: ")
                    val corMoto1 = readln()

                    println("Digite a marca do moto: ")
                    val marcaMoto1 = readln()

                    val moto1 = Moto(corMoto1, marcaMoto1)
                    println("Deseja fazer um test Drive? [S/N]")
                    var testDrive = readln()
                    if (testDrive == "S" || testDrive == "s") {
                        moto1.testDrive()
                    } else {
                        println("Deseja finalizar a compra? [S/N]")
                        var resp = readln()
                        if (resp == "S" || resp == "s") {
                            println("A moto foi comprada!!")
                            moto1.exibir()
                            break
                        } else {
                            println("Voltando para o menu")
                        }
                    }
                }

                3 -> break
            }
        }

        }catch (e: Exception) {
            print(e.message)
        }
}