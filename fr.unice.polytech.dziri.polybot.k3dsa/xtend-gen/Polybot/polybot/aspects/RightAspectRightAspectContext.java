package Polybot.polybot.aspects;

import Polybot.polybot.aspects.RightAspectRightAspectProperties;
import java.util.Map;
import polybot.Right;

@SuppressWarnings("all")
public class RightAspectRightAspectContext {
  public final static RightAspectRightAspectContext INSTANCE = new RightAspectRightAspectContext();
  
  public static RightAspectRightAspectProperties getSelf(final Right _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Polybot.polybot.aspects.RightAspectRightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Right, RightAspectRightAspectProperties> map = new java.util.WeakHashMap<polybot.Right, Polybot.polybot.aspects.RightAspectRightAspectProperties>();
  
  public Map<Right, RightAspectRightAspectProperties> getMap() {
    return map;
  }
}
