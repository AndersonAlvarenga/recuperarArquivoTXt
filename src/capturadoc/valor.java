package capturadoc;
import java.text.SimpleDateFormat;
import java.util.Date;
public class valor {
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	private Date data;
	private int valor;
	
	public valor(Date data, int valor) {
		this.data=data;
		this.valor=valor;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getData() {
		return data;
	}
	public void setValor(int valor) {
		this.valor=valor;
	}
	public int getValor() {
		return valor;
	}
	@Override
	public String toString() {
		return formato.format(data) +"-"+valor;
	}

}
