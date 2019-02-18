package Polybot.polybot.aspects;

import Polybot.polybot.aspects.IfObstacleDetectedAspectIfObstacleDetectedAspectProperties;
import java.util.Map;
import polybot.IfObstacleDetected;

@SuppressWarnings("all")
public class IfObstacleDetectedAspectIfObstacleDetectedAspectContext {
  public final static IfObstacleDetectedAspectIfObstacleDetectedAspectContext INSTANCE = new IfObstacleDetectedAspectIfObstacleDetectedAspectContext();
  
  public static IfObstacleDetectedAspectIfObstacleDetectedAspectProperties getSelf(final IfObstacleDetected _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Polybot.polybot.aspects.IfObstacleDetectedAspectIfObstacleDetectedAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IfObstacleDetected, IfObstacleDetectedAspectIfObstacleDetectedAspectProperties> map = new java.util.WeakHashMap<polybot.IfObstacleDetected, Polybot.polybot.aspects.IfObstacleDetectedAspectIfObstacleDetectedAspectProperties>();
  
  public Map<IfObstacleDetected, IfObstacleDetectedAspectIfObstacleDetectedAspectProperties> getMap() {
    return map;
  }
}
