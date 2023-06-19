package Template;

public abstract class Task {
    private AuditTrail auditTrail;
    public Task(){
        auditTrail = new AuditTrail();
    }
    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        doexcute();
    }
    protected abstract void doexcute();
}
