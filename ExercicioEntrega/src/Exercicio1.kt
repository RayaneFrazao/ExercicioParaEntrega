class Funcionario {
    var nome : String = ""
    var sobrenome : String = ""
    var horasTrabalhadas : Int = 0
    var valorPorHora : Double = 0.0

    fun nomeCompleto (){
        println("NomeCompleto = $nome $sobrenome")
    }
    fun calcularSalario(){
        println("Salario = " + horasTrabalhadas * valorPorHora)
    }
    fun incrementaHoras(valor : Int){
        horasTrabalhadas += valor
    }
}


