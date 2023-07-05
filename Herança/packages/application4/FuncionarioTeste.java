package applications4;

import classes4.Enfermeiro;
import classes4.Medico;
import classes4.MedicoCirurgiao;
import classes4.MedicoClinico;
import classes4.Paciente;

public class FuncionarioTeste {

    public static void main(String[] args) {

        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente();
        Medico medico1 = new Medico("Dra. Anna", 15000.0, "CRM/DF 354689");
        MedicoClinico medicoClinico1 = new MedicoClinico("Dr. Rafel", 25500.0, "CRM/DF 123546", 15.0);
        MedicoCirurgiao medicoCirurgiao1 = new MedicoCirurgiao("Dra. Yasmin", 28900.0, "CRM/DF 995836", 10.0);
        Enfermeiro enfermeiro1 = new Enfermeiro("Wesley", 5600.0, "COREN-DF 356478-ENF");
        
        medicoClinico1.atenderPaciente(paciente1);
        medicoClinico1.fazerExame(paciente1);
        enfermeiro1.darMedicacao(paciente1);
        medicoClinico1.darAlta(paciente1);
        
        medicoCirurgiao1.atenderPaciente(paciente2);
        medicoCirurgiao1.fazerCirurgia(paciente2);
        enfermeiro1.darMedicacao(paciente2);
        medicoCirurgiao1.darAlta(paciente2);
        
    }

}
