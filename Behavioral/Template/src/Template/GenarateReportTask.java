package Template;


public class GenarateReportTask{
    private AuditTrail auditTrail;

    public GenarateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }
    public void execute(){
        auditTrail.record();
        System.out.println("Genarate Report");
    }
}
