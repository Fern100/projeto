import classes.CadastroCliente
import classes.Carro
import classes.Moto

fun main() {

        var marketing1 = false

        try {

        print("Digite o seu nome: ")
        val nome = readln()

        print("Digite o seu telefone: ")
        val telefone = readln()

        print("Digite o seu e-mail: ")
        val email = readln()

        print("Digite o seu endereço: ")
        val endereco = readln()

        print("Gostaria de receber promoções da nossa loja? [S/N]: ")
        val marketing = readln()

        if (marketing == "S") {
            marketing1 = true
        }
        var cliente1 = CadastroCliente(nome, telefone, email, endereco, marketing1)


        println()
        println()
        while (true) {
            println("|        Loja de veículos        |")
            println("|  Selecione o que deseja fazer: |")
            println("| 1 - Comprar Carro              |")
            println("| 2 - Comprar Moto               |")
            println("| 3 - Sair                       |")

            print("Opção: ")
            when (readln().toInt()) {
                1 -> {
                    println()
                    println("Digite a cor do carro: ")
                    val corCarro1 = readln()

                    println("Digite a marca do carro: ")
                    val marcaCarro1 = readln()

                    val carro1 = Carro(corCarro1, marcaCarro1)

                    println("Deseja fazer um test Drive? [S/N]: ")
                    val testDrive = readln()

                    if (testDrive == "S" || testDrive == "s") {
                        carro1.testDrive()
                        break

                    } else {
                        println("Deseja finalizar a compra? [S/N]: ")
                        val resp = readln()
                        if (resp == "S" || resp == "s") {
                            carro1.pagamentoCliente()
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
                        break
                    } else {
                        println("Deseja finalizar a compra? [S/N]")
                        var resp = readln()
                        if (resp == "S" || resp == "s") {
                            moto1.pagamentoCliente()
                            moto1.exibir()
                            println()
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