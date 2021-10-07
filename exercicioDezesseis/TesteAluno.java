package exercicioDezesseis;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

	public static void main(String[] args) throws AlunoException {
		Aluno aluno1 = new Aluno("Leandro", 10, 9);
		Aluno aluno2 = new Aluno("Gilnei", 8, 9);
		Aluno aluno3 = new Aluno("Rafael", 10, 9);
		Aluno aluno4 = new Aluno("Carol", 9, 8);
		
		List<Aluno> alunoLista = new ArrayList<Aluno>();
		alunoLista.add(aluno1);
		alunoLista.add(aluno2);
		alunoLista.add(aluno3);
		alunoLista.add(aluno4);
		

		for (int i = 0; i < alunoLista.size(); i++) {//não posso usar o FOR EACH, pois preciso de indice pra percorrer.
    		try{
          		Aluno estudante = (Aluno)alunoLista.get(i);
          		System.out.println(aluno1.toString() + " Média: " 
          		+ aluno1.calcularMedia());
         	}
         	catch(AlunoException log){
                	System.err.println(log.getMessage());
         	}
				
		}
	}
}