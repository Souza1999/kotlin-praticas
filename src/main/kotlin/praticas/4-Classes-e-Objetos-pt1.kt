
// Questão 1
class Produto {
    var nome: String
    var preco: Double

    // Construtor padrão
    constructor() {
        this.nome = "Produtozinho"
        this.preco = 0.0
    }

    // Construtor com parâmetros
    constructor(nome: String, preco: Double) {
        this.nome = nome
        this.preco = preco
    }
}

fun main() {
    val produto1 = Produto()
    val produto2 = Produto("Cadeira", 150.0)

    println("Produto 1: ${produto1.nome}, Preço: ${produto1.preco}")
    println("Produto 2: ${produto2.nome}, Preço: ${produto2.preco}")
}


// Questão 2
class Cliente {
    var nome: String = ""
    private var idade: Int = 0

    fun setIdade(idade: Int) {
        if (idade >= 0) {
            this.idade = idade
        } else {
            println("Idade inválida.")
        }
    }

    fun mostrarIdade(): Int {
        return idade
    }
}

//fun main() {
//    val cliente = Cliente()
//    cliente.nome = "João"
//    cliente.setIdade(25)
//
//    println("Nome: ${cliente.nome}, Idade: ${cliente.mostrarIdade()}")
//}


// Questão 3
abstract class Personagem {
    abstract fun atacar()
}

class Guerreiro : Personagem() {
    override fun atacar() {
        println("Guerreiro atacando com espada!")
    }
}

class Mago : Personagem() {
    override fun atacar() {
        println("Mago lançando uma bola de fogo!")
    }
}

//fun main() {
//    val guerreiro = Guerreiro()
//    val mago = Mago()
//
//    guerreiro.atacar()
//    mago.atacar()
//}


// Questão 4
interface FormaGeometrica {
    fun calcularArea(): Double
}

class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return altura * largura
    }
}

class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return Math.PI * raio * raio
    }
}

//fun main() {
//    val retangulo = Retangulo(10.0, 5.0)
//    val circulo = Circulo(7.0)
//
//    println("Área do Retângulo: ${retangulo.calcularArea()}")
//    println("Área do Círculo: ${circulo.calcularArea()}")
//}


// Questão 5
class ContaBancaria {
    var numeroConta: String = ""
    var nomeTitular: String = ""
        get() = field.capitalize()
        set(value) {
            field = value.lowercase()
        }

    private var saldo: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Saldo não pode ser negativo.")
            }
        }

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun getSaldo(): Double {
        return saldo
    }
}

//fun main() {
//    val conta = ContaBancaria()
//    conta.numeroConta = "12345"
//    conta.nomeTitular = "joão silva"
//    conta.depositar(100.0)
//
//    println("Conta: ${conta.numeroConta}, Titular: ${conta.nomeTitular}, Saldo: R$ ${conta.getSaldo()}")
//
//    conta.nomeTitular = "Maria Souza"
//    conta.depositar(-50.0)  // Tentativa de depósito negativo (deve ser bloqueado)
//
//    println("Conta: ${conta.numeroConta}, Titular: ${conta.nomeTitular}, Saldo: R$ ${conta.getSaldo()}")
//}
