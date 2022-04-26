class ExercicioMain {
}

fun main() {
    var funcionario : Funcionario = Funcionario()
    funcionario.nome = "Rayane"
    funcionario.sobrenome = "Frazao"
    funcionario.horasTrabalhadas = 8
    funcionario.valorPorHora = 30.0

    funcionario.nomeCompleto()
    funcionario.calcularSalario()
    funcionario.incrementaHoras(8)
    funcionario.calcularSalario()

    val listaFuncionarios = ArrayList<Funcionario>()
    listaFuncionarios.add (funcionario)

    funcionario = Funcionario()
    funcionario.nome = "Karoline"
    funcionario.sobrenome = "Costa"
    funcionario.valorPorHora = 40.0
    funcionario.incrementaHoras(30)
    listaFuncionarios.add(funcionario)

    funcionario = Funcionario()
    funcionario.nome = "Keno"
    funcionario.sobrenome = "Costa"
    funcionario.valorPorHora = 50.0
    funcionario. incrementaHoras(40)
    listaFuncionarios.add(funcionario)

    listaFuncionarios.forEach{funcionario->
        funcionario.nomeCompleto()
        println("Horas Trabalhadas: ${funcionario.horasTrabalhadas} ")
        println("Valor por hora: ${funcionario.valorPorHora}")
        funcionario.calcularSalario()
    }






}
