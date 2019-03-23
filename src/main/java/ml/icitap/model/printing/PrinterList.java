package ml.icitap.model.printing;

import java.util.HashSet;
import java.util.Set;

public class PrinterList {

	private Set<String> printers;
	
	public PrinterList() {
		printers = new HashSet<String>();
	}
	
	public PrinterList(Set<String> printers) {
		this();
		printers.addAll(printers);
	}

	public Set<String> getPrinters() {
		return printers;
	}

	public void setPrinters(Set<String> printers) {
		this.printers = printers;
	}
	
	
}
