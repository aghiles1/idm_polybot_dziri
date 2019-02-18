package Polybot.polybot.aspects;

import Polybot.polybot.aspects.ForwardAspectForwardAspectProperties;
import java.util.Map;
import polybot.Forward;

@SuppressWarnings("all")
public class ForwardAspectForwardAspectContext {
  public final static ForwardAspectForwardAspectContext INSTANCE = new ForwardAspectForwardAspectContext();
  
  public static ForwardAspectForwardAspectProperties getSelf(final Forward _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Polybot.polybot.aspects.ForwardAspectForwardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Forward, ForwardAspectForwardAspectProperties> map = new java.util.WeakHashMap<polybot.Forward, Polybot.polybot.aspects.ForwardAspectForwardAspectProperties>();
  
  public Map<Forward, ForwardAspectForwardAspectProperties> getMap() {
    return map;
  }
}
