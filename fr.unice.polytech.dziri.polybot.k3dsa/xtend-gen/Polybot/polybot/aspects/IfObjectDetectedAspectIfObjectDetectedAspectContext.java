package Polybot.polybot.aspects;

import Polybot.polybot.aspects.IfObjectDetectedAspectIfObjectDetectedAspectProperties;
import java.util.Map;
import polybot.IfObjectDetected;

@SuppressWarnings("all")
public class IfObjectDetectedAspectIfObjectDetectedAspectContext {
  public final static IfObjectDetectedAspectIfObjectDetectedAspectContext INSTANCE = new IfObjectDetectedAspectIfObjectDetectedAspectContext();
  
  public static IfObjectDetectedAspectIfObjectDetectedAspectProperties getSelf(final IfObjectDetected _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Polybot.polybot.aspects.IfObjectDetectedAspectIfObjectDetectedAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IfObjectDetected, IfObjectDetectedAspectIfObjectDetectedAspectProperties> map = new java.util.WeakHashMap<polybot.IfObjectDetected, Polybot.polybot.aspects.IfObjectDetectedAspectIfObjectDetectedAspectProperties>();
  
  public Map<IfObjectDetected, IfObjectDetectedAspectIfObjectDetectedAspectProperties> getMap() {
    return map;
  }
}
