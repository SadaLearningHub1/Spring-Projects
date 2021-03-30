
public class ReporterService implements Service {
	private ReportGenerator generator;
	public void setGenerator(ReportGenerator generator) {
		this.generator = generator;
	}
	public void showReport() {
		generator.generateReport();
	}

}
