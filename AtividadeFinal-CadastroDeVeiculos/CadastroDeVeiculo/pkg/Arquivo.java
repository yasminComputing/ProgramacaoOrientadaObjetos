package pkg;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	private FileOutputStream arquivoS;
	private ObjectOutputStream objS;
	private FileInputStream arquivoE;
	private ObjectInputStream objE;
	
	private List<Veiculo> lista;
	
	
	public Arquivo(){
		lista = new ArrayList<>();
	}

	public void gravarArquivo(List<Veiculo> lista) {
		try{
			
			
			arquivoS = new FileOutputStream("veiculos.ser");
			objS = new ObjectOutputStream(arquivoS);
			
			objS.writeObject(lista);
			objS.close();
			arquivoS.close();
			
			System.out.println("Veículos cadastrados no em veiculos.ser");
	
			
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}
	
	public List<Veiculo> lerArquivo(){
		try {
			arquivoE = new FileInputStream("veiculos.ser");
			objE = new ObjectInputStream(arquivoE);
			
			lista = (List<Veiculo>) objE.readObject();
			
			objE.close();
			arquivoE.close();
				
			
		}catch(IOException  | ClassNotFoundException e) {
			lista = new ArrayList();
		}
		return lista;
	}

	public void atualizar(List<Veiculo> lista){
		try {
			arquivoS= new FileOutputStream("veiculos.ser");
			objS = new ObjectOutputStream(arquivoS);
			
			objS.writeObject(lista);
			
			objS.close();
			arquivoS.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}



