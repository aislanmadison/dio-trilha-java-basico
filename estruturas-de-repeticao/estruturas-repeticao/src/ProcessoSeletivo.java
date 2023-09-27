public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        analisarCandidato(1500.0);
        analisarCandidato(2000.0);
        analisarCandidato(3000.0);
    }
    
    static void analisarCandidato(double salarioPretendido){
        
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para contra proposta");
        else {
            System.out.println("Aguardar os próximos candidatos");
        }


    }

        
}
