package Polybot.polybot.aspects;

import Polybot.polybot.aspects.LeftAspectLeftAspectProperties;
import java.util.Map;
import polybot.Left;

@SuppressWarnings("all")
public class LeftAspectLeftAspectContext {
  public final static LeftAspectLeftAspectContext INSTANCE = new LeftAspectLeftAspectContext();
  
  public static LeftAspectLeftAspectProperties getSelf(final Left _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Polybot.polybot.aspects.LeftAspectLeftAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Left, LeftAspectLeftAspectProperties> map = new java.util.WeakHashMap<polybot.Left, Polybot.polybot.aspects.LeftAspectLeftAspectProperties>();
  
  public Map<Left, LeftAspectLeftAspectProperties> getMap() {
    return map;
  }
}
