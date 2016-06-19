import java.util.HashMap;
import java.util.Map;

public class ServantWage {
    private Map<String, Servant> servantMap = new HashMap<>();
    private Map<String, Master> masterMap = new HashMap<>();

    private Servant selectedServant;
    private Master targetMaster;

    public void addServant(Servant servant) {
        if (!servantMap.containsKey(servant.getServantName()))
            servantMap.put(servant.getServantName(), servant);
    }

    public void addMaster(Master master) {
        if (!masterMap.containsKey(master.getMasterName()))
            masterMap.put(master.getMasterName(), master);
    }

    public ServantWage select(String servantName) {
        selectedServant = servantMap.get(servantName);
        return this;
    }

    public ServantWage match(String masterName) {
        targetMaster = masterMap.get(masterName);
        return this;
    }

    public int calcWage(int month) {
        return targetMaster.pay(selectedServant.getSalary(month), selectedServant.getBonus(month));
    }
}
