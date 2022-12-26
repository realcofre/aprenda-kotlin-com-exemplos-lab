// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

enum class Area { Kotlin, Java, Javascript, Flutter }

class Usuario(var nome: String, var email: String, var matricula: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, var area: Area, var nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {

    val usuarioJoao = Usuario("João", "joao@email.com", "abc123")
    val usuarioMaria = Usuario("Maria", "maria@email.com", "abc234")
    val usuarioAna = Usuario("Ana", "ana@email.com", "abc345")

    val introducaoAoKotlin = ConteudoEducacional("Introdução ao Kotlin", 60, Area.Kotlin, Nivel.BASICO)
    val ooEmKotlin = ConteudoEducacional("Orientação a Objetos em Kotlin", 180, Area.Kotlin, Nivel.BASICO)
    val operadoresKotlin = ConteudoEducacional("Operadores em Kotlin", 50, Area.Kotlin, Nivel.BASICO)

    val introducaoAoJava = ConteudoEducacional("Introdução ao Java", 40, Area.Java, Nivel.BASICO)
    val ooEmJava = ConteudoEducacional("Orientação a Objetos em Java", 180, Area.Java, Nivel.BASICO)
    val operadoresJava = ConteudoEducacional("Operadores em Java", 50, Area.Java, Nivel.BASICO)
    val springBoot = ConteudoEducacional("Spring Boot", 100, Area.Java, Nivel.INTERMEDIARIO)

    fun getConteudosKotlin(): List<ConteudoEducacional> {
        return listOf(
            introducaoAoKotlin,
            ooEmKotlin,
            operadoresKotlin
        )
    }

    fun getConteudosJava(): List<ConteudoEducacional> {
        return listOf(
            introducaoAoJava,
            ooEmJava,
            operadoresJava,
            springBoot
        )
    }

    var formacaoKotlin = Formacao("Formação em Kotlin", getConteudosKotlin(), Nivel.BASICO)
    var formacaoJava = Formacao("Formação em Java", getConteudosJava(), Nivel.INTERMEDIARIO)

    formacaoKotlin.matricular(usuarioJoao)
    formacaoKotlin.matricular(usuarioMaria)
    formacaoKotlin.matricular(usuarioAna)

    formacaoJava.matricular(usuarioAna)



}


