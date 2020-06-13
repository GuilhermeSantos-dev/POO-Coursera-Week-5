
public class Respeitoso implements FormatadorNome{

	private String sexo;
	
	public Respeitoso (String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {

		
		//Se o sexo for "Masculino" ou "masculino", recebe o tratamento de "Sr."
		if(sexo == "Masculino" || sexo == "masculino") {
			return "Sr. "+sobrenome;
		}
		
		//Se o sexo for "Feminino" ou "feminino", recebe o tratamento de "Sr."
		if(sexo == "Feminino" || sexo == "feminino") {
			return "Sra. "+sobrenome;
		}
		return null;
	}
	
}
