package Polybot.polybot.aspects;

import Polybot.polybot.aspects.GoToAspectGoToAspectProperties;
import java.util.Map;
import polybot.GoTo;

@SuppressWarnings("all")
public class GoToAspectGoToAspectContext {
  public final static GoToAspectGoToAspectContext INSTANCE = new GoToAspectGoToAspectContext();
  
  public static GoToAspectGoToAspectProperties getSelf(final GoTo _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Polybot.polybot.aspects.GoToAspectGoToAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GoTo, GoToAspectGoToAspectProperties> map = new java.util.WeakHashMap<polybot.GoTo, Polybot.polybot.aspects.GoToAspectGoToAspectProperties>();
  
  public Map<GoTo, GoToAspectGoToAspectProperties> getMap() {
    return map;
  }
}
