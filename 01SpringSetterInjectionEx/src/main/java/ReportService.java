
public class ReportService implements Service{
	
	private ReportGenerator reportGenerator;
	
	public void setReportGenerator(ReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}

	@Override
	public void showReport() {
		reportGenerator.generateReport();		
	}

}
