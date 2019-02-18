package Polybot.polybot.aspects;

import Polybot.polybot.aspects.WhileAspectWhileAspectProperties;
import java.util.Map;
import polybot.While;

@SuppressWarnings("all")
public class WhileAspectWhileAspectContext {
  public final static WhileAspectWhileAspectContext INSTANCE = new WhileAspectWhileAspectContext();
  
  public static WhileAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Polybot.polybot.aspects.WhileAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<While, WhileAspectWhileAspectProperties> map = new java.util.WeakHashMap<polybot.While, Polybot.polybot.aspects.WhileAspectWhileAspectProperties>();
  
  public Map<While, WhileAspectWhileAspectProperties> getMap() {
    return map;
  }
}
