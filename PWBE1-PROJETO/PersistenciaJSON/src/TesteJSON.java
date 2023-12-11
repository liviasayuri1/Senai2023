	
import com.fasterxml.jackson.databind.ObjectMapper;
	
public class TesteJSON {
	
	public static void main(String[] args) {
		
		try {
			ObjectMapper objeto = new ObjectMapper();
			//objeto para utilizar na serialização
			Pessoa pes = new Pessoa ("Abel", 45);
			
			//serializar o obj pes
			String json = objeto.writeValueAsString(pes);
			
			System.out.println("Objeto serializado");
			System.out.println(json);
			
			//desserializar o JSON para o obj pes
			Pessoa desPessoa = objeto.readValue(json, Pessoa.class);
			System.out.println("JSON desserializado para obj pessoa");
			System.out.println("Nome: " + desPessoa.getNome());
			System.out.println("Idade: " + desPessoa.getIdade());
			
			
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
